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
@RequestMapping("/userrole")
public class UserRoleController {
	
	@Autowired
	private UserRoleService userRoleService;
	@PostMapping("saveOrUpdate")
	public String saveOrUpdate(UserRole userrole) {
		try {
			userRoleService.saveOrUpdate(userrole);
			return "保存或成功更新";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return  e.getMessage();
			}
		}
	
	// http://localhost:8080/userrole/selectAll
	@GetMapping("selectAll")
	public List<UserRole> selectAll(){
		return userRoleService.selectAll();
	}
	// http://localhost:8080/school/deleteById?id=3
		@GetMapping("deleteById")
		public String deleteById(long id) {
			try {
				userRoleService.deleteById(id);
				return "删除成功";
			} catch (Exception e) {
				// 打印异常信息，返回异常信息
				e.printStackTrace();
				return e.getMessage();
			}
			}
		}
			


