package com.apps.sms.dao;

import java.util.List;

import com.apps.sms.bean.Clazz;


public interface ClazzDao {
	
	//查询所有
	List<Clazz> selectAll();
	
	//插入
	void insert(Clazz clazz);
	
	//更新
	void update(Clazz clazz);
	
	 
}
