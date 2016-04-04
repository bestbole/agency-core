package com.house.agency.dao;

import java.util.List;

import com.house.agency.entity.Region;
import com.house.agency.param.RegionQueryParam;

public interface IRegionDao {

	int save(Region param);
	int update(Region param);
	int deleteById(String id);
	Region getDataById(String id);
	
	int count(RegionQueryParam param);
	List<Region> query(RegionQueryParam param, int start, int end);
	List<Region> list(RegionQueryParam param);
}
