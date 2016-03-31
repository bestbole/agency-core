package com.house.agency;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.entity.House;
import com.house.agency.entity.Image;
import com.house.agency.param.HouseQueryParam;
import com.house.agency.service.IHouseService;
import com.house.agency.service.IImageService;

public class TestHouse extends BaseJunitTest {

	@Autowired
	private IHouseService houseService;
	
	@Autowired
	private IImageService imageService;
	
	@Test
	public void testSaveHouse() {
		House param = new House();
		param.setArea(10000);
		param.setFloor(20);
		param.setRoom(3);
		param.setSaloon(2);
		param.setToilet(1);
		param.setFace("1");
		houseService.save(param);
	}
	
	@Test
	public void testQueryHouse() {
		HouseQueryParam param = new HouseQueryParam();
		houseService.query(param, 0, 30);
	}
	
	@Test
	public void testSaveHouseImage() {
		Image param = new Image();
		param.setForeignId("a24882153c65581f28000");
		param.setUserId("1870dc153c592f7578000");
		param.setType("2");
		param.setUrl("/images/2.jpg");
		param.setTitle("卧室图");
		imageService.save(param);
	}
}
