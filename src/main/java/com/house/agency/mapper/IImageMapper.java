package com.house.agency.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.house.agency.data.ImageData;
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
	List<Image> queryData(@Param("param") ImageQueryParam param);
	
	int countDataByFid(@Param("param") ImageQueryParam param);
	List<Image> queryDataByFid(@Param("param") ImageQueryParam param);
	
	List<ImageData> queryDataByFuid(@Param("param") ImageQueryParam param);
	List<ImageData> queryHomeDataByFuid(@Param("param") ImageQueryParam param);
}
