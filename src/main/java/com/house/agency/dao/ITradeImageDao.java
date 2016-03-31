package com.house.agency.dao;

import com.house.agency.entity.TradeImage;

public interface ITradeImageDao {

	int save(TradeImage param);
	int update(TradeImage param);
	int deleteById(String id);
	TradeImage getDataById(String id);
	
}
