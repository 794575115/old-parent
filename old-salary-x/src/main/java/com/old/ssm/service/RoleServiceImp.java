package com.old.ssm.service;

import java.util.List;

import org.old.ssm.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.old.ssm.mapper.RoleMapper;

@Service
public class RoleServiceImp implements RoleService {

	@Autowired
	private RoleMapper roleMapper;
	
	@Override
	public List<Role> queryAll() {
		return roleMapper.findAll();
	}

}
