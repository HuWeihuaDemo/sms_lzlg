package com.apps.sms.dao;

import java.util.List;

import com.apps.sms.bean.Country;

public interface CountryDao {
	
	List<Country> selectAll();
	
	void insert(Country country);
	
	void update (Country country);
}
