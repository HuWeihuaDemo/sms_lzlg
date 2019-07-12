package com.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.sms.bean.UserRole;
import com.apps.sms.service.UserRoleService;

@RestController
@RequestMapping("/user_role")
public class UserRoleController {
	
	@Autowired
	private UserRoleService user_roleService;
	@PostMapping("saveOrUpdate")
	public String saveOrUpdate(UserRole user_role) {
		try {
			user_roleService.saveOrUpdate(user_role);
			return "保存或成功更新";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return  e.getMessage();
			}
		}
	
	// http://localhost:8080/user_role/selectAll
	@GetMapping("selectAll")
	public List<UserRole> selectAll(){
		return user_roleService.selectAll();
	}
	// http://localhost:8080/user_role/deleteById?id=3
		@GetMapping("deleteById")
		public String deleteById(long id) {
			try {
				user_roleService.deleteById(id);
				return "删除成功";
			} catch (Exception e) {
				// 打印异常信息，返回异常信息
				e.printStackTrace();
				return e.getMessage();
			}
			}
		}
			


