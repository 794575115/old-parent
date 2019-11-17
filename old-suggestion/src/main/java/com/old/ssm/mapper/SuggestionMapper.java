package com.old.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.old.ssm.entity.Suggestion;

@Mapper
public interface SuggestionMapper {

	void add(Suggestion suggestion);
	
	List<Suggestion> findAll();
	
	List<Suggestion> findByEid(int eid);
	
	Suggestion findById(int id);
	
	void delete(int id);
	
}
