package com.house.agency.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.IHouseDao;
import com.house.agency.data.HouseDetailData;
import com.house.agency.data.HouseListData;
import com.house.agency.entity.House;
import com.house.agency.mapper.IHouseMapper;
import com.house.agency.param.HouseQueryParam;

@Repository
public class HouseDaoImpl extends BaseDao<IHouseMapper> implements IHouseDao {
	
	@Override
	public int save(House param) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.save(param);
	}

	@Override
	public int update(House param) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.update(param);
	}

	@Override
	public int deleteById(String id) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.deleteById(id);
	}

	@Override
	public House getDataById(String id) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.getDataById(id);
	}

	@Override
	public int count(HouseQueryParam param) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.count(param);
	}

	@Override
	public List<House> query(HouseQueryParam param, int start, int end) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.query(param, start, end);
	}

	@Override
	public int countData(HouseQueryParam param) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.countData(param);
	}

	@Override
	public List<HouseListData> queryData(HouseQueryParam param, int start, int end) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.queryData(param, start, end);
	}

	@Override
	public HouseDetailData getData(String tradeId) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.getData(tradeId);
	}

	@Override
	public List<House> queryByBuildingUnitId(String buildingUnitId) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.queryByBuildingUnitId(buildingUnitId);
	}
}