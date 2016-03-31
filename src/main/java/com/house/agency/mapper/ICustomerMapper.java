package com.house.agency.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.house.agency.entity.Customer;
import com.house.agency.param.CustomerQueryParam;

public interface ICustomerMapper {

	int save(@Param("param") Customer param);
	int update(@Param("param") Customer param);
	int deleteById(@Param("id") String id);
	Customer getDataById(@Param("id") String id);
	
	int count(@Param("param") CustomerQueryParam param);
	List<Customer> query(@Param("param") CustomerQueryParam param,
			@Param("start") int start, @Param("end") int end);
}
