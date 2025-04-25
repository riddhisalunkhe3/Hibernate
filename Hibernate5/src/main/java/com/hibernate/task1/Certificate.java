package com.hibernate.task1;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	private String courseName;
	private String courseDuration;
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(String courseName, String courseDuration) {
		super();
		this.courseName = courseName;
		this.courseDuration = courseDuration;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	@Override
	public String toString() {
		return "Certificate [courseName=" + courseName + ", courseDuration=" + courseDuration + "]";
	}
	
}
