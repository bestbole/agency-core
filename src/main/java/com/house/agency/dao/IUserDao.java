package com.house.agency.dao;

import java.util.List;

import com.house.agency.entity.User;
import com.house.agency.param.UserQueryParam;

public interface IUserDao {

	int save(User param);
	int update(User param);
	int deleteById(String id);
	User getDataById(String id);
	
	int count(UserQueryParam param);
	List<User> query(UserQueryParam param, int start, int end);
}
