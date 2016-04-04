package com.house.agency.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.agency.dao.IRegionDao;
import com.house.agency.entity.Region;
import com.house.agency.page.IPage;
import com.house.agency.param.RegionQueryParam;
import com.house.agency.service.IRegionService;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("regionService")
public class RegionServiceImpl implements IRegionService {

	@Autowired
	private IRegionDao regionDao;
	
	@Override
	public void save(Region param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		int count = regionDao.save(param);
		if (count < 1) {
			throw new ServiceException("新增失败");
		}
	}

	@Override
	public void update(Region param) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Region getDataById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPage<Region> query(RegionQueryParam param, int page, int rows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Region> list(RegionQueryParam param) {
		return regionDao.list(param);
	}

}
