package com.house.agency.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.agency.dao.IImageDao;
import com.house.agency.entity.Image;
import com.house.agency.page.IPage;
import com.house.agency.param.ImageQueryParam;
import com.house.agency.service.IImageService;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("imageService")
public class ImageServiceImpl implements IImageService {

	@Autowired
	private IImageDao imageDao;
	
	@Override
	public void save(Image param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		int count = imageDao.save(param);
		if (count < 1) {
			throw new ServiceException("新增失败");
		}
	}

	@Override
	public void update(Image param) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Image getDataById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPage<Image> query(ImageQueryParam param, int page, int rows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Image> listData(ImageQueryParam param) {
		return imageDao.listData(param);
	}

	@Override
	public List<Image> queryData(ImageQueryParam param) {
		return imageDao.queryData(param);
	}

}
