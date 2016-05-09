package com.house.agency.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.agency.dao.ITradeDao;
import com.house.agency.entity.Trade;
import com.house.agency.page.IPage;
import com.house.agency.page.Page;
import com.house.agency.param.TradeQueryParam;
import com.house.agency.service.ITradeService;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("tradeService")
public class TradeServiceImpl implements ITradeService {

	@Autowired
	private ITradeDao tradeDao;
	
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
		// TODO Auto-generated method stub

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

}
