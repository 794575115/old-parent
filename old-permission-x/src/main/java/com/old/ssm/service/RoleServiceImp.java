package com.old.ssm.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.old.ssm.entity.Permission;
import org.old.ssm.entity.Role;
import org.old.ssm.entity.RolePermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.old.ssm.mapper.PermissionMapper;
import com.old.ssm.mapper.RoleMapper;
import com.old.ssm.mapper.RolePermissionMapper;

@Service
public class RoleServiceImp implements RoleService {

	@Autowired
	private RoleMapper roleMapper;
	@Autowired
	private PermissionMapper permissionMapper;
	@Autowired
	private RolePermissionMapper rolePermissionMapper;

	private RolePermission rolePermission = new RolePermission();

	private Permission permission = new Permission();
	
	@Override
	public List<Role> queryAllRoles() {
		List<Role> roles = roleMapper.findAllRoles();
		Iterator<Role> iterator = roles.iterator();
		while(true) {
			if(iterator.hasNext()) {
				iterator.next().getId();
			}else {
				break;
			}
		}
		
		return roles;
	}

	@Override
	public Role roleAddPermission(int rid) {
		Role role = roleMapper.findById(rid);
		List<Permission> permissions = new ArrayList<Permission>();
		List<RolePermission> rolePermissions = rolePermissionMapper.findByRid(rid);
		Iterator<RolePermission> iterator = rolePermissions.iterator();
		while(iterator.hasNext()) {
			rolePermission = iterator.next();
			permission = permissionMapper.findById(rolePermission.getPermissionId());
			permissions.add(permission);
		}
		role.setPermission(permissions);
		return role;
	}

	@Override
	public void addRole(Role role, String[] permissionStrings) {
		roleMapper.insertRole(role);
		for(int i=0;i<permissionStrings.length;i++) {
			rolePermissionMapper.add(role.getId(), Integer.parseInt(permissionStrings[i]));
		}
	}

	@Override
	public void removeRoleById(int id) {
		rolePermissionMapper.deleteByRid(id);
		roleMapper.deleteRoleById(id);
	}

	@Override
	public void updateRole(Role role, String[] permissionStrings) {
		roleMapper.updateRole(role);
		rolePermissionMapper.deleteByRid(role.getId());
		for(int i=0;i<permissionStrings.length;i++) {
			rolePermissionMapper.add(role.getId(), Integer.parseInt(permissionStrings[i]));
		}
	}

}
