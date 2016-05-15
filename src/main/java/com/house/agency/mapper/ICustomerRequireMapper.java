package com.house.agency.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.house.agency.data.home.CustomerRequireHomeData;
import com.house.agency.entity.CustomerRequire;
import com.house.agency.param.CustomerRequireQueryParam;

public interface ICustomerRequireMapper {

	int save(@Param("param") CustomerRequire param);
	int update(@Param("param") CustomerRequire param);
	int deleteById(@Param("id") String id);
	CustomerRequire getDataById(@Param("id") String id);
	
	int count(@Param("param") CustomerRequireQueryParam param);
	List<CustomerRequire> query(@Param("param") CustomerRequireQueryParam param,
			@Param("start") int start, @Param("end") int end);
	
	int countData(@Param("param") CustomerRequireQueryParam param);
	List<CustomerRequireHomeData> queryData(@Param("param") CustomerRequireQueryParam param,
			@Param("start") int start, @Param("end") int end);
	
	List<CustomerRequire> queryAll(@Param("param") CustomerRequireQueryParam param);
	CustomerRequireHomeData getDataByRequireId(@Param("requireId") String requireId);
}
