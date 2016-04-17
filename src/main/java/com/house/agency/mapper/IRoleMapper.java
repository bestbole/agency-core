package com.house.agency.mapper;

import org.apache.ibatis.annotations.Param;

import com.house.agency.entity.Role;

public interface IRoleMapper {

	int save(@Param("param") Role param);
	int update(@Param("param") Role param);
	int delete(@Param("param") Role param);
}
