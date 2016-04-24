package com.house.agency.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.agency.dao.IHouseDao;
import com.house.agency.data.HouseInfoData;
import com.house.agency.data.HouseData;
import com.house.agency.data.home.HouseHomeData;
import com.house.agency.data.home.HouseHomeDescData;
import com.house.agency.data.manage.HouseManageData;
import com.house.agency.entity.House;
import com.house.agency.page.IPage;
import com.house.agency.page.Page;
import com.house.agency.param.HouseQueryParam;
import com.house.agency.param.home.HouseHomeQueryParam;
import com.house.agency.param.manage.HouseManageQueryParam;
import com.house.agency.service.IHouseService;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("houseService")
public class HouseServiceImpl implements IHouseService {

	@Autowired
	private IHouseDao houseDao;

	@Override
	public void save(House param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		int count = houseDao.save(param);
		if (count < 1) {
			throw new ServiceException("新增失败");
		}
	}

	@Override
	public void update(House param) {
		param.setUpdateTime(new Date());
		int count = houseDao.update(param);
		if (count < 1) {
			throw new ServiceException("更新失败");
		}
	}

	@Override
	public void deleteById(String id) {
		int count = houseDao.deleteById(id);
		if (count < 1) {
			throw new ServiceException("删除失败");
		}
	}

	@Override
	public House getDataById(String id) {
		return houseDao.getDataById(id);
	}

	@Override
	public IPage<House> query(HouseQueryParam param, int page, int rows) {
		List<House> list = null;
		page = page <= 0 ? 1 : page;
		rows = rows <= 0 ? 10 : rows;
		int count = houseDao.count(param);
		if (count > 0) {
			int start = (page - 1) * rows;
			int end = start + rows;
			list = houseDao.query(param, start, end);
		}
		return new Page<House>(list, count, page, rows);
	}

	@Override
	public IPage<HouseData> queryData(HouseQueryParam param, int page,
			int rows) {
		List<HouseData> list = null;
		page = page <= 0 ? 1 : page;
		rows = rows <= 0 ? 10 : rows;
		int count = houseDao.countData(param);
		if (count > 0) {
			int start = (page - 1) * rows;
			int end = start + rows;
			list = houseDao.queryData(param, start, end);
		}
		return new Page<HouseData>(list, count, page, rows);
	}

	@Override
	public HouseInfoData getData(String tradeId) {
		return houseDao.getData(tradeId);
	}

	@Override
	public List<HouseHomeDescData> queryByBuildingUnitId(String buildingUnitId) {
		return houseDao.queryByBuildingUnitId(buildingUnitId);
	}

	@Override
	public IPage<HouseManageData> queryManageData(HouseManageQueryParam param,
			int page, int rows) {
		List<HouseManageData> list = null;
		page = page <= 0 ? 1 : page;
		rows = rows <= 0 ? 10 : rows;
		int count = houseDao.countManageData(param);
		if (count > 0) {
			int start = (page - 1) * rows;
			int end = start + rows;
			list = houseDao.queryManageData(param, start, end);
		}
		return new Page<HouseManageData>(list, count, page, rows);
	}

	@Override
	public IPage<HouseHomeData> queryHomeData(HouseHomeQueryParam param, int page, int rows) {
		List<HouseHomeData> list = null;
		page = page <= 0 ? 1 : page;
		rows = rows <= 0 ? 10 : rows;
		int count = houseDao.countHomeData(param);
		if (count > 0) {
			int start = (page - 1) * rows;
			int end = start + rows;
			list = houseDao.queryHomeData(param, start, end);
		}
		return new Page<HouseHomeData>(list, count, page, rows);
	}
}
