package com.house.agency.dao;

import java.util.List;

import com.house.agency.entity.Trade;
import com.house.agency.param.TradeQueryParam;

public interface ITradeDao {

	int save(Trade param);
	int update(Trade param);
	int deleteById(String id);
	Trade getDataById(String id);
	
	int count(TradeQueryParam param);
	List<Trade> query(TradeQueryParam param, int start, int end);
	int cover(Trade param);
}
