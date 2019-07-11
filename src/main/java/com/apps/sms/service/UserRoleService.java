package com.apps.sms.service;

import java.util.List;

import com.apps.sms.bean.UserRole;

public interface UserRoleService {

	List<UserRole> selectAll();
	void saveOrUpdate(UserRole user_role) throws Exception;
	
	void deleteById(long id) throws Exception;
}
