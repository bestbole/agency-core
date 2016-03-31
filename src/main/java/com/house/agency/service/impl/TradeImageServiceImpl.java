package com.house.agency.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.agency.dao.ITradeImageDao;
import com.house.agency.entity.TradeImage;
import com.house.agency.service.ITradeImageService;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("tradeImageService")
public class TradeImageServiceImpl implements ITradeImageService {

	@Autowired
	private ITradeImageDao tradeImageDao;
	
	
	@Override
	public void save(TradeImage param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		int count = tradeImageDao.save(param);
		if (count < 1) {
			throw new ServiceException("新增失败");
		}
	}

	@Override
	public void update(TradeImage param) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public TradeImage getDataById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
