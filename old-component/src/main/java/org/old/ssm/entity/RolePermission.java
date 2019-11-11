package org.old.ssm.entity;

public class RolePermission {

	private Integer roleId;
	private Integer permissionId;

	public RolePermission() {
		super();
	}

	public RolePermission(Integer roleId, Integer permissionId) {
		super();
		this.roleId = roleId;
		this.permissionId = permissionId;
	}

	@Override
	public String toString() {
		return "RolePermission [roleId=" + roleId + ", permissionId=" + permissionId + "]";
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}

}
