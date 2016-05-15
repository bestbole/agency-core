package com.house.agency;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.dao.IUserDao;
import com.house.agency.entity.User;
import com.house.agency.param.UserQueryParam;


public class TestUser extends BaseJunitTest {

	@Autowired
	private IUserDao userDao;

	@Test
	public void testSaveUser() {
		User param = new User();
		param.setId(Data.userId + "001");
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setNickname("张芳");
		param.setUsername("hesheng");
		param.setAccount("jokn");
		param.setPassword("123456");
		param.setPhone("13513572468");
		param.setType("1");
		userDao.save(param);
	}
	
	@Test
	public void testQueryUser() {
		UserQueryParam param = new UserQueryParam();
		userDao.query(param, 0, 30);
	}
}
