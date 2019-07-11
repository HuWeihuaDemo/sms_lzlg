package com.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.sms.bean.Country;
import com.apps.sms.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@PostMapping("saveOrUpdate")
	public String saveOrUpdate(Country country) {
		try {
			countryService.saveOrUpdate(country);
			return "保存或更新成功";
		}catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	// http://localhost:8080/school/selectAll
	@GetMapping("selectAll")
	public List<Country> selectAll(){
		return countryService.selectAll();
	}
	
	//http://localhost:8080/country/deleteBysId?id=3
	@GetMapping("deleteById")
	public String deleteById(long id) {
		try {
			countryService.deleteById(id);
			return "删除成功";
		}catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

}
