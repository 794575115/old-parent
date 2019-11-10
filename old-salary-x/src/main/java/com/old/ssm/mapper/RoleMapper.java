package com.old.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.old.ssm.entity.Role;


@Mapper
public interface RoleMapper {
	List<Role> findAll();
}
