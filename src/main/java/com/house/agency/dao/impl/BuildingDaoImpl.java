package com.house.agency.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.IBuildingDao;
import com.house.agency.entity.Building;
import com.house.agency.mapper.IBuildingMapper;
import com.house.agency.param.BuildingQueryParam;


@Repository
public class BuildingDaoImpl extends BaseDao<IBuildingMapper> implements IBuildingDao {

	@Override
	public int save(Building param) {
		IBuildingMapper mapper = getMapper(IBuildingMapper.class);
		return mapper.save(param);
	}

	@Override
	public int update(Building param) {
		IBuildingMapper mapper = getMapper(IBuildingMapper.class);
		return mapper.update(param);
	}

	@Override
	public int deleteById(String id) {
		IBuildingMapper mapper = getMapper(IBuildingMapper.class);
		return mapper.deleteById(id);
	}

	@Override
	public Building getDataById(String id) {
		IBuildingMapper mapper = getMapper(IBuildingMapper.class);
		return mapper.getDataById(id);
	}

	@Override
	public int count(BuildingQueryParam param) {
		IBuildingMapper mapper = getMapper(IBuildingMapper.class);
		return mapper.count(param);
	}

	@Override
	public List<Building> query(BuildingQueryParam param, int start, int end) {
		IBuildingMapper mapper = getMapper(IBuildingMapper.class);
		return mapper.query(param, start, end);
	}

	@Override
	public List<Building> list(BuildingQueryParam param) {
		IBuildingMapper mapper = getMapper(IBuildingMapper.class);
		return mapper.list(param);
	}
}
