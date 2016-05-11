package com.house.agency.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.house.agency.dao.IImageDao;
import com.house.agency.dao.ITradeDao;
import com.house.agency.entity.Image;
import com.house.agency.entity.Trade;
import com.house.agency.page.IPage;
import com.house.agency.page.Page;
import com.house.agency.param.ImageQueryParam;
import com.house.agency.param.TradeQueryParam;
import com.house.agency.service.ITradeService;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("tradeService")
public class TradeServiceImpl implements ITradeService {

	@Autowired
	private ITradeDao tradeDao;
	
	@Autowired
	private IImageDao imageDao;
	
	@Override
	public void save(Trade param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		Date date = new Date();
		param.setReleaseTime(date);
		param.setCreateTime(date);
		int count = tradeDao.save(param);
		if (count < 1) {
			throw new ServiceException("新增失败");
		}
	}

	@Override
	public void update(Trade param) {
		param.setUpdateTime(new Date());
		int count = tradeDao.update(param);
		if (count < 1) {
			throw new ServiceException("修改失败");
		}
	}

	@Override
	public void deleteById(String id) {
		int count = tradeDao.deleteById(id);
		if (count < 1) {
			throw new ServiceException("删除失败");
		}
	}

	@Override
	public Trade getDataById(String id) {
		return tradeDao.getDataById(id);
	}

	@Override
	public IPage<Trade> query(TradeQueryParam param, int page, int rows) {
		List<Trade> list = null;
		page = page <= 0 ? 1 : page;
		rows = rows <= 0 ? 10 : rows;
		int count = tradeDao.count(param);
		if (count > 0) {
			int start = (page - 1) * rows;
			int end = start + rows;
			list = tradeDao.query(param, start, end);
		}
		return new Page<Trade>(list, count, page, rows);
	}

	@Override
	public void saveOrUpdate(Trade param, String buildingId) {
		String id = param.getId();
		if (StringUtils.isEmpty(id)) {
			ImageQueryParam imageParam = new ImageQueryParam();
			imageParam.setForeignId(param.getHouseId());
			List<Image> houseImages = imageDao.queryDataByFid(imageParam);
			imageParam.setForeignId(buildingId);
			List<Image> buildingImages = imageDao.queryDataByFid(imageParam);
			
			int images = 0;
			Image image = null;
			if (CollectionUtils.isNotEmpty(houseImages)) {
				image = houseImages.get(0);
				images = + houseImages.size();
			} else if (CollectionUtils.isNotEmpty(buildingImages)) {
				image = buildingImages.get(0);
				images = + buildingImages.size();
			}
			param.setImages(images);
			if (image != null) {
				param.setImageId(image.getId());
			}
			save(param);
		} else {
			update(param);
		}
	}

}
