package com.apps.sms.dao;

import java.util.List;

import com.apps.sms.bean.User;

public interface UserDao {
	// 查询所有
	List<User> selectAll();
	
	// 插入
	void insert(User user);
		
	// 更新
	void update(User user);
}
