package com.house.agency.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.agency.dao.IBuildingDao;
import com.house.agency.entity.Building;
import com.house.agency.page.IPage;
import com.house.agency.page.Page;
import com.house.agency.param.BuildingQueryParam;
import com.house.agency.service.IBuildingService;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("buildingService")
public class BuildingServiceImpl implements IBuildingService {

	@Autowired
	private IBuildingDao buildingDao;
	
	@Override
	public void save(Building param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		int count = buildingDao.save(param);
		if (count < 1) {
			throw new ServiceException("新增失败");
		}
	}

	@Override
	public void update(Building param) {
		param.setUpdateTime(new Date());
		int count = buildingDao.update(param);
		if (count < 1) {
			throw new ServiceException("更新失败");
		}
	}

	@Override
	public void deleteById(String id) {
		int count = buildingDao.deleteById(id);
		if (count < 1) {
			throw new ServiceException("删除失败");
		}
	}

	@Override
	public Building getDataById(String id) {
		return buildingDao.getDataById(id);
	}

	@Override
	public IPage<Building> query(BuildingQueryParam param, int page, int rows) {
		List<Building> list = null;
		page = page <= 0 ? 1 : page;
		rows = rows <= 0 ? 10 : rows;
		int count = buildingDao.count(param);
		if (count > 0) {
			int start = (page - 1) * rows;
			int end = start + rows;
			list = buildingDao.query(param, start, end);
		}
		return new Page<Building>(list, count, page, rows);
	}

	@Override
	public List<Building> list(BuildingQueryParam param) {
		return buildingDao.list(param);
	}
}
