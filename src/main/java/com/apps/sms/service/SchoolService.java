package com.apps.sms.service;

import java.util.List;

import com.apps.sms.bean.School;

public interface SchoolService {

	List<School> selectAll();
	void saveOrUpdate(School school) throws Exception;
}
