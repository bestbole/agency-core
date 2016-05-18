package com.house.agency.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.IUserDao;
import com.house.agency.entity.User;
import com.house.agency.mapper.IUserMapper;
import com.house.agency.param.UserQueryParam;

@Repository
public class UserDaoImpl extends BaseDao<IUserMapper> implements IUserDao {

	@Override
	public int save(User param) {
		IUserMapper mapper = getMapper(IUserMapper.class);
		return mapper.save(param);
	}

	@Override
	public int update(User param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(String id) {
		IUserMapper mapper = getMapper(IUserMapper.class);
		return mapper.deleteById(id);
	}

	@Override
	public User getDataById(String id) {
		IUserMapper mapper = getMapper(IUserMapper.class);
		return mapper.getDataById(id);
	}

	@Override
	public int count(UserQueryParam param) {
		IUserMapper mapper = getMapper(IUserMapper.class);
		return mapper.count(param);
	}

	@Override
	public List<User> query(UserQueryParam param, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getDataByAccount(String account) {
		IUserMapper mapper = getMapper(IUserMapper.class);
		return mapper.getDataByAccount(account);
	}

}
