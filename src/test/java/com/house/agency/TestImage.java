package com.house.agency;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.dao.IImageDao;
import com.house.agency.dao.ITradeImageDao;
import com.house.agency.entity.Image;
import com.house.agency.entity.TradeImage;

public class TestImage extends BaseJunitTest {

	@Autowired
	private IImageDao imageDao;
	
	@Autowired
	private ITradeImageDao tradeImageDao;
	
	@Test
	public void testSaveHouseImage() {
		for (int i = 0; i < Data.image_FT.length; i++) {
			String[] data = Data.image_FT[i].split("-");
			Image param = new Image();
			param.setId(Data.houseImageId + Data.getNum(i + 1));
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setForeignId(Data.houseId + "001");
			param.setUserId("1870dc153c592f7578000");
			param.setType("2");
			param.setUrl(data[0]);
			param.setTitle(data[1]);
			imageDao.save(param);
		}
		
	}
	
	@Test
	public void testSaveBuildingImage() {
		Image param = new Image();
		param.setForeignId("ff76f1153c6f148b08000");
		param.setUserId("1870dc153c592f7578000");
		param.setType("1");
		param.setUrl("/images/1.jpg");
		param.setTitle("外景图");
		imageDao.save(param);
	}
	
	@Test
	public void testSaveTradeImage() {
		TradeImage param = new TradeImage();
		param.setId("ff76f1153c6f148b08002");
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setTradeId(Data.tradeId + "001");
		param.setImageId(Data.houseImageId + "002");
		tradeImageDao.save(param);
	}
}
