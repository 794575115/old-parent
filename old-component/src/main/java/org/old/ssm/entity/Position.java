package org.old.ssm.entity;

public class Position {

	private Integer id;
	private String name;
	private String description;
	private Double baseSalary;
	private Integer status;
	private Integer deptId;
	private Dept dept;

	public Position() {
		super();
	}

	public Position(Integer id, String name, String description, Double baseSalary, Integer status, Integer deptId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.baseSalary = baseSalary;
		this.status = status;
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + ", description=" + description + ", baseSalary=" + baseSalary
				+ ", status=" + status + ", deptId=" + deptId + ", dept=" + dept + "]";
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

}
