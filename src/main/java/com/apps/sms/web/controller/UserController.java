package com.apps.sms.web.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * java项目入口 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@GetMapping("findAll")
	public String findAll() {
		return "hello spring";
	}
}
