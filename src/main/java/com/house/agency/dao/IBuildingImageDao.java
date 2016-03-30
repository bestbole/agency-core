package com.house.agency.dao;

import java.util.List;

import com.house.agency.entity.BuildingImage;
import com.house.agency.param.BuildingImageQueryParam;

public interface IBuildingImageDao {

	int save(BuildingImage param);
	int update(BuildingImage param);
	int deleteById(String id);
	BuildingImage getDataById(String id);
	
	int count(BuildingImageQueryParam param);
	List<BuildingImage> query(BuildingImageQueryParam param, int start, int end);
	List<BuildingImage> list(BuildingImageQueryParam param);
}
