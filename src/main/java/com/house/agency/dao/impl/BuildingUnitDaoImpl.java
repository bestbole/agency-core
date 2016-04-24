package com.house.agency.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.IBuildingUnitDao;
import com.house.agency.data.manage.BuildingUnitManageData;
import com.house.agency.entity.BuildingUnit;
import com.house.agency.mapper.IBuildingUnitMapper;
import com.house.agency.param.BuildingUnitQueryParam;
import com.house.agency.param.manage.BuildingUnitManageQueryParam;

@Repository
public class BuildingUnitDaoImpl extends BaseDao<IBuildingUnitMapper> implements IBuildingUnitDao {

	@Override
	public int save(BuildingUnit param) {
		IBuildingUnitMapper mapper = getMapper(IBuildingUnitMapper.class);
		return mapper.save(param);
	}

	@Override
	public int update(BuildingUnit param) {
		IBuildingUnitMapper mapper = getMapper(IBuildingUnitMapper.class);
		return mapper.update(param);
	}

	@Override
	public int deleteById(String id) {
		IBuildingUnitMapper mapper = getMapper(IBuildingUnitMapper.class);
		return mapper.deleteById(id);
	}

	@Override
	public BuildingUnit getDataById(String id) {
		IBuildingUnitMapper mapper = getMapper(IBuildingUnitMapper.class);
		return mapper.getDataById(id);
	}

	@Override
	public int count(BuildingUnitQueryParam param) {
		IBuildingUnitMapper mapper = getMapper(IBuildingUnitMapper.class);
		return mapper.count(param);
	}

	@Override
	public List<BuildingUnit> query(BuildingUnitQueryParam param, int start,
			int end) {
		IBuildingUnitMapper mapper = getMapper(IBuildingUnitMapper.class);
		return mapper.query(param, start, end);
	}

	@Override
	public List<BuildingUnit> queryByBuildingId(String buildingId) {
		IBuildingUnitMapper mapper = getMapper(IBuildingUnitMapper.class);
		return mapper.queryByBuildingId(buildingId);
	}

	@Override
	public int countManageData(BuildingUnitManageQueryParam param) {
		IBuildingUnitMapper mapper = getMapper(IBuildingUnitMapper.class);
		return mapper.countManageData(param);
	}

	@Override
	public List<BuildingUnitManageData> queryManageData(BuildingUnitManageQueryParam param, int start, int end) {
		IBuildingUnitMapper mapper = getMapper(IBuildingUnitMapper.class);
		return mapper.queryManageData(param, start, end);
	}

}
