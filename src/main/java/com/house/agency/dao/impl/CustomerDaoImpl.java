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
		ICustomerMapper mapper = getMapper(ICustomerMapper.class);
		return mapper.update(param);
	}

	@Override
	public int deleteById(String id) {
		ICustomerMapper mapper = getMapper(ICustomerMapper.class);
		return mapper.deleteById(id);
	}

	@Override
	public Customer getDataById(String id) {
		ICustomerMapper mapper = getMapper(ICustomerMapper.class);
		return mapper.getDataById(id);
	}

	@Override
	public int count(CustomerQueryParam param) {
		ICustomerMapper mapper = getMapper(ICustomerMapper.class);
		return mapper.count(param);
	}

	@Override
	public List<Customer> query(CustomerQueryParam param, int start, int end) {
		ICustomerMapper mapper = getMapper(ICustomerMapper.class);
		return mapper.query(param, start, end);
	}

	@Override
	public List<Customer> queryDataByUid(String userId) {
		ICustomerMapper mapper = getMapper(ICustomerMapper.class);
		return mapper.queryDataByUid(userId);
	}

}
