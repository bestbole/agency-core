package com.house.agency.dao;

import java.util.List;

import com.house.agency.entity.BuildingUnit;
import com.house.agency.param.BuildingUnitQueryParam;

public interface IBuildingUnitDao {

	int save(BuildingUnit param);
	int update(BuildingUnit param);
	int deleteById(String id);
	BuildingUnit getDataById(String id);
	
	int count(BuildingUnitQueryParam param);
	List<BuildingUnit> query(BuildingUnitQueryParam param, int start, int end);
	List<BuildingUnit> queryByBuildingId(String buildingId);
}
