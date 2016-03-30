package com.house.agency.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.house.agency.entity.House;
import com.house.agency.param.HouseQueryParam;

public interface IHouseMapper {
	
	int save(@Param("param") House param);
	int update(@Param("param") House param);
	int deleteById(@Param("id") String id);
	House getDataById(@Param("id") String id);
	
	int count(@Param("param") HouseQueryParam param);
	List<House> query(@Param("param") HouseQueryParam param,
			@Param("start") int start, @Param("end") int end);
}