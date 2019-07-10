package com.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.apps.sms.bean.School;
import com.apps.sms.service.SchoolService;

public class SchoolController {
	
	@Autowired
	private SchoolService schoolService;

	// http://localhost:8080/school/selectAll
	@GetMapping("selectAll")
	public List<School> selectAll(){
		return schoolService.selectAll();
	}

}
