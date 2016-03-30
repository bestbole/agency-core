package com.house.agency;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.entity.Trade;
import com.house.agency.service.ITradeService;

public class TestTrade extends BaseJunitTest {

	@Autowired
	private ITradeService tradeService;
	
	@Test
	public void testSaveTrade() {
		Trade param = new Trade();
		param.setHouseId("a24882153c65581f28000");
		param.setUserId("1870dc153c592f7578000");
		param.setPrice(500000);
		param.setType("2");
		param.setTitle("梅林一村三房98平 景观无敌 看房方便 低于市场价");
		param.setReleaseTime(new Date());
		tradeService.save(param);
	}
}
