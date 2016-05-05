package com.house.agency.dao;

import java.util.List;

import com.house.agency.entity.Image;
import com.house.agency.param.ImageQueryParam;

public interface IImageDao {

	int save(Image param);

	int update(Image param);

	int deleteById(String id);

	Image getDataById(String id);

	int count(ImageQueryParam param);

	List<Image> query(ImageQueryParam param, int start, int end);

	List<Image> queryData(ImageQueryParam param);

	List<Image> listData(ImageQueryParam param);
	
	List<Image> queryDataByFuid(ImageQueryParam param);
}
