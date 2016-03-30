package com.house.agency;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.dao.IBuildingDao;
import com.house.agency.param.BuildingQueryParam;


public class Testing extends BaseJunitTest {

	@Autowired
	private IBuildingDao buildingDao;
	
	@Test
	public void test() {
		System.out.println("=====================");
		BuildingQueryParam param = new BuildingQueryParam();
		int count = buildingDao.count(param);
		System.out.println("=====================" + count);
	}
}
