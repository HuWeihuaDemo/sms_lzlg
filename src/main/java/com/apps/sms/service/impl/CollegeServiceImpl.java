package com.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apps.sms.bean.College;
import com.apps.sms.dao.CollegeDao;
import com.apps.sms.service.CollegeService;

/**
 * 校园逻辑处理的实现类
 * @author Administrator
 *
 */
@Service
public class CollegeServiceImpl implements CollegeService{
	// 依赖注入，实例化CollegeDao并且赋值给collegeDao这个变量
	@Resource
	private CollegeDao collegeDao;

	@Override
	public List<College> selectAll() {
		// TODO Auto-generated method stub
		return collegeDao.selectAll();
	}

	@Override
	public void saveOrUpdate(College college) throws Exception {
		if(college.getId()==null) {
			collegeDao.insert(college);
		} else {
			collegeDao.update(college);
		}
	}
}
