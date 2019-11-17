package com.old.ssm.handler;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.old.ssm.entity.Replay;
import org.old.ssm.entity.Suggestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.old.ssm.service.ReplayService;
import com.old.ssm.service.SuggestionService;

@Controller
@RequestMapping("/suggestionAdmin")
public class SuggestionAdminHandler {
	
	@Autowired
	private SuggestionService suggestionService;
	@Autowired
	private ReplayService replayService;
	
	@RequestMapping("/toLeftPage")
	public String toLeftPage() {
		return "leftPage";
	}
	
	@RequestMapping("/toTopPage")
	public String toTopPage() {
		return "topPage";
	}

	@RequestMapping("/remove")
	public String remove(@Param("id")int id) {
		suggestionService.remove(id);
		return "redirect:find";
	}
	
	@RequestMapping("/find")
	public String find(Model model) {
		List<Suggestion> suggestions = suggestionService.queryAll();
		model.addAttribute("suggestions", suggestions);
		return "suggestionAdmin/suggestionAdminList";
	}
	
	@RequestMapping("/toDetail")
	public String toDetail(@Param("id") int id,Model model) {
		Suggestion suggestion = suggestionService.queryById(id);
		model.addAttribute("suggestion", suggestion);
		return "suggestionAdmin/suggestionAdminDetail";
	}
	
	@RequestMapping("/toReplay")
	public String toReplay(@Param("id")int id,Model model) {
		Suggestion suggestion = suggestionService.queryById(id);
		model.addAttribute("suggestion", suggestion);
		return "suggestionAdmin/suggestionAdminReplay";
	}
	
	@RequestMapping("/replay")
	public String replay(Replay replay,Model model) {
		Date time = new Date();
		replay.setReplayTime(time);
		replayService.add(replay);
		model.addAttribute("replay", replay);
		return "suggestionAdmin/suggestionAdminReplaySuccess";
	}
	
}
