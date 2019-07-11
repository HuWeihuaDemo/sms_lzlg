package com.apps.sms.dao;

import java.util.List;

import com.apps.sms.bean.College;

//数据部分
public interface CollegeDao {
	//查询所有
	List<College> selectAll();
	 
//select插入	
	void insert(College  college);
	
//update更新	
	void  update(College college);
//通过id删除
	void deleteById(long id);


}

