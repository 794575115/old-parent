package com.old.ssm.handler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.old.ssm.entity.Dept;
import org.old.ssm.entity.Emp;
import org.old.ssm.entity.Position;
import org.old.ssm.entity.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.old.ssm.service.DeptService;
import com.old.ssm.service.EmpService;
import com.old.ssm.service.PositionService;
import com.old.ssm.service.SalaryService;

@Controller
@RequestMapping("/salaryAdmin")
public class SalaryAdminHandler {

	@Autowired
	private SalaryService salaryService;
	@Autowired
	private DeptService deptService;
	@Autowired
	private PositionService positionService;
	@Autowired
	private EmpService empService;
	
	@RequestMapping("/toLeftPage")
	public String toLeftPage() {
		return "leftPage";
	}
	
	@RequestMapping("/toTopPage")
	public String toTopPage() {
		return "topPage";
	}
	
	@RequestMapping("/toSalaryList")
	public String toSalaryList(Model model) {
		List<Emp> emps = empService.queryAll();
		Iterator<Emp> iterator = emps.iterator();
		Emp emp = new Emp();
		Salary salary = new Salary();
		Dept dept = new Dept();
		Position position = new Position();
		List<Salary> salaries = new ArrayList<Salary>();
		List<Salary> salaries2 = new ArrayList<Salary>();
		while(iterator.hasNext()) {
			emp = iterator.next();
			dept = deptService.queryById(emp.getDeptId());
			position = positionService.queryById(emp.getPositionId());
			emp.setDept(dept);
			emp.setPosition(position);
			salaries2 = salaryService.queryByEid(emp.getId());
			Iterator<Salary> iterator2 = salaries2.iterator();
			while(iterator2.hasNext()) {
				salary = iterator2.next();
				salary.setEmp(emp);
				salaries.add(salary);
			}
		}
		List<Dept> depts = deptService.queryAll();
		DateFormat df = new SimpleDateFormat("yyyy");
		String yearMax = df.format(new Date());
		int yearMin = salaryService.queryMinYear();
		model.addAttribute("yearMax", yearMax);
		model.addAttribute("yearMin", yearMin);
		model.addAttribute("depts", depts);
		model.addAttribute("salaries", salaries);
		return "salaryAdmin/adminSalaryList";
	}
	
	@ResponseBody
	@RequestMapping("/getPositions")
	public List<Position> getPositions(@Param("deptId") int deptId) {
		return positionService.queryByDeptId(deptId);
	}
	
	@ResponseBody
	@RequestMapping("/findByYearMonthDeptPosi")
	public List<Salary> findByYearMonthDeptPosi(@Param("year") int year,
			@Param("month") int month,
			@Param("deptId") int deptId,
			@Param("positionId") int positionId,
			@Param("name") String name){
		List<Emp> emps = empService.queryByDeptPositionName(deptId, positionId,name);
		Iterator<Emp> iterator = emps.iterator();
		Emp emp = new Emp();
		Salary salary = new Salary();
		Dept dept = new Dept();
		Position position = new Position();
		List<Salary> salaries = new ArrayList<Salary>();
		List<Salary> salaries2 = new ArrayList<Salary>();
		while(iterator.hasNext()) {
			emp = iterator.next();
			dept = deptService.queryById(emp.getDeptId());
			position = positionService.queryById(emp.getPositionId());
			emp.setDept(dept);
			emp.setPosition(position);
			salaries2 = salaryService.queryByEidYearMonth(year, month, emp.getId());
			Iterator<Salary> iterator2 = salaries2.iterator();
			while(iterator2.hasNext()) {
				salary = iterator2.next();
				salary.setEmp(emp);
				salaries.add(salary);
			}
		}
		return salaries;
	}
	
}
