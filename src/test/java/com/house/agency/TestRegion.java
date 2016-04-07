package com.house.agency;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.dao.IRegionDao;
import com.house.agency.entity.Region;
import com.myself.common.utils.UIDGeneratorUtil;

public class TestRegion extends BaseJunitTest {
	
	private String cityId = "53f67e153e44203258000";
	
	private String[] datas = { "5bdc50153ef6bbe1f7a-福田-FT",
			"dd3812153ef6bbe1f7b-南山-NS", "8c436b153ef6bbe1f7c-罗湖-LH",
			"9e5c73153ef6bbe1f7d-宝安-BA", "c791b9153ef6bbe1f7e-盐田-YT",
			"3020ad153ef6bbe1f7f-坪山新区-PSXQ", "b15692153ef6bbe1f7g-光明新区-GMXQ",
			"aa9f99153ef6bbe1f7h-大鹏新区-DPXQ", "d42d08153ef6bbe1f7i-龙华新区-LHXQ" };
	
	private String[] towns = { "5bdc50153ef6bbe1f6a-皇岗-HG",
			"dd3812153ef6bbe1f6b-景田-JT", "8c436b153ef6bbe1f6c-梅林-ML",
			"9e5c73153ef6bbe1f6d-华强-HQ", "c791b9153ef6bbe1f6e-香蜜湖-XMH" };

	@Autowired
	private IRegionDao regionDao;
	
	@Test
	public void testSaveRegionCity() {
		Region param = new Region();
		param.setId(cityId);
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setName("深圳");
		param.setCode("SZ");
		param.setLevel("2");
		param.setSeq(1);
		regionDao.save(param);
	}
	
	@Test
	public void testSaveRegionDistricts() {
		for (int i = 0; i < datas.length; i++) {
			String[] data = datas[i].split("-");
			Region param = new Region();
			param.setId(data[0] + "10");
			param.setParentId(cityId);
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setName(data[1]);
			param.setCode(data[2]);
			param.setLevel("3");
			param.setSeq((i+1));
			regionDao.save(param);
		}
		
	}
	
	
	@Test
	public void testSaveRegionTowns() {
		String[] district = datas[0].split("-");
		for (int i = 0; i < towns.length; i++) {
			String[] data = towns[i].split("-");

			Region param = new Region();
			param.setId(data[0] + "00");
			param.setParentId(district[0] + "10");
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setName(data[1]);
			param.setCode(data[2]);
			param.setLevel("4");
			param.setSeq((i+1));
			regionDao.save(param);
		}
	}
}
