package com.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apps.sms.bean.UserRole;
import com.apps.sms.dao.UserRoleDao;
import com.apps.sms.service.UserRoleService;

/**
 * 校园逻辑处理的实现类
 * @author 李金珂
 *
 */
@Service
public class UserRoleServiceImpl implements UserRoleService{
	// 依赖注入，实例化UserRoleDao并且赋值给user_roleDao这个变量
	@Resource
	private UserRoleDao user_roleDao;

	@Override
	public List<UserRole> selectAll() {
		// TODO Auto-generated method stub
		return user_roleDao.selectAll();
	}

	@Override
	public void saveOrUpdate(UserRole user_role) throws Exception {
		if(user_role.getId()==null) {
			user_roleDao.insert(user_role);
		} else {
			user_roleDao.update(user_role);
			}
		}
	@Override
		public void deleteById(long id) throws Exception {
			user_roleDao.deleteById(id);
		}
		
	}


