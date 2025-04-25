package com.moryaHospital.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Patient {
	@Id
	private int patientId;
	private String patientsName;
	private int patientMoNo;
	private String patientAddr;
	@OneToMany
	private List<Disease> diseases;
	
	public Patient(int patientId, String patientsName, int patientMoNo, String patientAddr, List<Disease> diseases) {
		super();
		this.patientId = patientId;
		this.patientsName = patientsName;
		this.patientMoNo = patientMoNo;
		this.patientAddr = patientAddr;
		this.diseases = diseases;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int patientId, String patientsName, int patientMoNo, String patientAddr) {
		super();
		this.patientId = patientId;
		this.patientsName = patientsName;
		this.patientMoNo = patientMoNo;
		this.patientAddr = patientAddr;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientsName() {
		return patientsName;
	}
	public void setPatientsName(String patientsName) {
		this.patientsName = patientsName;
	}
	public int getPatientMoNo() {
		return patientMoNo;
	}
	public void setPatientMoNo(int patientMoNo) {
		this.patientMoNo = patientMoNo;
	}
	public String getPatientAddr() {
		return patientAddr;
	}
	public void setPatientAddr(String patientAddr) {
		this.patientAddr = patientAddr;
	}
	public List<Disease> getDiseases() {
		return diseases;
	}
	public void setDiseases(List<Disease> diseases) {
		this.diseases = diseases;
	}
	
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientsName=" + patientsName + ", patientMoNo=" + patientMoNo
				+ ", patientAddr=" + patientAddr + ", diseases=" + diseases + "]";
	}
	
}
