package com.house.agency.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.house.agency.entity.Configure;
import com.house.agency.param.ConfigureQueryParam;

public interface IConfigureMapper {

	int save(@Param("param") Configure param);

	int update(@Param("param") Configure param);

	int deleteById(@Param("id") String id);

	Configure getDataById(@Param("id") String id);

	int count(@Param("param") ConfigureQueryParam param);

	List<Configure> query(@Param("param") ConfigureQueryParam param,
			@Param("start") int start, @Param("end") int end);
	
	String getValueByKey(@Param("confKey") String key);
}
