package com.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	//http://localhost:8080/course/selectAll
	@GetMapping("selectAll")
	public List<Course>selectAll(){
		
		return courseService.selectAll();
	}

}
