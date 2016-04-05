package com.house.agency;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.dao.IRegionDao;
import com.house.agency.entity.Region;
import com.myself.common.utils.UIDGeneratorUtil;

public class TestRegion extends BaseJunitTest {

	@Autowired
	private IRegionDao regionDao;
	
	@Test
	public void testSaveRegionCity() {
		Region param = new Region();
		param.setId("53f67e153e44203258000");
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setName("深圳");
		param.setCode("SZ");
		param.setLevel("2");
		param.setSeq(1);
		regionDao.save(param);
	}
	
	@Test
	public void testSaveRegionDistrict() {
		String[] districts = {"福田-FT", "南山-NS", "罗湖-LH", "宝安-BA", "盐田-YT", "坪山新区-PSXQ", "光明新区-GMXQ", "大鹏新区-DPXQ", "龙华新区-LHXQ"};
		for (int i = 0; i < districts.length; i++) {
			String[] district = districts[i].split("-");
			String districtName = district[0];
			String districtCode = district[1];
			
			Region param = new Region();
			param.setId(UIDGeneratorUtil.getUID());
			param.setParentId("53f67e153e44203258000");
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setName(districtName);
			param.setCode(districtCode);
			param.setLevel("3");
			param.setSeq((i+1));
			regionDao.save(param);
		}
	}
	
	@Test
	public void testSaveRegionTown() {
		String[] districts = {"皇岗-HG", "景田-JT", "梅林-ML", "华强-HQ", "香蜜湖-XMH"};
		for (int i = 0; i < districts.length; i++) {
			String[] district = districts[i].split("-");
			String districtName = district[0];
			String districtCode = district[1];
			
			Region param = new Region();
			param.setId(UIDGeneratorUtil.getUID());
			param.setParentId("9f47b7153e44b5dd18000");
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setName(districtName);
			param.setCode(districtCode);
			param.setLevel("4");
			param.setSeq((i+1));
			regionDao.save(param);
		}
	}
}
