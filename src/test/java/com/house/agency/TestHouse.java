package com.house.agency;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.dao.IHouseDao;
import com.house.agency.entity.House;
import com.house.agency.entity.Image;
import com.house.agency.service.IImageService;

public class TestHouse extends BaseJunitTest {
	
	private String[] datas = {"5bdc50153ef6bbe1f7a-皇庭世纪-2011-福田滨河大道与益田路交汇处-building/FreOSWmiGjCOyPbwZb950UrTJtH7.jpg",
			"dd3812153ef6bbe1f7b-江南名苑-2001-福田福强路2143号-building/dcq2_jg9HbEuTUN9sVHEIov88R8.jpg",
			"8c436b153ef6bbe1f7c-水畔紫云阁-1999-福田滨河路以南（皇岗口岸以东）-building/FpW5nXd5jnIpe_T0EWmceMlfycdY.jpg",
			//"9e5c73153ef6bbe1f7d-晨晖家园-2000-皇岗公园一街-building/FgO_aADUXGU5AoUcNacpVzgYy_xw.jpg",
			//"c791b9153ef6bbe1f7e-高发城驰苑-2003-福田区福民路与益田路交汇处东南-building/FhgoN9GAAbqYCwr1qppo7sUd1UXx.jpg",
			//"3020ad153ef6bbe1f7f-银庄大厦-2005-福田区金田南路1013号-building/Ftta10E5Y5j7Vel48VThD6JQT3U9.jpg",
			"b15692153ef6bbe1f7g-皇岗花园-2010-福田福田南彩田南路-building/Fvx1S6tUIbana5ZJO6ltCUD5FJG0.jpg",
			"aa9f99153ef6bbe1f7h-皇御苑三期-1998-福田福田南路7号-building/FtsedJmt0GVzzf_WuwzPAcqqVsJa.jpg",
			"d42d08153ef6bbe1f7i-皇庭彩园-2006-福田金田路与福民路的交汇处-building/KSeAru7h6IAPAt71vnG530uClqQ.jpg",
			"d86fd3153ef6bbe1f7j-骏皇名居-2004-福田丹桂路与金桂路交汇处-building/FkQuAg9hWsFCC6LXhqKeY2khLkIW.jpg"};
	

	@Autowired
	private IHouseDao houseDao;
	
	@Autowired
	private IImageService imageService;
	
	@Test
	public void testSaveHouse() {
		for (int i = 0; i < datas.length; i++) {
			String[] data = datas[i].split("-");
			House param = new House();
			param.setId(data[0] + "13");
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setBuildingUnitId(data[0] + "01");
			param.setArea(10000 + i);
			param.setFloor(10 + i);
			param.setRoom(3);
			param.setSaloon(1);
			param.setToilet(1);
			param.setFace("1");
			houseDao.save(param);
		}
		
	}
	
	@Test
	public void testQueryHouse() {
		
	}
	
	@Test
	public void testSaveHouseImage() {
		Image param = new Image();
		param.setForeignId("a24882153c65581f28000");
		param.setUserId("1870dc153c592f7578000");
		param.setType("2");
		param.setUrl("/images/3.jpg");
		param.setTitle("户型图");
		imageService.save(param);
	}
}
