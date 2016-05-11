package com.house.agency.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.house.agency.dao.IImageDao;
import com.house.agency.dao.ITradeDao;
import com.house.agency.dao.ITradeImageDao;
import com.house.agency.entity.Image;
import com.house.agency.entity.Trade;
import com.house.agency.entity.TradeImage;
import com.house.agency.param.ImageQueryParam;
import com.house.agency.param.TradeImageParam;
import com.house.agency.service.ITradeImageService;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("tradeImageService")
public class TradeImageServiceImpl implements ITradeImageService {

	@Autowired
	private ITradeImageDao tradeImageDao;
	
	@Autowired
	private ITradeDao tradeDao;
	
	@Autowired
	private IImageDao imageDao;
	
	@Override
	public void save(TradeImage param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setCover("0");
		param.setStatus("1");
		param.setCreateTime(new Date());
		int count = tradeImageDao.save(param);
		if (count < 1) {
			param.setId(null);
			throw new ServiceException("新增失败");
		}
	}
	
	@Override
	public String saveData(TradeImageParam param) {
		TradeImage data = new TradeImage();
		data.setTradeId(param.getTradeId());
		data.setImageId(param.getImageId());
		save(data);
		
		int images = 0;
		ImageQueryParam imageParam = new ImageQueryParam();
		imageParam.setTradeId(param.getTradeId());
		List<Image> datas = imageDao.queryData(imageParam);
		if (CollectionUtils.isNotEmpty(datas)) {
			images += datas.size();
		}
		imageParam = new ImageQueryParam();
		imageParam.setForeignId(param.getHouseId());
		datas = imageDao.queryDataByFid(imageParam);
		if (CollectionUtils.isNotEmpty(datas)) {
			images += datas.size();
		}
		imageParam.setForeignId(param.getBuildingId());
		datas = imageDao.queryDataByFid(imageParam);
		if (CollectionUtils.isNotEmpty(datas)) {
			images += datas.size();
		}
		Trade trade = new Trade();
		trade.setId(param.getTradeId());
		trade.setImages(images);
		trade.setUpdateTime(new Date());
		int count = tradeDao.update(trade);
		if (count < 1) {
			throw new ServiceException("修改失败");
		}
		return data.getId();
	}

	@Override
	public void update(TradeImage param) {
		param.setUpdateTime(new Date());
		int count = tradeImageDao.update(param);
		if (count < 1) {
			throw new ServiceException("修改失败");
		}
	}

	@Override
	public void deleteById(String id) {
		int count = tradeImageDao.deleteById(id);
		if (count < 1) {
			throw new ServiceException("删除失败");
		}
	}

	@Override
	public TradeImage getDataById(String id) {
		return tradeImageDao.getDataById(id);
	}

	@Override
	@Transactional
	public void cover(TradeImage param) {
		tradeImageDao.clear(param.getTradeId());
		update(param);
		
		Trade trade = new Trade();
		trade.setId(param.getTradeId());
		trade.setImageId(param.getImageId());
		trade.setUpdateTime(new Date());
		int count = tradeDao.cover(trade);
		if (count < 1) {
			throw new ServiceException("封面设置失败");
		}
	}

}
