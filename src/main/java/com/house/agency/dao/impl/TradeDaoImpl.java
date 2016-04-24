package com.house.agency.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.ITradeDao;
import com.house.agency.entity.Trade;
import com.house.agency.mapper.ITradeMapper;
import com.house.agency.param.TradeQueryParam;

@Repository
public class TradeDaoImpl extends BaseDao<ITradeMapper> implements ITradeDao {

	@Override
	public int save(Trade param) {
		ITradeMapper mapper = getMapper(ITradeMapper.class);
		return mapper.save(param);
	}

	@Override
	public int update(Trade param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(String id) {
		ITradeMapper mapper = getMapper(ITradeMapper.class);
		return mapper.deleteById(id);
	}

	@Override
	public Trade getDataById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(TradeQueryParam param) {
		ITradeMapper mapper = getMapper(ITradeMapper.class);
		return mapper.count(param);
	}

	@Override
	public List<Trade> query(TradeQueryParam param, int start, int end) {
		ITradeMapper mapper = getMapper(ITradeMapper.class);
		return mapper.query(param, start, end);
	}
}
