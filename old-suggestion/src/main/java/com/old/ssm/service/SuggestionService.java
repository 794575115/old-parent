package com.old.ssm.service;

import java.util.List;

import org.old.ssm.entity.Suggestion;

public interface SuggestionService {

	void add(Suggestion suggestion);
	
	List<Suggestion> queryAll();
	
	List<Suggestion> queryByEid(int eid);
	
	Suggestion queryById(int id);
	
	void remove(int id);
	
}
