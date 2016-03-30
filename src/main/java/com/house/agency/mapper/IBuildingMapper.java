package com.house.agency.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.house.agency.entity.Building;
import com.house.agency.param.BuildingQueryParam;

public interface IBuildingMapper {

	int save(@Param("param") Building param);
	int update(@Param("param") Building param);
	int deleteById(@Param("id") String id);
	Building getDataById(@Param("id") String id);
	
	int count(@Param("param") BuildingQueryParam param);
	List<Building> query(@Param("param") BuildingQueryParam param,
			@Param("start") int start, @Param("end") int end);
	List<Building> list(@Param("param") BuildingQueryParam param);
}
