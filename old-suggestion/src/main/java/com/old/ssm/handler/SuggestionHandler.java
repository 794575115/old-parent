package com.old.ssm.handler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.old.ssm.entity.Emp;
import org.old.ssm.entity.Suggestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.old.ssm.service.SuggestionService;

@Controller
@RequestMapping("/suggestion")
public class SuggestionHandler {
	
	@Autowired
	private SuggestionService suggestionService;
	
	@RequestMapping("/toLeftPage")
	public String toLeftPage() {
		return "leftPage";
	}
	
	@RequestMapping("/toTopPage")
	public String toTopPage() {
		return "topPage";
	}
	
	@RequestMapping("/toAddSuggestion")
	public String toAddSuggestion(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Emp emp = new Emp();
		emp.setId(1);
		session.setAttribute("emp", emp);
		return "suggestion/addSuggestion";
	}

	@RequestMapping("/add")
	public String add(HttpSession session,Suggestion suggestion) {
		Emp emp = (Emp)session.getAttribute("emp");
		Date sendTime = new Date();
		suggestion.setEmpId(emp.getId());
		suggestion.setSendTime(sendTime);
		suggestionService.add(suggestion);
		return "suggestion/suggestioAddSuccess";
	}
	
	@RequestMapping("/remove")
	public String remove(@Param("id")int id) {
		suggestionService.remove(id);
		return "redirect:findMy";
	}
	
	@RequestMapping("/find")
	public String find(Model model) {
		List<Suggestion> suggestions = suggestionService.queryAll();
		model.addAttribute("suggestions", suggestions);
		return "suggestion/suggestionList";
	}
	
	@RequestMapping("/toDetail")
	public String toDetail(@Param("id") int id,Model model) {
		Suggestion suggestion = suggestionService.queryById(id);
		model.addAttribute("suggestion", suggestion);
		return "suggestion/suggestionDetail";
	}
	
	@RequestMapping("/findMy")
	public String findMy(HttpSession session,Model model) {
		Emp emp = (Emp)session.getAttribute("emp");
		List<Suggestion> suggestions = suggestionService.queryByEid(emp.getId());
		model.addAttribute("suggestions", suggestions);
		return "suggestion/mySuggestionList";
	}
	
	@RequestMapping("/toMyDetail")
	public String toMyDetail(@Param("id") int id,Model model) {
		Suggestion suggestion = suggestionService.queryById(id);
		model.addAttribute("suggestion", suggestion);
		return "suggestion/mySuggestionDetail";
	}
	
}
