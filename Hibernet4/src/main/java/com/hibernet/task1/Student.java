package com.hibernet.task1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@id
	private int studentId;
	private String studentName;
	private String studentCity;
	
	
	public Student(int studentId, String studentName, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + this.studentId + ", studentName=" + this.studentName + ", studentCity=" + this.studentCity
				+ "]";
	}
	
}
