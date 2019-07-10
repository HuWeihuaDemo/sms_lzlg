package com.apps.sms.service.impl;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apps.sms.bean.School;
import com.apps.sms.dao.SchoolDao;
import com.apps.sms.service.SchoolService;

/**
 * 校园逻辑处理的实现类
 * @author Administrator
 *
 */
@Service
public class SchoolServiceImpl implements SchoolService{
	// 依赖注入，实例化SchoolDao并且赋值给schoolDao这个变量
	
	// 依赖注入，实例化SchoolDao并且赋值给schoolDao这个变量
	@Resource
	private SchoolDao schoolDao;

	@Override
	public List<School> selectAll() {
		// TODO Auto-generated method stub
		return schoolDao.selectAll();
	}

	@Override
	public void saveOrUpdate(School school) throws Exception {
		if(school.getId()==null) {
			schoolDao.insert(school);
		} else {
			schoolDao.update(school);
		}
		
	}
}
