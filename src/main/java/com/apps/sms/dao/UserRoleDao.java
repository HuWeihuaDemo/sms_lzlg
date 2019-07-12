package com.apps.sms.dao;

import java.util.List;

import com.apps.sms.bean.UserRole;

public interface UserRoleDao {
	// 查询所有
	List<UserRole> selectAll();
	
	// 插入
	void insert(UserRole user_role);
		
	// 更新
	void update(UserRole user_role);
	
	// 删除
	void deleteById(long id);
}
