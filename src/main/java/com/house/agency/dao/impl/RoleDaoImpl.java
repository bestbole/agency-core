package com.house.agency.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.IRoleDao;
import com.house.agency.entity.Role;
import com.house.agency.mapper.IRoleMapper;
import com.house.agency.param.RoleQueryParam;

@Repository
public class RoleDaoImpl extends BaseDao<IRoleMapper> implements IRoleDao {

	@Override
	public int save(Role param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Role param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Role param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Role getData(Role param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(RoleQueryParam param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Role> query(RoleQueryParam param, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> list(RoleQueryParam param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> queryRolesByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
