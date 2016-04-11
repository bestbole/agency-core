package com.house.agency.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.IImageDao;
import com.house.agency.entity.Image;
import com.house.agency.mapper.IImageMapper;
import com.house.agency.param.ImageQueryParam;

@Repository
public class ImageDaoImpl extends BaseDao<IImageMapper> implements IImageDao {

	@Override
	public int save(Image param) {
		IImageMapper mapper = getMapper(IImageMapper.class);
		return mapper.save(param);
	}

	@Override
	public int update(Image param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Image getDataById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(ImageQueryParam param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Image> query(ImageQueryParam param, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Image> listData(ImageQueryParam param) {
		IImageMapper mapper = getMapper(IImageMapper.class);
		return mapper.listData(param);
	}

	@Override
	public List<Image> queryData(ImageQueryParam param) {
		IImageMapper mapper = getMapper(IImageMapper.class);
		return mapper.queryData(param);
	}

}
