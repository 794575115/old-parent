package com.old.ssm.service;

import java.util.List;

import org.old.ssm.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.old.ssm.mapper.EmpMapper;

@Service
public class EmpServiceImp implements EmpService {

	@Autowired
	private EmpMapper empMapper;
	
	@Override
	public List<Emp> queryByDeptPositionName(int deptId,int positionId,String name){
		return empMapper.findByDeptPositionName(deptId, positionId, name);
	}

	@Override
	public List<Emp> queryAll() {
		return empMapper.findAll();
	}

}
