package com.house.agency.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.ICustomerDao;
import com.house.agency.entity.Customer;
import com.house.agency.mapper.ICustomerMapper;
import com.house.agency.param.CustomerQueryParam;

@Repository
public class CustomerDaoImpl extends BaseDao<ICustomerMapper> implements ICustomerDao {

	@Override
	public int save(Customer param) {
		ICustomerMapper mapper = getMapper(ICustomerMapper.class);
		return mapper.save(param);
	}

	@Override
	public int update(Customer param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer getDataById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(CustomerQueryParam param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Customer> query(CustomerQueryParam param, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

}
