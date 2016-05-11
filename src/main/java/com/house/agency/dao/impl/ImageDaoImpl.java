package com.house.agency.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.IImageDao;
import com.house.agency.data.ImageData;
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
		IImageMapper mapper = getMapper(IImageMapper.class);
		return mapper.update(param);
	}

	@Override
	public int deleteById(String id) {
		IImageMapper mapper = getMapper(IImageMapper.class);
		return mapper.deleteById(id);
	}

	@Override
	public Image getDataById(String id) {
		IImageMapper mapper = getMapper(IImageMapper.class);
		return mapper.getDataById(id);
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
	public List<Image> queryDataByFid(ImageQueryParam param) {
		IImageMapper mapper = getMapper(IImageMapper.class);
		return mapper.queryDataByFid(param);
	}

	@Override
	public List<Image> queryData(ImageQueryParam param) {
		IImageMapper mapper = getMapper(IImageMapper.class);
		return mapper.queryData(param);
	}

	@Override
	public List<ImageData> queryDataByFuid(ImageQueryParam param) {
		IImageMapper mapper = getMapper(IImageMapper.class);
		return mapper.queryDataByFuid(param);
	}

	@Override
	public List<ImageData> queryHomeDataByFuid(ImageQueryParam param) {
		IImageMapper mapper = getMapper(IImageMapper.class);
		return mapper.queryHomeDataByFuid(param);
	}

	@Override
	public int countDataByFid(ImageQueryParam param) {
		IImageMapper mapper = getMapper(IImageMapper.class);
		return mapper.countDataByFid(param);
	}

}
