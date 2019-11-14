package com.old.ssm.service;

import java.util.List;

import org.old.ssm.entity.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.old.ssm.mapper.PermissionMapper;

@Service
public class PermissionServiceImp implements PermissionService {

	@Autowired
	private PermissionMapper permissionMapper;

	@Override
	public List<Permission> queryAll() {
		return permissionMapper.findAll();
	}
	
}
