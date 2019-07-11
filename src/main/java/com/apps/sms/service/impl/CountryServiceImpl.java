package com.apps.sms.service.impl;


	import java.util.List;

	import javax.annotation.Resource;

	import org.springframework.stereotype.Service;

	import com.apps.sms.bean.Country;
	import com.apps.sms.dao.CountryDao;
	import com.apps.sms.service.CountryService;

	/**
	 * 校园逻辑处理的实现类
	 * @author Administrator
	 *
	 */
	@Service
	public class CountryServiceImpl implements CountryService{
		// 依赖注入，实例化SchoolDao并且赋值给schoolDao这个变量
		@Resource
		private CountryDao countryDao;

		@Override
		public List<Country> selectAll() {
			// TODO Auto-generated method stub
			return countryDao.selectAll();
		}

		@Override
		public void saveOrUpdate(Country country) throws Exception {
			if(country.getId()==null) {
				countryDao.insert(country);
			} else {
				countryDao.update(country);
			}
			
		}
}
