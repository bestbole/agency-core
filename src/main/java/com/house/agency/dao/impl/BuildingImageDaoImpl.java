package com.house.agency.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.IBuildingImageDao;
import com.house.agency.entity.BuildingImage;
import com.house.agency.mapper.IBuildingImageMapper;
import com.house.agency.param.BuildingImageQueryParam;

@Repository
public class BuildingImageDaoImpl extends BaseDao<IBuildingImageMapper> implements IBuildingImageDao {

	@Override
	public int save(BuildingImage param) {
		IBuildingImageMapper mapper = getMapper(IBuildingImageMapper.class);
		return mapper.save(param);
	}

	@Override
	public int update(BuildingImage param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(String id) {
		IBuildingImageMapper mapper = getMapper(IBuildingImageMapper.class);
		return mapper.deleteById(id);
	}

	@Override
	public BuildingImage getDataById(String id) {
		IBuildingImageMapper mapper = getMapper(IBuildingImageMapper.class);
		return mapper.getDataById(id);
	}

	@Override
	public int count(BuildingImageQueryParam param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BuildingImage> query(BuildingImageQueryParam param, int start,
			int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BuildingImage> list(BuildingImageQueryParam param) {
		IBuildingImageMapper mapper = getMapper(IBuildingImageMapper.class);
		return mapper.list(param);
	}

}
