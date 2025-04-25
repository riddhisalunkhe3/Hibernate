package com.hibernate.task1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="students_details")
public class Student {
	@Id
	private int studId;
	private String studName;
	private String studCity;
	private Certificate certi;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studId, String studName, String studCity, Certificate certi) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studCity = studCity;
		this.certi = certi;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudCity() {
		return studCity;
	}

	public void setStudCity(String studCity) {
		this.studCity = studCity;
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studCity=" + studCity + ", certi=" + certi
				+ "]";
	}
	
	
}
