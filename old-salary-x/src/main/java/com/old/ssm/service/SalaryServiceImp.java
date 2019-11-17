package com.old.ssm.service;

import java.util.List;

import org.old.ssm.entity.Role;
import org.old.ssm.entity.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.old.ssm.mapper.SalaryMapper;

@Service
public class SalaryServiceImp implements SalaryService {

	@Autowired
	private SalaryMapper salaryMapper;
	
	@Override
	public List<Salary> queryByEidYearMonth(int year, int month, int eid) {
		return salaryMapper.findByEidYearMonth(year, month, eid);
	}

	@Override
	public List<Salary> queryByEid(int eid) {
		return salaryMapper.findByEid(eid);
	}

	@Override
	public List<Salary> queryAll() {
		return salaryMapper.findAll();
	}

	@Override
	public int queryMinYear() {
		return salaryMapper.findMinYear();
	}

	

}
