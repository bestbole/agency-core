package com.house.agency.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.IHouseImageDao;
import com.house.agency.entity.HouseImage;
import com.house.agency.mapper.IHouseImageMapper;
import com.house.agency.param.HouseImageQueryParam;

@Repository
public class HouseImageDaoImpl extends BaseDao<IHouseImageMapper> implements IHouseImageDao {
	
	@Override
	public int save(HouseImage param) {
		IHouseImageMapper mapper = getMapper(IHouseImageMapper.class);
		return mapper.save(param);
	}

	@Override
	public int update(HouseImage param) {
		IHouseImageMapper mapper = getMapper(IHouseImageMapper.class);
		return mapper.update(param);
	}

	@Override
	public int deleteById(String id) {
		IHouseImageMapper mapper = getMapper(IHouseImageMapper.class);
		return mapper.deleteById(id);
	}

	@Override
	public HouseImage getDataById(String id) {
		IHouseImageMapper mapper = getMapper(IHouseImageMapper.class);
		return mapper.getDataById(id);
	}

	@Override
	public int count(HouseImageQueryParam param) {
		IHouseImageMapper mapper = getMapper(IHouseImageMapper.class);
		return mapper.count(param);
	}

	@Override
	public List<HouseImage> query(HouseImageQueryParam param, int start, int end) {
		IHouseImageMapper mapper = getMapper(IHouseImageMapper.class);
		return mapper.query(param, start, end);
	}
}