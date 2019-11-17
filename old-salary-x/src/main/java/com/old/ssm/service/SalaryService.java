package com.old.ssm.service;

import java.util.List;

import org.old.ssm.entity.Role;
import org.old.ssm.entity.Salary;


public interface SalaryService {
	
	List<Salary> queryByEidYearMonth(int year,int month,int eid);
	
	List<Salary> queryByEid(int eid);
	
	List<Salary> queryAll();
	
	int queryMinYear();
	
}
