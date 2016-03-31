package com.house.agency.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.ICustomerRequireDao;
import com.house.agency.entity.CustomerRequire;
import com.house.agency.mapper.ICustomerRequireMapper;
import com.house.agency.param.CustomerRequireQueryParam;

@Repository
public class CustomerRequireDaoImpl extends BaseDao<ICustomerRequireMapper> implements ICustomerRequireDao {

	@Override
	public int save(CustomerRequire param) {
		ICustomerRequireMapper mapper = getMapper(ICustomerRequireMapper.class);
		return mapper.save(param);
	}

	@Override
	public int update(CustomerRequire param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CustomerRequire getDataById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(CustomerRequireQueryParam param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CustomerRequire> query(CustomerRequireQueryParam param,
			int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

}
