package com.apps.sms.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apps.sms.bean.Clazz;

import com.apps.sms.dao.ClazzDao;

import com.apps.sms.service.ClazzService;


/**
 * 校园逻辑处理的实现类
 * @author Administrator
 *
 */
@Service
public class ClazzServiceImpl implements ClazzService{
	// 依赖注入，实例化clazzDao并且赋值给clazzDao这个变量
	@Resource
	private ClazzDao clazzDao;

	@Override
	public List<Clazz> selectAll() {
		// TODO Auto-generated method stub
		return clazzDao.selectAll();
	}

	@Override
	public void saveOrUpdate(Clazz clazz) throws Exception {
		if(clazz.getId()==null) {
			clazzDao.insert(clazz);
		} else {
			clazzDao.update(clazz);
		}
		
	
	}
	
	@Override
	public void deleteById(long id) throws Exception {
		clazzDao.deleteById(id);
	}
}
