package com.old.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.old.ssm.entity.Position;

@Mapper
public interface PositionMapper {

	List<Position> findByDeptId(int deptId);
	
	Position findById(int id);
	
}
