package org.old.ssm.entity;

public class Permission {

	private Integer id;
	private String name;
	private String description;
	private String uri;

	public Permission() {
		super();
	}

	public Permission(Integer id, String name, String description, String uri) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.uri = uri;
	}

	@Override
	public String toString() {
		return "Permission [id=" + id + ", name=" + name + ", description=" + description + ", uri=" + uri + "]";
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

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}
