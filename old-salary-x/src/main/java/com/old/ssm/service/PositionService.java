package com.old.ssm.service;

import java.util.List;

import org.old.ssm.entity.Position;

public interface PositionService {

	List<Position> queryByDeptId(int deptId);
	
	Position queryById(int id);
	
}
