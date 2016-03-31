package com.house.agency.mapper;

import org.apache.ibatis.annotations.Param;

import com.house.agency.entity.TradeImage;

public interface ITradeImageMapper {

	int save(@Param("param") TradeImage param);
	int update(@Param("param") TradeImage param);
	int deleteById(@Param("id") String id);
	TradeImage getDataById(@Param("id") String id);
}
