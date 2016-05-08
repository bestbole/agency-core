package com.house.agency.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.house.agency.entity.Trade;
import com.house.agency.param.TradeQueryParam;

public interface ITradeMapper {

	int save(@Param("param") Trade param);
	int update(@Param("param") Trade param);
	int deleteById(@Param("id") String id);
	Trade getDataById(@Param("id") String id);
	
	int count(@Param("param") TradeQueryParam param);
	List<Trade> query(@Param("param") TradeQueryParam param,
			@Param("start") int start, @Param("end") int end);
	int cover(@Param("param") Trade param);
}
