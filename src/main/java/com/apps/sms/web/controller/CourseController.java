package com.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.sms.bean.Course;
import com.apps.sms.service.CourseService;

//接受参数，返回结果
@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@PostMapping("saveOrUpdate")
	public String saveOrUpdate(Course course) {
		try {
			courseService.saveOrUpdate(course);
			return "保存或成功更新";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return  e.getMessage();
		}
	}
	
	//http://localhost:8080/course/selectAll
	@GetMapping("selectAll")
	public List<Course>selectAll(){
		return courseService.selectAll();
	}
	//http:localhost:8080/course/deleteById?id=3
	@GetMapping("deleteById")
	public String deleteById(long id) {
		try {
			courseService.deleteById(id);
			return "删除成功";
		} catch (Exception e) {
			//打印异常信息，返回异常信息
			// TODO: handle exception
			e.printStackTrace();
			return e.getMessage();
		}
		
		
	}
}
