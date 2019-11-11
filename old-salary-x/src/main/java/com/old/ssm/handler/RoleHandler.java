package com.old.ssm.handler;

import java.util.List;

import org.old.ssm.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.old.ssm.service.RoleService;
import com.old.ssm.service.RoleServiceImp;

@Controller
public class RoleHandler {

	@Autowired
	private RoleService roleService = new RoleServiceImp();
	
	@ResponseBody
	@GetMapping("/role")
	public List<Role> get(){
	
		return roleService.queryAll();
	}
	
}
