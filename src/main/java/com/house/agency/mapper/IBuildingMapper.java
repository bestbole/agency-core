package com.house.agency.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.house.agency.data.BuildingData;
import com.house.agency.data.manage.BuildingManageData;
import com.house.agency.entity.Building;
import com.house.agency.param.BuildingQueryParam;
import com.house.agency.param.manage.BuildingManageQueryParam;

public interface IBuildingMapper {

	int save(@Param("param") Building param);

	int update(@Param("param") Building param);

	int deleteById(@Param("id") String id);

	Building getDataById(@Param("id") String id);

	int count(@Param("param") BuildingQueryParam param);

	List<Building> query(@Param("param") BuildingQueryParam param, @Param("start") int start, @Param("end") int end);

	List<BuildingData> list(@Param("param") BuildingQueryParam param);
	
	int countManageData(@Param("param") BuildingManageQueryParam param);
	
	List<BuildingManageData> queryManageData(@Param("param") BuildingManageQueryParam param,
			@Param("start") int start, @Param("end") int end);
}
