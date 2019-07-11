package com.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apps.sms.bean.School;
import com.apps.sms.bean.UserRole;
import com.apps.sms.dao.SchoolDao;
import com.apps.sms.dao.UserRoleDao;
import com.apps.sms.service.SchoolService;
import com.apps.sms.service.UserRoleService;

/**
 * 校园逻辑处理的实现类
 * @author Administrator
 *
 */
@Service
public class UserRoleImpl implements UserRoleService{
	// 依赖注入，实例化UserRoleDao并且赋值给userroleDao这个变量
	@Resource
	private UserRoleDao userrolDao;

	@Override
	public List<UserRole> selectAll() {
		// TODO Auto-generated method stub
		return userrolDao.selectAll();
	}

	@Override
	public void saveOrUpdate(UserRole userrole) throws Exception {
		if(userrole.getId()==null) {
			userrolDao.insert(userrole);
		} else {
			userrolDao.update(userrole);
		}
		
	}
}
