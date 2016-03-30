package com.house.agency;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.entity.Building;
import com.house.agency.entity.BuildingUnit;
import com.house.agency.service.IBuildingService;
import com.house.agency.service.IBuildingUnitService;

public class TestBuilding extends BaseJunitTest {

	@Autowired
	private IBuildingService buildingService;
	
	@Autowired
	private IBuildingUnitService buildingUnitService;

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
	public void testSaveBuildingUnit() {
		BuildingUnit param = new BuildingUnit();
		param.setBuildingId("ff76f1153c6f148b08000");
		param.setName("A栋");
		param.setFloor(30);
		buildingUnitService.save(param);
	}
}
