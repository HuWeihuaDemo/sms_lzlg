package com.apps.sms.dao;

import java.util.List;

import com.apps.sms.bean.StudentCourse;

public interface StudentCourseDao {
	List<StudentCourse>selectAll();
	//插入
	void insert(StudentCourse studentcourse);
	//更新
	void update(StudentCourse studentcourse);
	
	
	
}
