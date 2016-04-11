package com.house.agency;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.dao.IHouseDao;
import com.house.agency.entity.House;
import com.house.agency.entity.Image;
import com.house.agency.service.IImageService;

public class TestHouse extends BaseJunitTest {

	@Autowired
	private IHouseDao houseDao;
	
	@Autowired
	private IImageService imageService;
	
	@Test
	public void testSaveHouse_FT() {
		for (int i = 0; i < Data.buildings_FT.length; i++) {
			House param = new House();
			param.setId(Data.houseId + Data.getNum(i + 1));
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setBuildingUnitId(Data.buildingUnitId + Data.getNum(i + 1));
			param.setArea(10000 + i);
			param.setFloor(10 + i);
			int room = 1;
			if (i%2 == 0) {
				room = 2;
			} else if (i%3 == 0) {
				room = 3;
			}
			param.setRoom(room);
			param.setSaloon(1);
			param.setToilet(1);
			param.setFace(1);
			houseDao.save(param);
		}
		
	}
	
	@Test
	public void testQueryHouse() {
		
	}
	
	@Test
	public void testSaveHouseImage() {
		Image param = new Image();
		param.setForeignId("a24882153c65581f28000");
		param.setUserId("1870dc153c592f7578000");
		param.setType("2");
		param.setUrl("/images/3.jpg");
		param.setTitle("户型图");
		imageService.save(param);
	}
}
