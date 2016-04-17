package com.house.agency.mapper;

import org.apache.ibatis.annotations.Param;

import com.house.agency.entity.Permission;

public interface IPermissionMapper {

	int save(@Param("param") Permission param);
	int update(@Param("param") Permission param);
	int delete(@Param("param") Permission param);
}
