package com.house.agency.mapper;

import org.apache.ibatis.annotations.Param;

import com.house.agency.entity.CustomerRequireNum;

public interface ICustomerRequireNumMapper {

	int save(@Param("param") CustomerRequireNum param);

	int update(@Param("param") CustomerRequireNum param);

	int deleteById(@Param("id") String id);

	CustomerRequireNum getDataById(@Param("id") String id);
	
	int updateByRequireId(@Param("param") CustomerRequireNum param);

	int deleteByRequireId(@Param("requireId") String requireId);
}
