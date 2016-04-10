package com.house.agency;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.dao.ITradeDao;
import com.house.agency.entity.Trade;
import com.house.agency.entity.TradeImage;
import com.house.agency.service.ITradeImageService;

public class TestTrade extends BaseJunitTest {
	
	

	@Autowired
	private ITradeDao tradeDao;
	
	@Autowired
	private ITradeImageService tradeImageService;
	
	@Test
	public void testSaveTrade_FT() {
		for (int i = 0; i < Data.trade_FT.length; i++) {
			String data = Data.trade_FT[i];
			Trade param = new Trade();
			param.setId(Data.tradeId + Data.getNum(i + 1));
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setHouseId(Data.houseId + Data.getNum(i + 1));
			param.setUserId(Data.userId + "001");
			param.setImageId(Data.buildingImageId + Data.getNum(i + 1));
			param.setPrice(20000 * (i+1));
			param.setType("1");
			param.setTitle(data);
			param.setReleaseTime(new Date());
			tradeDao.save(param);
		}
		
	}
	
	@Test
	public void testSaveTradeImage() {
		TradeImage param = new TradeImage();
		param.setTradeId("10f9d8153c6b57da38000");
		param.setImageId("df2ee2153cab14cd08000");
		param.setType("2");
		tradeImageService.save(param);
	}
}
