package org.old.ssm.entity;

public class Admin {

	private Integer id;
	private String account;
	private String password;
	private String name;
	private Integer roleId;
	private Role role;

	public Admin() {
		super();
	}

	public Admin(Integer id, String account, String password, String name, Integer roleId) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.name = name;
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", account=" + account + ", password=" + password + ", name=" + name + ", roleId="
				+ roleId + ", role=" + role + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
