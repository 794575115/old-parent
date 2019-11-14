package com.old.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.old.ssm.entity.Permission;

@Mapper
public interface PermissionMapper {
	
	Permission findById(int id);
	
	List<Permission> findAll();
	
}
