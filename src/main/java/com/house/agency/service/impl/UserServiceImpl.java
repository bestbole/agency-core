package com.house.agency.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.agency.dao.IUserDao;
import com.house.agency.entity.User;
import com.house.agency.page.IPage;
import com.house.agency.page.Page;
import com.house.agency.param.UserQueryParam;
import com.house.agency.service.IUserService;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Override
	public void save(User param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		int count = userDao.save(param);
		if (count < 1) {
			throw new ServiceException("新增失败");
		}
	}

	@Override
	public void update(User param) {

	}

	@Override
	public void deleteById(String id) {

	}

	@Override
	public User getDataById(String id) {
		return userDao.getDataById(id);
	}

	@Override
	public User getDataByAccount(String account) {
		return userDao.getDataByAccount(account);
	}

	@Override
	public IPage<User> query(UserQueryParam param, int page, int rows) {
		List<User> list = null;
		page = page <= 0 ? 1 : page;
		rows = rows <= 0 ? 10 : rows;
		int count = userDao.count(param);
		if (count > 0) {
			int start = (page - 1) * rows;
			int end = start + rows;
			list = userDao.query(param, start, end);
		}
		return new Page<User>(list, count, page, rows);
	}

}
