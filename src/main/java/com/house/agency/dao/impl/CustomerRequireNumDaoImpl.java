package com.house.agency.dao.impl;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.ICustomerRequireNumDao;
import com.house.agency.entity.CustomerRequireNum;
import com.house.agency.mapper.ICustomerRequireNumMapper;

@Repository
public class CustomerRequireNumDaoImpl extends BaseDao<ICustomerRequireNumMapper> implements ICustomerRequireNumDao {

	@Override
	public int save(CustomerRequireNum param) {
		ICustomerRequireNumMapper mapper = getMapper(ICustomerRequireNumMapper.class);
		return mapper.save(param);
	}

	@Override
	public int update(CustomerRequireNum param) {
		ICustomerRequireNumMapper mapper = getMapper(ICustomerRequireNumMapper.class);
		return mapper.update(param);
	}

	@Override
	public int deleteById(String id) {
		ICustomerRequireNumMapper mapper = getMapper(ICustomerRequireNumMapper.class);
		return mapper.deleteById(id);
	}

	@Override
	public CustomerRequireNum getDataById(String id) {
		ICustomerRequireNumMapper mapper = getMapper(ICustomerRequireNumMapper.class);
		return mapper.getDataById(id);
	}

	@Override
	public int deleteByRequireId(String requireId) {
		ICustomerRequireNumMapper mapper = getMapper(ICustomerRequireNumMapper.class);
		return mapper.deleteByRequireId(requireId);
	}

	@Override
	public int updateByRequireId(CustomerRequireNum param) {
		ICustomerRequireNumMapper mapper = getMapper(ICustomerRequireNumMapper.class);
		return mapper.updateByRequireId(param);
	}

}
