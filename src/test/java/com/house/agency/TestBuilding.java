package com.house.agency;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.entity.Building;
import com.house.agency.entity.BuildingUnit;
import com.house.agency.entity.Image;
import com.house.agency.service.IBuildingService;
import com.house.agency.service.IBuildingUnitService;
import com.house.agency.service.IImageService;

public class TestBuilding extends BaseJunitTest {

	@Autowired
	private IBuildingService buildingService;
	
	@Autowired
	private IBuildingUnitService buildingUnitService;
	
	@Autowired
	private IImageService imageService;

	@Test
	public void testSaveBuilding() {
		Building param = new Building();
		param.setBuildingName("侨福大厦");
		param.setBuildingYear("2010");
		param.setBuildingAddress("新闻路与景田路交汇处");
		param.setType("1");
		buildingService.save(param);
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
	
	@Test
	public void testSaveBuildingUnit() {
		BuildingUnit param = new BuildingUnit();
		param.setBuildingId("ff76f1153c6f148b08000");
		param.setName("A栋");
		param.setFloor(30);
		buildingUnitService.save(param);
	}
}
