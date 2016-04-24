package com.house.agency.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.house.agency.data.manage.BuildingUnitManageData;
import com.house.agency.entity.BuildingUnit;
import com.house.agency.param.BuildingUnitQueryParam;
import com.house.agency.param.manage.BuildingUnitManageQueryParam;

public interface IBuildingUnitMapper {

	int save(@Param("param") BuildingUnit param);

	int update(@Param("param") BuildingUnit param);

	int deleteById(@Param("id") String id);

	BuildingUnit getDataById(@Param("id") String id);

	int count(@Param("param") BuildingUnitQueryParam param);

	List<BuildingUnit> query(@Param("param") BuildingUnitQueryParam param, @Param("start") int start,
			@Param("end") int end);

	List<BuildingUnit> queryByBuildingId(@Param("buildingId") String buildingId);

	int countManageData(@Param("param") BuildingUnitManageQueryParam param);

	List<BuildingUnitManageData> queryManageData(@Param("param") BuildingUnitManageQueryParam param,
			@Param("start") int start, @Param("end") int end);
}
