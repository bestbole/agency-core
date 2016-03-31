package com.house.agency;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.entity.Customer;
import com.house.agency.service.ICustomerService;

public class TestCustomer extends BaseJunitTest {

	@Autowired
	private ICustomerService customerService;
	
	@Test
	public void testSaveCustomer() {
		Customer param = new Customer();
		param.setUserId("1870dc153c592f7578000");
		param.setName("张力");
		param.setPhone("13713998866");
		param.setLevel("1");
		customerService.save(param);
	}
}
