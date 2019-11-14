package com.old.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.old.ssm.entity.RolePermission;

@Mapper
public interface RolePermissionMapper {
	
	List<RolePermission> findByRid(int rid);
	
	void add(int rid,int pid);
	
	void deleteByRid(int rid);
	
}
