package com.ManyToManyMapping.task1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pId;
	@Column(name="project_name")
	private String projectName;
	@ManyToMany(mappedBy="project")
	private List<Employee> employees;
	
	public Project(int pId, String projectName, List<Employee> employees) {
		super();
		this.pId = pId;
		this.projectName = projectName;
		this.employees = employees;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Project [pId=" + pId + ", projectName=" + projectName + ", employees=" + employees + "]";
	}
	
	
	
	
}
