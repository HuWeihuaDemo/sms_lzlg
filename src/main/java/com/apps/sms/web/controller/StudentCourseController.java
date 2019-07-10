package com.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.sms.bean.StudentCourse;
import com.apps.sms.service.StudentCourseService;
@RestController
@RequestMapping("/studentcourse")
public class StudentCourseController {
	
	@Autowired
	private StudentCourseService studentcourseService;

	// http://localhost:8080/studentcourse/selectAll
	@GetMapping("selectAll")
	public List<StudentCourse>selectAll(){
		return studentcourseService.selectAll();
	}

}

