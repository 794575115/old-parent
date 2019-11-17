package com.old.ssm.service;

import org.old.ssm.entity.Replay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.old.ssm.mapper.ReplayMapper;

@Service
public class ReplayServiceImp implements ReplayService {

	@Autowired
	private ReplayMapper replayMapper;
	
	@Override
	public void add(Replay replay) {
		replayMapper.add(replay);
	}

}
