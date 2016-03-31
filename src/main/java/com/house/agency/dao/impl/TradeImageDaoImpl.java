package com.house.agency.dao.impl;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.ITradeImageDao;
import com.house.agency.entity.TradeImage;
import com.house.agency.mapper.ITradeImageMapper;

@Repository
public class TradeImageDaoImpl extends BaseDao<ITradeImageMapper> implements ITradeImageDao {

	@Override
	public int save(TradeImage param) {
		ITradeImageMapper mapper = getMapper(ITradeImageMapper.class);
		return mapper.save(param);
	}

	@Override
	public int update(TradeImage param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TradeImage getDataById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
