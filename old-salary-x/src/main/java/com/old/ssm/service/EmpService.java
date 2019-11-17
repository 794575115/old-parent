package com.old.ssm.service;

import java.util.List;

import org.old.ssm.entity.Emp;

public interface EmpService {

	List<Emp> queryByDeptPositionName(int deptId,int positionId,String name);
	
	List<Emp> queryAll();
}
