package com.house.agency;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.entity.User;
import com.house.agency.param.UserQueryParam;
import com.house.agency.service.IUserService;


public class TestUser extends BaseJunitTest {

	@Autowired
	private IUserService userService;

	@Test
	public void testSaveUser() {
		User param = new User();
		param.setNickname("name1");
		param.setUsername("name2");
		param.setAccount("jokn");
		param.setPassword("123456");
		param.setPhone("13513572468");
		param.setType("1");
		userService.save(param);
	}
	
	@Test
	public void testQueryUser() {
		UserQueryParam param = new UserQueryParam();
		userService.query(param, 0, 30);
	}
}
