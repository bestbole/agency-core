package com.house.agency.dao;

import com.house.agency.entity.CustomerRequireNum;

public interface ICustomerRequireNumDao {

	int save(CustomerRequireNum param);

	int update(CustomerRequireNum param);

	int deleteById(String id);

	CustomerRequireNum getDataById(String id);
	
	int updateByRequireId(CustomerRequireNum param);
	int deleteByRequireId(String requireId);
}
