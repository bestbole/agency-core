package com.house.agency.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.house.agency.data.HouseDetailData;
import com.house.agency.data.HouseListData;
import com.house.agency.data.manage.HouseManageData;
import com.house.agency.entity.House;
import com.house.agency.param.HouseQueryParam;
import com.house.agency.param.manage.HouseManageQueryParam;

public interface IHouseMapper {

	int save(@Param("param") House param);

	int update(@Param("param") House param);

	int deleteById(@Param("id") String id);

	House getDataById(@Param("id") String id);

	int count(@Param("param") HouseQueryParam param);

	List<House> query(@Param("param") HouseQueryParam param,
			@Param("start") int start, @Param("end") int end);

	HouseDetailData getData(@Param("tradeId") String tradeId);

	int countData(@Param("param") HouseQueryParam param);

	List<HouseListData> queryData(@Param("param") HouseQueryParam param,
			@Param("start") int start, @Param("end") int end);

	List<House> queryByBuildingUnitId(
			@Param("buildingUnitId") String buildingUnitId);

	int countManageData(@Param("param") HouseManageQueryParam param);
	
	List<HouseManageData> queryManageData(@Param("param") HouseManageQueryParam param,
			@Param("start") int start, @Param("end") int end);
}