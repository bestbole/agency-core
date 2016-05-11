package com.house.agency.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.house.agency.dao.IConfigureDao;
import com.house.agency.dao.IImageDao;
import com.house.agency.data.ImageData;
import com.house.agency.entity.Image;
import com.house.agency.page.IPage;
import com.house.agency.param.ImageParam;
import com.house.agency.param.ImageQueryParam;
import com.house.agency.service.IImageService;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.FileUtil;
import com.myself.common.utils.ImageUtil;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("imageService")
public class ImageServiceImpl implements IImageService {

	private final static Logger logger = LoggerFactory
			.getLogger(ImageServiceImpl.class);
	
	@Autowired
	private IImageDao imageDao;
	
	@Autowired
	private IConfigureDao configureDao;
	
	@Override
	public void save(Image param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setSort(0);
		param.setStatus("1");
		param.setCreateTime(new Date());
		int count = imageDao.save(param);
		if (count < 1) {
			throw new ServiceException("新增失败");
		}
	}

	@Override
	public void update(Image param) {
		param.setUpdateTime(new Date());
		int count = imageDao.update(param);
		if (count < 1) {
			throw new ServiceException("修改失败");
		}
	}

	@Override
	public void deleteById(String id) {
		int count = imageDao.deleteById(id);
		if (count < 1) {
			throw new ServiceException("删除失败");
		}
	}

	@Override
	public Image getDataById(String id) {
		return imageDao.getDataById(id);
	}

	@Override
	public IPage<Image> query(ImageQueryParam param, int page, int rows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Image> queryDataByFid(ImageQueryParam param) {
		return imageDao.queryDataByFid(param);
	}

	@Override
	public List<Image> queryData(ImageQueryParam param) {
		return imageDao.queryData(param);
	}

	@Override
	@Transactional
	public Image upload(ImageParam param, Map<String, File> map, String path) {
		String title = null;
		File file = null;
		for(Map.Entry<String, File> entry: map.entrySet()) {
			title = entry.getKey();
			file = entry.getValue();
			break;
		}
		
		Image image = new Image();
		image.setForeignId(param.getForeignId());
		image.setUserId(param.getUserId());
		image.setType(param.getType());
		image.setTitle(title);
		image.setUrl(param.getFolder() + "/" + file.getName());
		save(image);
		boolean flag = FileUtil.move(file, path + "/" +  param.getFolder());
		if (!flag) {
			throw new ServiceException("文件上传失败");
		}
		return image;
	}

	@Override
	@Transactional
	public void trash(String id, String path) {
		Image image = imageDao.getDataById(id);
		if (image != null) {
			deleteById(id);
			boolean flag = FileUtil.deleteFile(path + "/" + image.getUrl());
			if (!flag) {
				throw new ServiceException("文件删除失败");
			}
		} else {
			throw new ServiceException("文件删除失败");
		}
	}

	@Override
	public List<ImageData> queryDataByFuid(ImageQueryParam param) {
		String path = configureDao.getValueByKey("upload_folder");
		String width = configureDao.getValueByKey("home_image_w");
		String height = configureDao.getValueByKey("home_image_h");
		
		List<ImageData> images = imageDao.queryDataByFuid(param);
		for (int i = 0; i < images.size(); i++) {
			ImageData image = images.get(i);
			String url = image.getUrl();
			String thumb = null;
			try {
				thumb = ImageUtil.creMinImage(url, Integer.parseInt(width), Integer.parseInt(height), path);
			} catch (Exception e) {
				logger.info("生成图片出错");
			}
			System.out.println(thumb);
			image.setThumb(thumb);
			images.set(i, image);
		}
		return images;
	}

	@Override
	public List<ImageData> queryHomeDataByFuid(ImageQueryParam param) {
		String path = configureDao.getValueByKey("upload_folder");
		String width = configureDao.getValueByKey("home_image_w");
		String height = configureDao.getValueByKey("home_image_h");
		
		List<ImageData> images = imageDao.queryHomeDataByFuid(param);
		for (int i = 0; i < images.size(); i++) {
			ImageData image = images.get(i);
			String url = image.getUrl();
			String thumb = null;
			try {
				thumb = ImageUtil.creMinImage(url, Integer.parseInt(width), Integer.parseInt(height), path);
			} catch (Exception e) {
				logger.info("生成图片出错");
			}
			image.setThumb(thumb);
			images.set(i, image);
		}
		return images;
	}
}
