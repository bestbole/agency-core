package com.house.agency;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.dao.ITradeDao;
import com.house.agency.entity.Trade;
import com.house.agency.entity.TradeImage;
import com.house.agency.service.ITradeImageService;

public class TestTrade extends BaseJunitTest {
	
	private String userId = "1870dc153c592f7578000";
	
	private String[] datas = {"5bdc50153ef6bbe1f7a-来座山 实用的户型 南北通透 业主低于市场价15万急卖",
			"dd3812153ef6bbe1f7b-慢城 大四房 楼王位置 三面采光 业主急卖 还是看山景的",
			"8c436b153ef6bbe1f7c-大赠送 拥有自己的装修风格 还是看山景的",
			"9e5c73153ef6bbe1f7d-南北通透 全新装修 还是看山景的",
			"c791b9153ef6bbe1f7e-来座山 全新毛坯 大增送123送60平 实用",
			"3020ad153ef6bbe1f7f-城铁沿线91平570万元业主急售!",
			"b15692153ef6bbe1f7g-友邻公寓性价比高,总价,诚意出售!",
			"aa9f99153ef6bbe1f7h-一手业主享受高端高尔夫美景你值得拥有",
			"d42d08153ef6bbe1f7i-名匠设计,豪华装修,满五,业主诚心出售",
			"d86fd3153ef6bbe1f7j-美荔园3室640万元地地道道好房!"};

	@Autowired
	private ITradeDao tradeDao;
	
	@Autowired
	private ITradeImageService tradeImageService;
	
	@Test
	public void testSaveTrade() {
		for (int i = 0; i < datas.length; i++) {
			String[] data = datas[i].split("-");
			Trade param = new Trade();
			param.setId(data[0] + "04");
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setHouseId(data[0] + "03");
			param.setUserId(userId);
			param.setImageId(data[0] + "02");
			param.setPrice(10000 * (i+1));
			param.setType("1");
			param.setTitle(data[1]);
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
