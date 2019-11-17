package com.old.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.old.ssm.entity.Emp;

@Mapper
public interface EmpMapper {

	List<Emp> findByDeptPositionName(int deptId,int positionId,String name);
	
	List<Emp> findAll();
	
}
