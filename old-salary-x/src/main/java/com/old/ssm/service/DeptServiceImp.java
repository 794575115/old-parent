package com.old.ssm.service;

import java.util.List;

import org.old.ssm.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.old.ssm.mapper.DeptMapper;

@Service
public class DeptServiceImp implements DeptService {

	@Autowired
	private DeptMapper deptMapper;
	
	@Override
	public List<Dept> queryAll() {
		return deptMapper.findAll();
	}

	@Override
	public Dept queryById(int id) {
		return deptMapper.findById(id);
	}

}
