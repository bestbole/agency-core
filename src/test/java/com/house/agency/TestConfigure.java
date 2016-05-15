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
		param.setConfValue("/data/files/temps");
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
		param.setConfValue("/data/files/images");
		configureDao.save(param);
	}
	
	@Test
	public void testSaveWidth() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("image_width");
		param.setConfValue("205");
		configureDao.save(param);
	}
	
	@Test
	public void testSaveHomeWidth() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("home_image_w");
		param.setConfValue("150");
		configureDao.save(param);
	}
	
	@Test
	public void testSaveHeight() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("image_height");
		param.setConfValue("150");
		configureDao.save(param);
	}
	
	@Test
	public void testSaveHomeHeight() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("home_image_h");
		param.setConfValue("150");
		configureDao.save(param);
	}
	
	@Test
	public void testSaveImageBlank() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("image_blank");
		param.setConfValue("image_blank.png");
		configureDao.save(param);
	}
	
	@Test
	public void testSaveProfileBlank() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("profile_blank");
		param.setConfValue("profile_blank.jpg");
		configureDao.save(param);
	}
	
	@Test
	public void testSaveImageUrl() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("image_url");
		param.setConfValue("http://192.168.17.153:8090");
		configureDao.save(param);
	}
	
	@Test
	public void testSaveMatch() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("match");
		param.setConfValue("YT:阳台,LT:凉台");
		configureDao.save(param);
	}
}
