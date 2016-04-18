package com.house.agency.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.agency.dao.IBuildingUnitDao;
import com.house.agency.entity.BuildingUnit;
import com.house.agency.page.IPage;
import com.house.agency.page.Page;
import com.house.agency.param.BuildingUnitQueryParam;
import com.house.agency.service.IBuildingUnitService;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("buildingUnitService")
public class BuildingUnitServiceImpl implements IBuildingUnitService {

	@Autowired
	private IBuildingUnitDao buildingUnitDao;
	
	@Override
	public void save(BuildingUnit param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		int count = buildingUnitDao.save(param);
		if (count < 1) {
			throw new ServiceException("新增失败");
		}
	}

	@Override
	public void update(BuildingUnit param) {
		param.setUpdateTime(new Date());
		int count = buildingUnitDao.update(param);
		if (count < 1) {
			throw new ServiceException("更新失败");
		}
	}

	@Override
	public void deleteById(String id) {
		int count = buildingUnitDao.deleteById(id);
		if (count < 1) {
			throw new ServiceException("删除失败");
		}
	}

	@Override
	public BuildingUnit getDataById(String id) {
		return buildingUnitDao.getDataById(id);
	}

	@Override
	public IPage<BuildingUnit> query(BuildingUnitQueryParam param, int page,
			int rows) {
		List<BuildingUnit> list = null;
		page = page <= 0 ? 1 : page;
		rows = rows <= 0 ? 10 : rows;
		int count = buildingUnitDao.count(param);
		if (count > 0) {
			int start = (page - 1) * rows;
			int end = start + rows;
			list = buildingUnitDao.query(param, start, end);
		}
		return new Page<BuildingUnit>(list, count, page, rows);
	}

	@Override
	public List<BuildingUnit> queryByBuildingId(String buildingId) {
		return buildingUnitDao.queryByBuildingId(buildingId);
	}

}
