package com.apps.sms.dao;

import java.util.List;

import com.apps.sms.bean.Course;

//数据部分1
public interface CourseDao {
	//查询所有
	List<Course>selectAll();
	//插入
	void insert(Course course);
	//更新
	void update(Course course);
	//通过id删除
	void deleteById(long id);

}
