package com.house.agency.dao;

import java.util.List;

import com.house.agency.entity.HouseImage;
import com.house.agency.param.HouseImageQueryParam;

public interface IHouseImageDao {
	
	int save(HouseImage param);
	int update(HouseImage param);
	int deleteById(String id);
	HouseImage getDataById(String id);
	
	int count(HouseImageQueryParam param);
	List<HouseImage> query(HouseImageQueryParam param, int start, int end);
}