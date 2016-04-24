package com.house.agency.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.house.agency.data.HouseInfoData;
import com.house.agency.data.HouseData;
import com.house.agency.data.home.HouseHomeData;
import com.house.agency.data.home.HouseHomeDescData;
import com.house.agency.data.manage.HouseManageData;
import com.house.agency.entity.House;
import com.house.agency.param.HouseQueryParam;
import com.house.agency.param.home.HouseHomeQueryParam;
import com.house.agency.param.manage.HouseManageQueryParam;

public interface IHouseMapper {

	int save(@Param("param") House param);

	int update(@Param("param") House param);

	int deleteById(@Param("id") String id);

	House getDataById(@Param("id") String id);

	int count(@Param("param") HouseQueryParam param);

	List<House> query(@Param("param") HouseQueryParam param,
			@Param("start") int start, @Param("end") int end);

	HouseInfoData getData(@Param("tradeId") String tradeId);

	int countData(@Param("param") HouseQueryParam param);

	List<HouseData> queryData(@Param("param") HouseQueryParam param,
			@Param("start") int start, @Param("end") int end);

	List<HouseHomeDescData> queryByBuildingUnitId(
			@Param("buildingUnitId") String buildingUnitId);
	
	int countHomeData(@Param("param") HouseHomeQueryParam param);
	
	List<HouseHomeData> queryHomeData(@Param("param") HouseHomeQueryParam param,
			@Param("start") int start, @Param("end") int end);

	int countManageData(@Param("param") HouseManageQueryParam param);
	
	List<HouseManageData> queryManageData(@Param("param") HouseManageQueryParam param,
			@Param("start") int start, @Param("end") int end);
}