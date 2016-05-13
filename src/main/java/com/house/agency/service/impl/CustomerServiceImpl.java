package com.house.agency.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.house.agency.dao.ICustomerDao;
import com.house.agency.entity.Customer;
import com.house.agency.page.IPage;
import com.house.agency.page.IPagination;
import com.house.agency.page.Pager;
import com.house.agency.param.CustomerQueryParam;
import com.house.agency.service.ICustomerService;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao customerDao;
	
	@Override
	public void save(Customer param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		int count = customerDao.save(param);
		if (count < 1) {
			throw new ServiceException("新增失败");
		}
	}

	@Override
	public void update(Customer param) {
		param.setUpdateTime(new Date());
		int count = customerDao.update(param);
		if (count < 1) {
			throw new ServiceException("修改失败");
		}
	}

	@Override
	public void deleteById(String id) {
		int count = customerDao.deleteById(id);
		if (count < 1) {
			throw new ServiceException("删除失败");
		}
	}

	@Override
	public Customer getDataById(String id) {
		return customerDao.getDataById(id);
	}

	@Override
	public IPage<Customer> query(final CustomerQueryParam param, int page, int rows) {
		int pageNo = page <= 0 ? 1 : page;
		int pageSize = rows <= 0 ? 10 : rows;
		return Pager.execute(new IPagination<Customer>() {

			@Override
			public int count() {
				return customerDao.count(param);
			}

			@Override
			public List<Customer> query(int start, int end) {
				return customerDao.query(param, start, end);
			}
		}, pageNo, pageSize);
	}

	@Override
	public void saveOrUpdate(Customer param) {
		String id = param.getId();
		if (StringUtils.isEmpty(id)) {
			save(param);
		} else {
			update(param);
		}
	}

	@Override
	public List<Customer> queryDataByUid(String userId) {
		return customerDao.queryDataByUid(userId);
	}

}
