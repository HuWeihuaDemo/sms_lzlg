package com.apps.sms.dao;

import java.util.List;

import com.apps.sms.bean.Course;

//数据部分
public interface CourseDao {
	//查询所有
	List<Course>selectAll();
	//插入操作
	void insert(Course course);
	//更新 操作 
	void update(Course course);
	//通过id删除操作 
	void deleteById(long id);
	

}
  