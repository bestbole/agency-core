package com.house.agency.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.agency.dao.ICustomerRequireDao;
import com.house.agency.entity.CustomerRequire;
import com.house.agency.page.IPage;
import com.house.agency.param.CustomerRequireQueryParam;
import com.house.agency.service.ICustomerRequireService;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("customerRequireService")
public class CustomerRequireServiceImpl implements ICustomerRequireService {

	@Autowired
	private ICustomerRequireDao customerRequireDao;
	
	@Override
	public void save(CustomerRequire param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		int count = customerRequireDao.save(param);
		if (count < 1) {
			throw new ServiceException("新增失败");
		}
	}

	@Override
	public void update(CustomerRequire param) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public CustomerRequire getDataById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPage<CustomerRequire> query(CustomerRequireQueryParam param,
			int page, int rows) {
		// TODO Auto-generated method stub
		return null;
	}

}
