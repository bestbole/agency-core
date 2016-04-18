package com.house.agency.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.house.agency.entity.User;
import com.house.agency.param.UserQueryParam;

public interface IUserMapper {

	int save(@Param("param") User param);
	int update(@Param("param") User param);
	int deleteById(@Param("id") String id);
	User getDataById(@Param("id") String id);
	
	int count(@Param("param") UserQueryParam param);
	List<User> query(@Param("param") UserQueryParam param,
			@Param("start") int start, @Param("end") int end);
	User getDataByUsername(@Param("username") String username);
}
