package com.house.agency.dao;

import java.util.List;

import com.house.agency.data.manage.BuildingUnitManageData;
import com.house.agency.entity.BuildingUnit;
import com.house.agency.param.BuildingUnitQueryParam;
import com.house.agency.param.manage.BuildingUnitManageQueryParam;

public interface IBuildingUnitDao {

	int save(BuildingUnit param);

	int update(BuildingUnit param);

	int deleteById(String id);

	BuildingUnit getDataById(String id);

	int count(BuildingUnitQueryParam param);

	List<BuildingUnit> query(BuildingUnitQueryParam param, int start, int end);

	List<BuildingUnit> queryByBuildingId(String buildingId);
	
	int countManageData(BuildingUnitManageQueryParam param);
	
	List<BuildingUnitManageData> queryManageData(BuildingUnitManageQueryParam param,
			int start, int end);
}
