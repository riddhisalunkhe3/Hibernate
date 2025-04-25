package com.hibernet.task1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_details")
public class Patients {
	@Id
	@Column(name = "patient_id")
	private int id;
	@Column(name = "patient_name")
	private String name;
	private String disease;
	
	public Patients() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Patients(int id, String name, String disease) {
		super();
		this.id = id;
		this.name = name;
		this.disease = disease;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", disease=" + disease + "]";
	}
	
	
}
