package com.house.agency;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.entity.House;
import com.house.agency.entity.HouseImage;
import com.house.agency.param.HouseQueryParam;
import com.house.agency.service.IHouseImageService;
import com.house.agency.service.IHouseService;

public class TestHouse extends BaseJunitTest {

	@Autowired
	private IHouseService houseService;
	
	@Autowired
	private IHouseImageService houseImageService;
	
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
		HouseImage param = new HouseImage();
		param.setHouseId("a24882153c65581f28000");
		param.setUserId("1870dc153c592f7578000");
		param.setUrl("/images/1.jpg");
		houseImageService.save(param);
	}
}
