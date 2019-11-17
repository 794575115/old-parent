package com.old.ssm.handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.old.ssm.entity.Emp;
import org.old.ssm.entity.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.old.ssm.service.SalaryService;

@Controller
@RequestMapping("/salary")
public class SalaryHandler {
	
	@Autowired
	private SalaryService salaryService;
	
	@RequestMapping("/toLeftPage")
	public String toLeftPage(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Emp emp = new Emp();
		emp.setId(1);
		session.setAttribute("emp", emp);
		return "leftPage";
	}
	
	@RequestMapping("/toTopPage")
	public String toTopPage() {
		return "topPage";
	}
	
	@RequestMapping("/toSalaryList")
	public String toSalaryList(HttpServletRequest request,Model model) {
		Emp emp = (Emp)request.getSession().getAttribute("emp");
		List<Salary> salaries = salaryService.queryByEid(emp.getId());
		Iterator<Salary> iterator = salaries.iterator();
		List<Integer> years = new ArrayList<Integer>();
		while(iterator.hasNext()) {
			Salary salary = iterator.next();
			int year = salary.getSalaryYear();
			if(!years.contains(year)) {
				years.add(year);
			}
		}
		model.addAttribute("years", years);
		model.addAttribute("salaries", salaries);
		return "salary/salaryList";
	}
	
	@ResponseBody
	@RequestMapping("/getMonths")
	public List<Integer> getMonths(@Param("year") Integer year,HttpServletRequest request) {
		Emp emp = (Emp)request.getSession().getAttribute("emp");
		List<Salary> salaries = salaryService.queryByEid(emp.getId());
		Iterator<Salary> iterator = salaries.iterator();
		List<Integer> months = new ArrayList<Integer>();
		while (iterator.hasNext()) {
			Salary salary = iterator.next();
			if(salary.getSalaryYear().equals(year)) {
				months.add(salary.getSalaryMonth());
			}
		}
		return months;
	}
	
	@ResponseBody
	@RequestMapping("/findByIdYearMonth")
	public List<Salary> findByIdYearMonth(
			HttpServletRequest request,
			@Param("year") Integer year,
			@Param("month") Integer month) {
		Emp emp = (Emp)request.getSession().getAttribute("emp");
		List<Salary> salaries = salaryService.queryByEidYearMonth(year, month, emp.getId());
		return salaries;
	}
	
	
}
