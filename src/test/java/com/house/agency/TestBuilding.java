package com.house.agency;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.dao.IBuildingDao;
import com.house.agency.dao.IBuildingUnitDao;
import com.house.agency.dao.IImageDao;
import com.house.agency.entity.Building;
import com.house.agency.entity.BuildingUnit;
import com.house.agency.entity.Image;

public class TestBuilding extends BaseJunitTest {
	
	private String[] datas = {"5bdc50153ef6bbe1f7a-皇庭世纪-2011-福田滨河大道与益田路交汇处-building/FreOSWmiGjCOyPbwZb950UrTJtH7.jpg",
			"dd3812153ef6bbe1f7b-江南名苑-2001-福田福强路2143号-building/dcq2_jg9HbEuTUN9sVHEIov88R8.jpg",
			"8c436b153ef6bbe1f7c-水畔紫云阁-1999-福田滨河路以南（皇岗口岸以东）-building/FpW5nXd5jnIpe_T0EWmceMlfycdY.jpg",
			"9e5c73153ef6bbe1f7d-晨晖家园-2000-皇岗公园一街-building/FgO_aADUXGU5AoUcNacpVzgYy_xw.jpg",
			"c791b9153ef6bbe1f7e-高发城驰苑-2003-福田区福民路与益田路交汇处东南-building/FhgoN9GAAbqYCwr1qppo7sUd1UXx.jpg",
			"3020ad153ef6bbe1f7f-银庄大厦-2005-福田区金田南路1013号-building/Ftta10E5Y5j7Vel48VThD6JQT3U9.jpg",
			"b15692153ef6bbe1f7g-皇岗花园-2010-福田福田南彩田南路-building/Fvx1S6tUIbana5ZJO6ltCUD5FJG0.jpg",
			"aa9f99153ef6bbe1f7h-皇御苑三期-1998-福田福田南路7号-building/FtsedJmt0GVzzf_WuwzPAcqqVsJa.jpg",
			"d42d08153ef6bbe1f7i-皇庭彩园-2006-福田金田路与福民路的交汇处-building/KSeAru7h6IAPAt71vnG530uClqQ.jpg",
			"d86fd3153ef6bbe1f7j-骏皇名居-2004-福田丹桂路与金桂路交汇处-building/FkQuAg9hWsFCC6LXhqKeY2khLkIW.jpg"};

	@Autowired
	private IBuildingDao buildingDao;
	
	@Autowired
	private IBuildingUnitDao buildingUnitDao;
	
	@Autowired
	private IImageDao imageDao;

	@Test
	public void testSaveBuilding() {
		for (int i = 0; i < datas.length; i++) {
			String[] data = datas[i].split("-");
			Building param = new Building();
			param.setId(data[0] + "00");
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setTownId("5bdc50153ef6bbe1f6a00");
			param.setBuildingName(data[1]);
			param.setBuildingYear(data[2]);
			param.setBuildingAddress(data[3]);
			param.setType("1");
			buildingDao.save(param);
		}
		
	}
	
	@Test
	public void testSaveBuildingImage() {
		for (int i = 0; i < datas.length; i++) {
			String[] data = datas[i].split("-");
			Image param = new Image();
			param.setId(data[0] + "02");
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setForeignId(data[0] + "00");
			param.setType("1");
			param.setUrl(data[4]);
			param.setTitle("楼盘图");
			imageDao.save(param);
		}
		
	}
	
	@Test
	public void testSaveBuildingUnit() {
		for (int i = 0; i < datas.length; i++) {
			String[] data = datas[i].split("-");
			BuildingUnit param = new BuildingUnit();
			param.setId(data[0] + "01");
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setBuildingId(data[0] + "00");
			param.setName("A栋");
			param.setFloor(20 + i);
			buildingUnitDao.save(param);
		}
		
		
	}
}
