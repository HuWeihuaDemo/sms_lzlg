package com.apps.sms.dao;

import java.util.List;

import com.apps.sms.bean.Role;

public interface RoleDao {
	List<Role>selectAll();
	//插入
	void insert(Role role);
	//更新
	void update(Role role);
	//通过ID删除
	void deleteById(long id);
	
	
	
}
