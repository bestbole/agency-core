package com.house.agency.dao;

import java.util.List;

import com.house.agency.entity.Role;
import com.house.agency.param.RoleQueryParam;

public interface IRoleDao {

	int save(Role param);
	int update(Role param);
	int delete(Role param);
	Role getData(Role param);
	
	int count(RoleQueryParam param);
	List<Role> query(RoleQueryParam param, int start, int end);
	List<Role> list(RoleQueryParam param);
	List<Role> queryRolesByUserId(String userId);
}
