package com.house.agency.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.IHouseDao;
import com.house.agency.data.HouseInfoData;
import com.house.agency.data.HouseData;
import com.house.agency.data.home.HouseHomeData;
import com.house.agency.data.home.HouseHomeDescData;
import com.house.agency.data.manage.HouseManageData;
import com.house.agency.entity.House;
import com.house.agency.mapper.IHouseMapper;
import com.house.agency.param.HouseQueryParam;
import com.house.agency.param.home.HouseHomeQueryParam;
import com.house.agency.param.manage.HouseManageQueryParam;

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
	public List<HouseData> queryData(HouseQueryParam param, int start,
			int end) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.queryData(param, start, end);
	}

	@Override
	public HouseInfoData getData(String tradeId) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.getData(tradeId);
	}

	@Override
	public List<HouseHomeDescData> queryByBuildingUnitId(String buildingUnitId) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.queryByBuildingUnitId(buildingUnitId);
	}

	@Override
	public int countManageData(HouseManageQueryParam param) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.countManageData(param);
	}

	@Override
	public List<HouseManageData> queryManageData(HouseManageQueryParam param,
			int start, int end) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.queryManageData(param, start, end);
	}

	@Override
	public int countHomeData(HouseHomeQueryParam param) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.countHomeData(param);
	}

	@Override
	public List<HouseHomeData> queryHomeData(HouseHomeQueryParam param, int start, int end) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.queryHomeData(param, start, end);
	}

	@Override
	public int countByCustomerRequire(HouseHomeQueryParam param) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.countByCustomerRequire(param);
	}

	@Override
	public List<HouseHomeData> queryByCustomerRequire(HouseHomeQueryParam param, int start, int end) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.queryByCustomerRequire(param, start, end);
	}
}