package com.house.agency;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.entity.CustomerRequire;
import com.house.agency.service.ICustomerRequireService;

public class TestCustomerRequire extends BaseJunitTest {

	@Autowired
	private ICustomerRequireService customerRequireService;
	
	@Test
	public void testSaveCustomerRequire() {
		CustomerRequire param = new CustomerRequire();
		param.setCustomerId("76b58a153cb84d3328000");
		param.setBuildingIds("ff76f1153c6f148b08000");
		param.setPriceBegin(10000);
		param.setPriceEnd(20000);
		param.setType("1");
		param.setRooms("2;3");
		customerRequireService.save(param);
	}
}
