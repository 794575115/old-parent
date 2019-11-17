package com.old.ssm.service;

import java.util.List;

import org.old.ssm.entity.Suggestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.old.ssm.mapper.SuggestionMapper;

@Service
public class SuggestionServiceImp implements SuggestionService {

	@Autowired
	private SuggestionMapper suggestionMapper;
	
	@Override
	public void add(Suggestion suggestion) {
		suggestionMapper.add(suggestion);
	}

	@Override
	public List<Suggestion> queryAll() {
		return suggestionMapper.findAll();
	}

	@Override
	public List<Suggestion> queryByEid(int eid) {
		return suggestionMapper.findByEid(eid);
	}

	@Override
	public Suggestion queryById(int id) {
		return suggestionMapper.findById(id);
	}

	@Override
	public void remove(int id) {
		suggestionMapper.delete(id);
	}

}
