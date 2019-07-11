package com.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apps.sms.bean.Course;
import com.apps.sms.dao.CourseDao;
import com.apps.sms.service.CourseService;

/**
 * 校园逻辑逻辑处理的实现类
 *  @author 刘强
 * */
@Service
public class CourseServiceImpl implements CourseService {
	// 依赖注入，实例化SchoolDao并且赋值给schoolDao这个变量
	
	@Resource
	private CourseDao courseDao;
	
	@Override
	public List<Course> selectAll() {
		// TODO Auto-generated method stub
		return courseDao.selectAll();
	}

	@Override
	public void saveOrUpdate(Course course) throws Exception {
		// TODO Auto-generated method stub
		if(course.getId()==null) {
			courseDao.insert(course);
		} else {
			courseDao.update(course);
		}
	}
	@Override
	public void deleteById(long id)throws Exception{
	courseDao.deleteById(id);
	
}
}