package com.house.agency;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.entity.Region;
import com.house.agency.service.IRegionService;

public class TestRegion extends BaseJunitTest {

	@Autowired
	private IRegionService regionService;
	
	@Test
	public void testSaveRegion() {
		Region param = new Region();
		param.setParentId("942c18153e14af2758000");
		param.setName("福田");
		param.setCode("FT");
		param.setLevel("3");
		param.setSeq(1);
		regionService.save(param);
	}
}
