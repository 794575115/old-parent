package org.old.ssm.entity;

import java.util.Date;

public class Replay {

	private Integer id;
	private Date replayTime;
	private Integer replayEmpid;
	private String content;
	private Integer suggestionId;
	private Suggestion suggestion;

	public Replay() {
		super();
	}

	public Replay(Integer id, Date replayTime, Integer replayEmpid, String content, Integer suggestionId) {
		super();
		this.id = id;
		this.replayTime = replayTime;
		this.replayEmpid = replayEmpid;
		this.content = content;
		this.suggestionId = suggestionId;
	}

	@Override
	public String toString() {
		return "Replay [id=" + id + ", replayTime=" + replayTime + ", replayEmpid=" + replayEmpid + ", content="
				+ content + ", suggestionId=" + suggestionId + ", suggestion=" + suggestion + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getReplayTime() {
		return replayTime;
	}

	public void setReplayTime(Date replayTime) {
		this.replayTime = replayTime;
	}

	public Integer getReplayEmpid() {
		return replayEmpid;
	}

	public void setReplayEmpid(Integer replayEmpid) {
		this.replayEmpid = replayEmpid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getSuggestionId() {
		return suggestionId;
	}

	public void setSuggestionId(Integer suggestionId) {
		this.suggestionId = suggestionId;
	}

	public Suggestion getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(Suggestion suggestion) {
		this.suggestion = suggestion;
	}

}
