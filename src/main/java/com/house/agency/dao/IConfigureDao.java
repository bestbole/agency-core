package com.house.agency.dao;

import java.util.List;
import java.util.Map;

import com.house.agency.entity.Configure;
import com.house.agency.param.ConfigureQueryParam;

public interface IConfigureDao {

	int save(Configure param);

	int update(Configure param);

	int deleteById(String id);

	Configure getDataById(String id);

	int count(ConfigureQueryParam param);

	List<Configure> query(ConfigureQueryParam param, int start, int end);
	
	String getValueByKey(String key);
	
	Map<String, String> queryValueByKey(String key);
}
