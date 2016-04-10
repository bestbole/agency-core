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
	

	@Autowired
	private IBuildingDao buildingDao;
	
	@Autowired
	private IBuildingUnitDao buildingUnitDao;
	
	@Autowired
	private IImageDao imageDao;

	@Test
	public void testSaveBuilding_FT() {
		for (int i = 0; i < Data.buildings_FT.length; i++) {
			String[] data = Data.buildings_FT[i].split("-");
			Building param = new Building();
			param.setId(Data.buildingId + Data.getNum(i + 1));
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setTownId(Data.townId + "001");
			param.setBuildingName(data[0]);
			param.setBuildingYear(data[1]);
			param.setBuildingAddress(data[2]);
			param.setType("1");
			param.setSubway(Integer.parseInt(data[4]));
			buildingDao.save(param);
		}
		
	}
	
	@Test
	public void testSaveBuildingImage_FT() {
		for (int i = 0; i < Data.buildings_FT.length; i++) {
			String[] data = Data.buildings_FT[i].split("-");
			Image param = new Image();
			param.setId(Data.buildingImageId + Data.getNum(i + 1));
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setForeignId(Data.buildingId + Data.getNum(i + 1));
			param.setType("1");
			param.setUrl(data[3]);
			param.setTitle("楼盘图");
			imageDao.save(param);
		}
	}
	
	@Test
	public void testSaveBuildingUnit_FT() {
		for (int i = 0; i < Data.buildings_FT.length; i++) {
			String[] data = Data.buildings_FT[i].split("-");
			BuildingUnit param = new BuildingUnit();
			param.setId(Data.buildingUnitId + Data.getNum(i + 1));
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setBuildingId(Data.buildingId + Data.getNum(i + 1));
			param.setName("A栋");
			param.setFloor(20 + i);
			buildingUnitDao.save(param);
		}
		
	}
}
