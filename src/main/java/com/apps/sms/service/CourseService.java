package com.apps.sms.service;

import java.util.List;

import com.apps.sms.bean.Course;
 
//业务逻辑部分
public interface CourseService {
	List<Course> selectAll(); 
	void saveOrUpdate(Course course)throws Exception;
	void deleteById(long id) throws Exception;
	
}
 