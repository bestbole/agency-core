package com.house.agency.dao;

import java.util.List;

import com.house.agency.data.HouseDetailData;
import com.house.agency.data.HouseListData;
import com.house.agency.entity.House;
import com.house.agency.param.HouseQueryParam;

public interface IHouseDao {
	
	int save(House param);
	int update(House param);
	int deleteById(String id);
	House getDataById(String id);
	
	int count(HouseQueryParam param);
	List<House> query(HouseQueryParam param, int start, int end);
	
	HouseDetailData getData(String tradeId);
	int countData(HouseQueryParam param);
	List<HouseListData> queryData(HouseQueryParam param, int start, int end);
}