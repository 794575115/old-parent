package com.old.ssm.handler;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.old.ssm.entity.Permission;
import org.old.ssm.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.old.ssm.service.PermissionService;
import com.old.ssm.service.RoleService;

@Controller
@RequestMapping("/permissionAdmin")
public class PermissionHandler {
	
	@Autowired
	private RoleService roleService;
	@Autowired
	private PermissionService permissionService;
	private static final String REDIRECT = "redirect:";
	
	@RequestMapping("/toTopPage")
	public String toTopPage() {
		return "topPage";
	}
	
	@RequestMapping("/toLeftPage")
	public String toLeftPage() {
		return "leftPage";
	}
	
	@RequestMapping("/toAddRole")
	public String toAddRole(Model model) {
		List<Permission> permissions = permissionService.queryAll();
		model.addAttribute("permissions", permissions);
		return "permission/addRole";
	}
	
	@RequestMapping("/addRole")
	public Object addRole(Role role,@Param("permissionList") String permissionList) {
		String[] strings = permissionList.split(",");
		roleService.addRole(role, strings);
		return "permission/success";
	}

	@RequestMapping("/findRole")
	public String findRole(Model model) {
		List<Role> roles = roleService.queryAllRoles();
		model.addAttribute("roles", roles);
		return "permission/roleList";
	}
	
	@RequestMapping("/listToDetail")
	public String listToDetail(Model model,@Param("rid") int rid) {
		Role role = roleService.roleAddPermission(rid);
		model.addAttribute("role", role);
		return "permission/roleDetail";
	}
	
	@RequestMapping("/removeRole")
	public String removeRole(@Param("rid") int rid) {
		roleService.removeRoleById(rid);
		return REDIRECT+"findRole";
	}
	
	@RequestMapping("/toSuccess")
	public String toSuccess() {
		return "permission/success";
	}
	
	@RequestMapping("/toUpdateRole")
	public String toUpdateRole(Model model,@Param("rid") int rid) {
		Role role = roleService.roleAddPermission(rid);
		List<Permission> permissions = permissionService.queryAll();
		model.addAttribute("permissions", permissions);
		model.addAttribute("role", role);
		return "permission/updateRole";
	}
	
	@RequestMapping("/modifyRole")
	public String updateRole(Role role,@Param("permissionList") String permissionList) {
		String[] strings = permissionList.split(",");
		roleService.updateRole(role, strings);
		return REDIRECT+"findRole";
	}
	
}
