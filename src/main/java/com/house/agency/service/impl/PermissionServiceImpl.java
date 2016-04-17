package com.house.agency.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.agency.dao.IPermissionDao;
import com.house.agency.entity.Permission;
import com.house.agency.page.IPage;
import com.house.agency.page.Page;
import com.house.agency.param.PermissionQueryParam;
import com.house.agency.service.IPermissionService;
import com.myself.common.utils.UIDGeneratorUtil;

@Service("permissionService")
public class PermissionServiceImpl implements IPermissionService {

	@Autowired
	private IPermissionDao permissionDao;
	
	public List<Permission> queryPermissionsByRoleId(String roleId) {
		return permissionDao.queryPermissionsByRoleId(roleId);
	}

	public int save(Permission param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		return permissionDao.save(param);
	}

	public int update(Permission param) {
		return permissionDao.update(param);
	}

	public int delete(Permission param) {
		return permissionDao.delete(param);
	}

	public Permission getData(Permission param) {
		return permissionDao.getData(param);
	}

	public List<Permission> list(PermissionQueryParam param) {
		List<Permission> datas = new ArrayList<Permission>();
		List<Permission> permissions = permissionDao.list(param);
		for (Permission permission : permissions) {
			datas.add(permission);
			param.setParentId(permission.getId());
			datas.addAll(permissionDao.list(param));
		}
		return datas;
	}

	@Override
	public IPage<Permission> query(PermissionQueryParam param) {
		IPage<Permission> page = null;
		int count = permissionDao.count(param);
		if (count > 0) {
			int pageNo = (param.getPage() <= 0) ? 1 : param.getPage();
			int start = (pageNo - 1) * param.getLength();
			int end = param.getLength();
			List<Permission> list = permissionDao.query(param, start, end);
			page = new Page<Permission>(list, count, pageNo, end);
		} else {
			page = new Page<Permission>(new ArrayList<Permission>(), 0, 1, 1);
		}
		return page;
	}

	@Override
	public List<Permission> queryPermissions() {
		return permissionDao.queryPermissions();
	}
}
