package com.old.ssm.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.old.ssm.entity.Replay;

@Mapper
public interface ReplayMapper {

	void add(Replay replay);
	
}
