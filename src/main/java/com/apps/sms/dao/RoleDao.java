package com.apps.sms.dao;

import java.util.List;

import com.apps.sms.bean.Role;

public interface RoleDao {
     List<Role> selectAll();
     void insert(Role role);
     void update(Role role);

}
