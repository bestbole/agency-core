package com.house.agency.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.IPermissionDao;
import com.house.agency.entity.Permission;
import com.house.agency.mapper.IPermissionMapper;
import com.house.agency.param.PermissionQueryParam;

@Repository
public class PermissionDaoImpl extends BaseDao<IPermissionMapper> implements IPermissionDao {

	@Override
	public int save(Permission param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Permission param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Permission param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Permission getData(Permission param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Permission> list(PermissionQueryParam param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(PermissionQueryParam param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Permission> query(PermissionQueryParam param, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Permission> queryPermissionsByRoleId(String roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Permission> queryPermissions() {
		// TODO Auto-generated method stub
		return null;
	}

}
