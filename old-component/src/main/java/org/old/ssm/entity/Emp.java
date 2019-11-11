package org.old.ssm.entity;

import java.util.Date;

public class Emp {

	private Integer id;
	private String name;
	private String workNumber;
	private String password;
	private Date birthday;
	private Date startday;
	private Boolean gender;
	// 1-未婚,2-已婚
	private Integer maritalStatus;
	private String phone;
	private String email;
	private Integer birthplaceProvince;
	private Integer birthplaceCity;
	// 政治面貌(1-群众,2-团员,3-党员,4-民主党派)
	private Integer politicalOutlook;
	private Integer deptId;
	private Integer positionId;
	// 1-在职，0-离职
	private Integer status;
	private Integer roleId;
	private Dept dept;
	private Position position;
	private Role role;

	public Emp() {
		super();
	}

	public Emp(Integer id, String name, String workNumber, String password, Date birthday, Date startday,
			Boolean gender, Integer maritalStatus, String phone, String email, Integer birthplaceProvince,
			Integer birthplaceCity, Integer politicalOutlook, Integer deptId, Integer positionId, Integer status,
			Integer roleId) {
		super();
		this.id = id;
		this.name = name;
		this.workNumber = workNumber;
		this.password = password;
		this.birthday = birthday;
		this.startday = startday;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.phone = phone;
		this.email = email;
		this.birthplaceProvince = birthplaceProvince;
		this.birthplaceCity = birthplaceCity;
		this.politicalOutlook = politicalOutlook;
		this.deptId = deptId;
		this.positionId = positionId;
		this.status = status;
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", workNumber=" + workNumber + ", password=" + password
				+ ", birthday=" + birthday + ", startday=" + startday + ", gender=" + gender + ", maritalStatus="
				+ maritalStatus + ", phone=" + phone + ", email=" + email + ", birthplaceProvince=" + birthplaceProvince
				+ ", birthplaceCity=" + birthplaceCity + ", politicalOutlook=" + politicalOutlook + ", deptId=" + deptId
				+ ", positionId=" + positionId + ", status=" + status + ", roleId=" + roleId + ", dept=" + dept
				+ ", position=" + position + ", role=" + role + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWorkNumber() {
		return workNumber;
	}

	public void setWorkNumber(String workNumber) {
		this.workNumber = workNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getStartday() {
		return startday;
	}

	public void setStartday(Date startday) {
		this.startday = startday;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public Integer getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(Integer maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getBirthplaceProvince() {
		return birthplaceProvince;
	}

	public void setBirthplaceProvince(Integer birthplaceProvince) {
		this.birthplaceProvince = birthplaceProvince;
	}

	public Integer getBirthplaceCity() {
		return birthplaceCity;
	}

	public void setBirthplaceCity(Integer birthplaceCity) {
		this.birthplaceCity = birthplaceCity;
	}

	public Integer getPoliticalOutlook() {
		return politicalOutlook;
	}

	public void setPoliticalOutlook(Integer politicalOutlook) {
		this.politicalOutlook = politicalOutlook;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Integer getPositionId() {
		return positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
