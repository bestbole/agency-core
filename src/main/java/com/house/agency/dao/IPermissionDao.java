package com.house.agency.dao;

import java.util.List;

import com.house.agency.entity.Permission;
import com.house.agency.param.PermissionQueryParam;

public interface IPermissionDao {

	int save(Permission param);
	int update(Permission param);
	int delete(Permission param);
	Permission getData(Permission param);
	
	List<Permission> list(PermissionQueryParam param);
	int count(PermissionQueryParam param);
	List<Permission> query(PermissionQueryParam param, int start, int end);
	List<Permission> queryPermissionsByRoleId(String roleId);
	List<Permission> queryPermissions();

}
