package com.apps.sms.service;

		import java.util.List;
		import com.apps.sms.bean.Role;
		public interface RoleService {

			List<Role>selectAll();

			void saveOrUpdate(Role role) throws Exception;
		
        
        void deleteById(long id) throws Exception;

		
		}
