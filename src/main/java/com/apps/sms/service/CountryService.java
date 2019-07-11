package com.apps.sms.service;

import java.util.List;

import com.apps.sms.bean.Country;

public interface CountryService {

	List<Country> selectAll();
	void saveOrUpdate(Country country) throws Exception;

}
