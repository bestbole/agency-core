package com.house.agency.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.house.agency.entity.Image;
import com.house.agency.param.ImageQueryParam;

public interface IImageMapper {

	int save(@Param("param") Image param);
	int update(@Param("param") Image param);
	int deleteById(@Param("id") String id);
	Image getDataById(@Param("id") String id);
	
	int count(@Param("param") ImageQueryParam param);
	List<Image> query(@Param("param") ImageQueryParam param,
			@Param("start") int start, @Param("end") int end);
}
