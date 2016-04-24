package com.house.agency.dao;

import java.util.List;

import com.house.agency.data.BuildingData;
import com.house.agency.data.manage.BuildingManageData;
import com.house.agency.entity.Building;
import com.house.agency.param.BuildingQueryParam;
import com.house.agency.param.manage.BuildingManageQueryParam;

public interface IBuildingDao {

	int save(Building param);

	int update(Building param);

	int deleteById(String id);

	Building getDataById(String id);

	int count(BuildingQueryParam param);

	List<Building> query(BuildingQueryParam param, int start, int end);

	List<BuildingData> list(BuildingQueryParam param);
	
	int countManageData(BuildingManageQueryParam param);
	
	List<BuildingManageData> queryManageData(BuildingManageQueryParam param,
			int start, int end);
}
