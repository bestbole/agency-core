package com.house.agency;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.entity.Image;
import com.house.agency.service.IImageService;

public class TestImage extends BaseJunitTest {

	@Autowired
	private IImageService imageService;
	
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
	
	@Test
	public void testSaveBuildingImage() {
		Image param = new Image();
		param.setForeignId("ff76f1153c6f148b08000");
		param.setUserId("1870dc153c592f7578000");
		param.setType("1");
		param.setUrl("/images/1.jpg");
		param.setTitle("外景图");
		imageService.save(param);
	}
}
