package com.apps.sms.dao;

import java.util.List;

import com.apps.sms.bean.Country;

public interface CountryDao {
	//查询所有
	List<Country> selectAll();
	
	//插入
	void insert(Country country);
	
	//更新
	void update (Country country);
	
	//通过ID删除
	void deleteById(long id);
}
