package com.apps.sms.service;

import java.util.List;

import com.apps.sms.bean.User;

public interface UserService {

	List<User> selectAll();

	void saveOrUpdate(User user) throws Exception;

	void deleteById(long id) throws Exception;
}
