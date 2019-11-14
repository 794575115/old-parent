package com.old.ssm.service;

import java.util.List;

import org.old.ssm.entity.Role;

public interface RoleService {

	List<Role> queryAllRoles();
	
	Role roleAddPermission(int rid);
	
	void addRole(Role role,String[] permissionStrings);
	
	void removeRoleById(int id);
	
	void updateRole(Role role,String[] permissionStrings);
		
}
