package com.house.agency.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.ICustomerRequireDao;
import com.house.agency.data.home.CustomerRequireHomeData;
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
		ICustomerRequireMapper mapper = getMapper(ICustomerRequireMapper.class);
		return mapper.update(param);
	}

	@Override
	public int deleteById(String id) {
		ICustomerRequireMapper mapper = getMapper(ICustomerRequireMapper.class);
		return mapper.deleteById(id);
	}

	@Override
	public CustomerRequire getDataById(String id) {
		ICustomerRequireMapper mapper = getMapper(ICustomerRequireMapper.class);
		return mapper.getDataById(id);
	}

	@Override
	public int count(CustomerRequireQueryParam param) {
		ICustomerRequireMapper mapper = getMapper(ICustomerRequireMapper.class);
		return mapper.count(param);
	}

	@Override
	public List<CustomerRequire> query(CustomerRequireQueryParam param,
			int start, int end) {
		ICustomerRequireMapper mapper = getMapper(ICustomerRequireMapper.class);
		return mapper.query(param, start, end);
	}

	@Override
	public int countData(CustomerRequireQueryParam param) {
		ICustomerRequireMapper mapper = getMapper(ICustomerRequireMapper.class);
		return mapper.countData(param);
	}

	@Override
	public List<CustomerRequireHomeData> queryData(CustomerRequireQueryParam param, int start, int end) {
		ICustomerRequireMapper mapper = getMapper(ICustomerRequireMapper.class);
		return mapper.queryData(param, start, end);
	}

	@Override
	public List<CustomerRequire> queryAll(CustomerRequireQueryParam param) {
		ICustomerRequireMapper mapper = getMapper(ICustomerRequireMapper.class);
		return mapper.queryAll(param);
	}

	@Override
	public CustomerRequireHomeData getDataByRequireId(String requireId) {
		ICustomerRequireMapper mapper = getMapper(ICustomerRequireMapper.class);
		return mapper.getDataByRequireId(requireId);
	}

}
