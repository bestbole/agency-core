package com.house.agency.service.impl;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.agency.dao.IConfigureDao;
import com.house.agency.entity.Configure;
import com.house.agency.page.IPage;
import com.house.agency.param.ConfigureQueryParam;
import com.house.agency.service.IConfigureService;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("configureService")
public class ConfigureServiceImpl implements IConfigureService {

	@Autowired
	private IConfigureDao configureDao;
	
	@Override
	public void save(Configure param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		int count = configureDao.save(param);
		if (count < 1) {
			throw new ServiceException("新增失败");
		}
	}

	@Override
	public void update(Configure param) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Configure getDataById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPage<Configure> query(ConfigureQueryParam param, int page, int rows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValueByKey(String key) {
		return configureDao.getValueByKey(key);
	}

	@Override
	public Map<String, String> queryValueByKey(String key) {
		return configureDao.queryValueByKey(key);
	}

}
