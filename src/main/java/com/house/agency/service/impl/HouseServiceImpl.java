package com.house.agency.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.house.agency.dao.IConfigureDao;
import com.house.agency.dao.IHouseDao;
import com.house.agency.data.HouseData;
import com.house.agency.data.HouseInfoData;
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
import com.myself.common.utils.ImageUtil;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("houseService")
public class HouseServiceImpl implements IHouseService {

	private final static Logger logger = LoggerFactory
			.getLogger(HouseServiceImpl.class);
	
	@Autowired
	private IHouseDao houseDao;
	
	@Autowired
	private IConfigureDao configureDao;

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
			setList(list);
		}
		return new Page<HouseData>(list, count, page, rows);
	}

	private void setList(List<HouseData> list) {
		String path = configureDao.getValueByKey("upload_folder");
		String width = configureDao.getValueByKey("image_width");
		String height = configureDao.getValueByKey("image_height");
		String blank = configureDao.getValueByKey("image_blank");
		for (int i = 0; i < list.size(); i++) {
			HouseData houseData = list.get(i);
			String url = houseData.getUrl();
			if (StringUtils.isEmpty(url)) {
				url = blank;
			} else {
				try {
					url = ImageUtil.creMinImage(url, Integer.parseInt(width), Integer.parseInt(height), path);
				} catch (Exception e) {
					logger.info("生成图片出错");
				}
			}
			houseData.setUrl(url);
			list.set(i, houseData);
		}
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
