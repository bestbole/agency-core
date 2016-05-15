package com.house.agency.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.house.agency.dao.ICustomerRequireDao;
import com.house.agency.dao.ICustomerRequireNumDao;
import com.house.agency.dao.IHouseDao;
import com.house.agency.entity.CustomerRequire;
import com.house.agency.entity.CustomerRequireNum;
import com.house.agency.param.CustomerRequireQueryParam;
import com.house.agency.param.home.HouseHomeQueryParam;

@Service
public class CustomerRequireNumTask {

	@Autowired
	private ICustomerRequireDao customerRequireDao;
	
	@Autowired
	private ICustomerRequireNumDao customerRequireNumDao;
	
	@Autowired
	private IHouseDao houseDao;
	
	public void updateCustomerRequireNum() {
		CustomerRequireQueryParam param = new CustomerRequireQueryParam();
		List<CustomerRequire> customerRequires = customerRequireDao.queryAll(param);
		if (!CollectionUtils.isEmpty(customerRequires)) {
			for (CustomerRequire customerRequire : customerRequires) {
				
				HouseHomeQueryParam queryParam = new HouseHomeQueryParam();
				queryParam.setDistrictId(customerRequire.getDistrictIds());
				queryParam.setTownId(customerRequire.getTownIds());
				//queryParam.setBuildingId(customerRequire.getBuildingIds());
				//queryParam.setPriceBegin(customerRequire.getPriceBegin());
				//queryParam.setPriceEnd(customerRequire.getPriceEnd());
				//queryParam.setAreaBegin(customerRequire.getAreaBegin());
				//queryParam.setAreaEnd(customerRequire.getAreaEnd());
				queryParam.setRooms(customerRequire.getRooms());
				
				int num = houseDao.countByCustomerRequire(queryParam);
				System.out.println("count=" + num);
				
				CustomerRequireNum requireNum = new CustomerRequireNum();
				requireNum.setNum(num);
				requireNum.setRequireId(customerRequire.getId());
				int count = customerRequireNumDao.updateByRequireId(requireNum);
				if (count < 1) {
					continue;
				}
			}
		}
	}
}
