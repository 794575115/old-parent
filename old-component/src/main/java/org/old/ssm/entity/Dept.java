package org.old.ssm.entity;

public class Dept {

	private Integer id;
	private String name;
	private String description;
	// 1-正常状态,0-删除状态
	private Integer status;

	public Dept() {
		super();
	}

	public Dept(Integer id, String name, String description, Integer status) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + ", description=" + description + ", status=" + status + "]";
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
