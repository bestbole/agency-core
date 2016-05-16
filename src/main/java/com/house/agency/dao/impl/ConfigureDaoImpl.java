package com.house.agency.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.house.agency.dao.BaseDao;
import com.house.agency.dao.IConfigureDao;
import com.house.agency.entity.Configure;
import com.house.agency.mapper.IConfigureMapper;
import com.house.agency.param.ConfigureQueryParam;

@Repository
public class ConfigureDaoImpl extends BaseDao<IConfigureMapper> implements IConfigureDao {

	@Override
	public int save(Configure param) {
		IConfigureMapper mapper = getMapper(IConfigureMapper.class);
		return mapper.save(param);
	}

	@Override
	public int update(Configure param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Configure getDataById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(ConfigureQueryParam param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Configure> query(ConfigureQueryParam param, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValueByKey(String key) {
		IConfigureMapper mapper = getMapper(IConfigureMapper.class);
		return mapper.getValueByKey(key);
	}

	@Override
	public Map<String, String> queryValueByKey(String key) {
		Map<String, String> map = new HashMap<String, String>();
		IConfigureMapper mapper = getMapper(IConfigureMapper.class);
		List<Configure> configures = mapper.queryValueByKey(key);
		if (configures != null && configures.size() > 0) {
			for (Configure configure : configures) {
				map.put(configure.getConfKey(), configure.getConfValue());
			}
		}
		return map;
	}

}
