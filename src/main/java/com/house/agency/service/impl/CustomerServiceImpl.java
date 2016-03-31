package com.house.agency.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.agency.dao.ICustomerDao;
import com.house.agency.entity.Customer;
import com.house.agency.page.IPage;
import com.house.agency.param.CustomerQueryParam;
import com.house.agency.service.ICustomerService;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao customerDao;
	
	@Override
	public void save(Customer param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		int count = customerDao.save(param);
		if (count < 1) {
			throw new ServiceException("新增失败");
		}
	}

	@Override
	public void update(Customer param) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer getDataById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPage<Customer> query(CustomerQueryParam param, int page, int rows) {
		// TODO Auto-generated method stub
		return null;
	}

}
