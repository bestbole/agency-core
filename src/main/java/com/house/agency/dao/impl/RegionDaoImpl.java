package com.house.agency.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.IRegionDao;
import com.house.agency.entity.Region;
import com.house.agency.mapper.IRegionMapper;
import com.house.agency.param.RegionQueryParam;

@Repository
public class RegionDaoImpl extends BaseDao<IRegionMapper> implements IRegionDao {

	@Override
	public int save(Region param) {
		IRegionMapper mapper = getMapper(IRegionMapper.class);
		return mapper.save(param);
	}

	@Override
	public int update(Region param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(String id) {
		IRegionMapper mapper = getMapper(IRegionMapper.class);
		return 0;
	}

	@Override
	public Region getDataById(String id) {
		IRegionMapper mapper = getMapper(IRegionMapper.class);
		return mapper.getDataById(id);
	}

	@Override
	public int count(RegionQueryParam param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Region> query(RegionQueryParam param, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Region> list(RegionQueryParam param) {
		IRegionMapper mapper = getMapper(IRegionMapper.class);
		return mapper.list(param);
	}

}
