package com.old.ssm.service;

import java.util.List;

import org.old.ssm.entity.Dept;

public interface DeptService {
	
	List<Dept> queryAll();
	
	Dept queryById(int id);
	
}
