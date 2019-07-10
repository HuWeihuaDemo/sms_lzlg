package com.apps.sms.dao;

import java.util.List;

import com.apps.sms.bean.Course;

//数据部分
public interface CourseDao {
	//查询所有
	List<Course>selectAll();
	//插入
	void insert(Course course);
	//更新
	void update(Course course);

}
