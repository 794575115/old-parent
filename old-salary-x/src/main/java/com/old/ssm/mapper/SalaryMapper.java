package com.old.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.old.ssm.entity.Role;
import org.old.ssm.entity.Salary;

@Mapper
public interface SalaryMapper {

	List<Salary> findByEidYearMonth(int year,int month,int eid);
	
	List<Salary> findByEid(int eid);
	
	List<Salary> findAll();
	
	int findMinYear();
		
}
