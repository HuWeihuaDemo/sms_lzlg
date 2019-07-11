package com.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apps.sms.bean.StudentCourse;
import com.apps.sms.dao.StudentCourseDao;
import com.apps.sms.service.StudentCourseService;

/**
 * 校园逻辑处理的实现类
 * @author Administrator
 *
 */
@Service
public class StudentCourseServiceImpl implements StudentCourseService{
	// 依赖注入，实例化StudentCourseDao并且赋值给studentcourseDao这个变量
	
	// 依赖注入，实例化StudentCourseDao并且赋值给studentcourseDao这个变量
	@Resource
	private StudentCourseDao studentcourseDao;

	@Override
	public List<StudentCourse> selectAll() {
		// TODO Auto-generated method stub
		return studentcourseDao.selectAll();
	}

	@Override
	public void saveOrUpdate(StudentCourse studentcourse) throws Exception {
		if(studentcourse.getId()==null) {
			studentcourseDao.insert(studentcourse);
		} else {
			studentcourseDao.update(studentcourse);
		}
	}
	@Override
	public void deleteById(long id) throws Exception{
		studentcourseDao.deleteById(id);
	}

}