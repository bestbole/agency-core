package com.house.agency;

import java.util.Date;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.dao.IConfigureDao;
import com.house.agency.entity.Configure;
import com.house.agency.enums.ConfigureEnum;
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
		
		String keys = "'" + ConfigureEnum.UPLOAD_FOLDER.getValue() + "','" + ConfigureEnum.IMAGE_WIDTH.getValue() + "'";
		Map<String, String> map = configureDao.queryValueByKey(keys);
		System.out.println(map.size());
		System.out.println(map.get(ConfigureEnum.UPLOAD_FOLDER.getValue()));
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
	public void testSaveMatchs() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("matchs");
		param.setConfValue("1:阳台,2:凉台");
		configureDao.save(param);
	}
	
	@Test
	public void testSaveFaces() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("faces");
		param.setConfValue("1:东,2:南,3:西,4:北");
		configureDao.save(param);
	}
	
	@Test
	public void testSaveRooms() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("rooms");
		param.setConfValue("1:1室,2:2室,3:3室,4:4室,5:5室");
		configureDao.save(param);
	}
	
	@Test
	public void testSaveSaloons() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("saloons");
		param.setConfValue("1:1厅,2:2厅,3:3厅,4:4厅,5:5厅");
		configureDao.save(param);
	}
	
	@Test
	public void testSaveToilets() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("toilets");
		param.setConfValue("1:1卫,2:2卫,3:3卫,4:4卫,5:5卫");
		configureDao.save(param);
	}
	
	@Test
	public void testSaveFitments() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("fitments");
		param.setConfValue("1:毛坯,2:简装,3:精装");
		configureDao.save(param);
	}
	
	@Test
	public void testSavePropertys() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("propertys");
		param.setConfValue("1:个人产权");
		configureDao.save(param);
	}
	
	@Test
	public void testSaveBuildingType() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("building_types");
		param.setConfValue("1:住宅,2:写字楼");
		configureDao.save(param);
	}
	
	@Test
	public void testSavePrices() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("prices");
		param.setConfValue("1-100:100万以下,100-200:100万-200万,200-300:200万-300万,300-400:300万-400万");
		configureDao.save(param);
	}
	
	@Test
	public void testSaveAreas() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("areas");
		param.setConfValue("1-50:50平米以下,50-70:50-70平米,70-90:70-90平米,90-120:90-120平米,120-150:120-150平米,150-200:150-200平米");
		configureDao.save(param);
	}
	
	@Test
	public void testSavePatterns() {
		Configure param = new Configure();
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setConfKey("patterns");
		param.setConfValue("1:一室,2:二室,3:三室,4:四室,5:五室,5-gt:五室以上");
		configureDao.save(param);
	}
}
