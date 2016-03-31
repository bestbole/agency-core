package com.house.agency.dao;

import java.util.List;

import com.house.agency.entity.Customer;
import com.house.agency.param.CustomerQueryParam;

public interface ICustomerDao {

	int save(Customer param);
	int update(Customer param);
	int deleteById(String id);
	Customer getDataById(String id);
	
	int count(CustomerQueryParam param);
	List<Customer> query(CustomerQueryParam param, int start, int end);
}
