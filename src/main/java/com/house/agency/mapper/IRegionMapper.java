package com.house.agency.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.house.agency.data.manage.RegionManageData;
import com.house.agency.entity.Region;
import com.house.agency.param.RegionQueryParam;
import com.house.agency.param.manage.RegionManageQueryParam;

public interface IRegionMapper {

	int save(@Param("param") Region param);

	int update(@Param("param") Region param);

	int deleteById(@Param("id") String id);

	Region getDataById(@Param("id") String id);

	int count(@Param("param") RegionQueryParam param);

	List<Region> query(@Param("param") RegionQueryParam param, @Param("start") int start, @Param("end") int end);

	List<Region> list(@Param("param") RegionQueryParam param);
	
	int countManageData(@Param("param") RegionManageQueryParam param);
	
	List<RegionManageData> queryManageData(@Param("param") RegionManageQueryParam param,
			@Param("start") int start, @Param("end") int end);
}
