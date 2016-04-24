package com.house.agency.dao;

import java.util.List;

import com.house.agency.data.HouseInfoData;
import com.house.agency.data.HouseData;
import com.house.agency.data.home.HouseHomeData;
import com.house.agency.data.home.HouseHomeDescData;
import com.house.agency.data.manage.HouseManageData;
import com.house.agency.entity.House;
import com.house.agency.param.HouseQueryParam;
import com.house.agency.param.home.HouseHomeQueryParam;
import com.house.agency.param.manage.HouseManageQueryParam;

public interface IHouseDao {

	int save(House param);

	int update(House param);

	int deleteById(String id);

	House getDataById(String id);

	int count(HouseQueryParam param);

	List<House> query(HouseQueryParam param, int start, int end);

	HouseInfoData getData(String tradeId);

	int countData(HouseQueryParam param);

	List<HouseData> queryData(HouseQueryParam param, int start, int end);

	List<HouseHomeDescData> queryByBuildingUnitId(String buildingUnitId);
	
	int countHomeData(HouseHomeQueryParam param);
	
	List<HouseHomeData> queryHomeData(HouseHomeQueryParam param,
			int start, int end);

	int countManageData(HouseManageQueryParam param);
	
	List<HouseManageData> queryManageData(HouseManageQueryParam param,
			int start, int end);
}