package com.house.agency;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(defaultRollback = false, transactionManager = "myBatisTransactionManager")
@ContextConfiguration(locations = { "classpath:application-web.xml" })
@Transactional
public class BaseServiceTest extends
		AbstractTransactionalJUnit4SpringContextTests {

	public BaseServiceTest() {
		System.setProperty("spring.profiles.active", "development");
	}
}
