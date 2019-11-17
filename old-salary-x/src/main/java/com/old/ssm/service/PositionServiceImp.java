package com.old.ssm.service;

import java.util.List;

import org.old.ssm.entity.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.old.ssm.mapper.PositionMapper;

@Service
public class PositionServiceImp implements PositionService {

	@Autowired
	private PositionMapper positionMapper;
	
	@Override
	public List<Position> queryByDeptId(int deptId) {
		return positionMapper.findByDeptId(deptId);
	}

	@Override
	public Position queryById(int id) {
		return positionMapper.findById(id);
	}

	
}
