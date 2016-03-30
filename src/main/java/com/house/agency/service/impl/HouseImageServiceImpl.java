package com.house.agency.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.agency.dao.IHouseImageDao;
import com.house.agency.entity.HouseImage;
import com.house.agency.page.IPage;
import com.house.agency.page.Page;
import com.house.agency.param.HouseImageQueryParam;
import com.house.agency.service.IHouseImageService;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("houseImageService")
public class HouseImageServiceImpl implements IHouseImageService {

	@Autowired
	private IHouseImageDao houseImageDao;
	
	@Override
	public void save(HouseImage param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		int count = houseImageDao.save(param);
		if (count < 1) {
			throw new ServiceException("新增失败");
		}
	}

	@Override
	public void update(HouseImage param) {
		param.setUpdateTime(new Date());
		int count = houseImageDao.update(param);
		if (count < 1) {
			throw new ServiceException("更新失败");
		}
	}

	@Override
	public void deleteById(String id) {
		int count = houseImageDao.deleteById(id);
		if (count < 1) {
			throw new ServiceException("删除失败");
		}
	}

	@Override
	public HouseImage getDataById(String id) {
		return houseImageDao.getDataById(id);
	}

	@Override
	public IPage<HouseImage> query(HouseImageQueryParam param, int page, int rows) {
		List<HouseImage> list = null;
		page = page <= 0 ? 1 : page;
		rows = rows <= 0 ? 10 : rows;
		int count = houseImageDao.count(param);
		if (count > 0) {
			int start = (page - 1) * rows;
			int end = start + rows;
			list = houseImageDao.query(param, start, end);
		}
		return new Page<HouseImage>(list, count, page, rows);
	}
}
