package com.house.agency.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.house.agency.dao.IBuildingImageDao;
import com.house.agency.entity.BuildingImage;
import com.house.agency.page.IPage;
import com.house.agency.param.BuildingImageQueryParam;
import com.house.agency.service.IBuildingImageService;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.FileUtil;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("buildingImageService")
public class BuildingImageServiceImpl implements IBuildingImageService {

	@Autowired
	private IBuildingImageDao buildingImageDao;	

	@Override
	public void save(BuildingImage param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		int count = buildingImageDao.save(param);
		if (count < 1) {
			throw new ServiceException("新增失败");
		}
	}

	@Override
	public void update(BuildingImage param) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(String id) {
		int count = buildingImageDao.deleteById(id);
		if (count < 1) {
			throw new ServiceException("删除失败");
		}
	}

	@Override
	public BuildingImage getDataById(String id) {
		return buildingImageDao.getDataById(id);
	}

	@Override
	public IPage<BuildingImage> query(BuildingImageQueryParam param, int page,
			int rows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void upload(BuildingImage param, Map<String, File> map, String path) {
		String title = null;
		File file = null;
		for(Map.Entry<String, File> entry: map.entrySet()) {
			title = entry.getKey();
			file = entry.getValue();
			break;
		}
		param.setTitle(title);
		param.setUrl(file.getName());
		save(param);
		boolean flag = FileUtil.move(file, path);
		if (!flag) {
			throw new ServiceException("文件上传失败");
		}
	}

	@Override
	public List<BuildingImage> list(BuildingImageQueryParam param) {
		return buildingImageDao.list(param);
	}

	@Override
	@Transactional
	public void delete(String id, String path) {
		BuildingImage data = getDataById(id);
		deleteById(id);
		boolean flag = FileUtil.deleteFile(path + "/" + data.getUrl());
		if (!flag) {
			throw new ServiceException("文件删除失败");
		}
	}
}
