package com.house.agency;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.dao.IConfigureDao;
import com.house.agency.entity.Configure;
import com.myself.common.utils.UIDGeneratorUtil;

public class TestConfigure extends BaseJunitTest {

	@Autowired
	private IConfigureDao configureDao;
	

	@Test
	public void testSaveTempFolder() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("temp_folder");
		param.setConfValue("E:/files/temps/");
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
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("upload_folder");
		param.setConfValue("E:/files/images/");
		configureDao.save(param);
	}
	
	@Test
	public void testSaveImageUrl() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("image_url");
		param.setConfValue("http://127.0.0.1:8008/");
		configureDao.save(param);
	}
}
