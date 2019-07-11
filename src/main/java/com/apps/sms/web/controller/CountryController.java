package com.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.sms.bean.Country;
import com.apps.sms.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {
	
	@Autowired
	private CountryService countryService;

	// http://localhost:8080/school/selectAll
	@GetMapping("selectAll")
	public List<Country> selectAll(){
		return countryService.selectAll();
	}

}
