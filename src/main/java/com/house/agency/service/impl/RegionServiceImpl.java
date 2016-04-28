package com.house.agency.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.agency.dao.IRegionDao;
import com.house.agency.data.manage.RegionManageData;
import com.house.agency.entity.Region;
import com.house.agency.page.IPage;
import com.house.agency.page.Page;
import com.house.agency.param.RegionQueryParam;
import com.house.agency.param.manage.RegionManageQueryParam;
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
		int count = regionDao.deleteById(id);
		if (count < 1) {
			throw new ServiceException("删除失败");
		}
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

	@Override
	public IPage<RegionManageData> queryManageData(RegionManageQueryParam param, int page, int rows) {
		List<RegionManageData> list = null;
		page = page <= 0 ? 1 : page;
		rows = rows <= 0 ? 10 : rows;
		int count = regionDao.countManageData(param);
		if (count > 0) {
			int start = (page - 1) * rows;
			int end = start + rows;
			list = regionDao.queryManageData(param, start, end);
		}
		return new Page<RegionManageData>(list, count, page, rows);
	}

}
