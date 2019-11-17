package com.old.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.old.ssm.entity.Dept;

@Mapper
public interface DeptMapper {
	
	List<Dept> findAll();
	
	Dept findById(int id);
	
}
