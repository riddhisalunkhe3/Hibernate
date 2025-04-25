package com.moryaHospital.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Disease {
	@Id
	private int diseaseId;
	private String diseaseName;
	private String diseaseSymptoms;
	@ManyToOne
	private Patient patients;
	
	public Disease(int diseaseId, String diseaseName, String diseaseSymptoms, Patient patients) {
		super();
		this.diseaseId = diseaseId;
		this.diseaseName = diseaseName;
		this.diseaseSymptoms = diseaseSymptoms;
		this.patients = patients;
	}
	public Disease() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Disease(int diseaseId, String diseaseName, String diseaseSymptoms) {
		super();
		this.diseaseId = diseaseId;
		this.diseaseName = diseaseName;
		this.diseaseSymptoms = diseaseSymptoms;
	}
	public int getDiseaseId() {
		return diseaseId;
	}
	public void setDiseaseId(int diseaseId) {
		this.diseaseId = diseaseId;
	}
	public String getDiseaseName() {
		return diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	public String getDiseaseSymptoms() {
		return diseaseSymptoms;
	}
	public void setDiseaseSymptoms(String diseaseSymptoms) {
		this.diseaseSymptoms = diseaseSymptoms;
	}
	public Patient getPatients() {
		return patients;
	}
	public void setPatients(Patient patients) {
		this.patients = patients;
	}
	@Override
	public String toString() {
		return "Disease [diseaseId=" + diseaseId + ", diseaseName=" + diseaseName + ", diseaseSymptoms="
				+ diseaseSymptoms + ", patients=" + patients + "]";
	}
	
}
