package com.house.agency.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.house.agency.dao.ICustomerRequireDao;
import com.house.agency.entity.CustomerRequire;
import com.house.agency.page.IPage;
import com.house.agency.page.IPagination;
import com.house.agency.page.Pager;
import com.house.agency.param.CustomerRequireQueryParam;
import com.house.agency.service.ICustomerRequireService;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("customerRequireService")
public class CustomerRequireServiceImpl implements ICustomerRequireService {

	@Autowired
	private ICustomerRequireDao customerRequireDao;
	
	@Override
	public void save(CustomerRequire param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		int count = customerRequireDao.save(param);
		if (count < 1) {
			throw new ServiceException("新增失败");
		}
	}

	@Override
	public void update(CustomerRequire param) {
		param.setUpdateTime(new Date());
		int count = customerRequireDao.update(param);
		if (count < 1) {
			throw new ServiceException("修改失败");
		}
	}

	@Override
	public void deleteById(String id) {
		int count = customerRequireDao.deleteById(id);
		if (count < 1) {
			throw new ServiceException("删除失败");
		}
	}

	@Override
	public CustomerRequire getDataById(String id) {
		return customerRequireDao.getDataById(id);
	}

	@Override
	public IPage<CustomerRequire> query(final CustomerRequireQueryParam param,
			int page, int rows) {
		int pageNo = page <= 0 ? 1 : page;
		int pageSize = rows <= 0 ? 10 : rows;
		return Pager.execute(new IPagination<CustomerRequire>() {

			@Override
			public int count() {
				return customerRequireDao.count(param);
			}

			@Override
			public List<CustomerRequire> query(int start, int end) {
				return customerRequireDao.query(param, start, end);
			}
		}, pageNo, pageSize);
	}

	@Override
	public void saveOrUpdate(CustomerRequire param) {
		String id = param.getId();
		if (StringUtils.isEmpty(id)) {
			save(param);
		} else {
			update(param);
		}
	}

}
