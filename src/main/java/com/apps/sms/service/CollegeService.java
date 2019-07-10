package com.apps.sms.service;

import java.util.List;

import com.apps.sms.bean.College;

public interface CollegeService {

	List<College> selectAll();
	void saveOrUpdate(College college) throws Exception;
}
