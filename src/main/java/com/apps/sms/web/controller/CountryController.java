package com.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.apps.sms.bean.Country;
import com.apps.sms.service.CountryService;

public class CountryController {
	
	@Autowired
	private CountryService CountryService;

	// http://localhost:8080/school/selectAll
	@GetMapping("selectAll")
	public List<Country> selectAll(){
		return CountryService.selectAll();
	}

}
