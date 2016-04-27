package com.house.agency;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.dao.IConfigureDao;
import com.house.agency.entity.Configure;

public class TestConfigure extends BaseJunitTest {

	@Autowired
	private IConfigureDao configureDao;
	

	@Test
	public void testSaveTempFolder() {
		Configure param = new Configure();
		param.setId(Data.houseImageId + "002");
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("temp_folder");
		param.setConfValue("E:/images/temp");
		configureDao.save(param);
	}
	
	@Test
	public void testGetTempFolder() {
		String value = configureDao.getValueByKey("temp_folder");
		System.out.println("value=" + value);
	}
	
	@Test
	public void testSaveUploadFolder() {
		Configure param = new Configure();
		param.setId(Data.houseImageId + "003");
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("upload_folder");
		param.setConfValue("E:/images/upload");
		configureDao.save(param);
	}
}
