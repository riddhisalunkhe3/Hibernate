package com.hibernate.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
	private int laptopId;
	private String laptopModel;
	private String laptopCompany;
	private String laptopRam;
	
	public Laptop(int laptopId, String laptopModel, String laptopCompany, String laptopRam) {
		super();
		this.laptopId = laptopId;
		this.laptopModel = laptopModel;
		this.laptopCompany = laptopCompany;
		this.laptopRam = laptopRam;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopModel() {
		return laptopModel;
	}

	public void setLaptopModel(String laptopModel) {
		this.laptopModel = laptopModel;
	}

	public String getLaptopCompany() {
		return laptopCompany;
	}

	public void setLaptopCompany(String laptopCompany) {
		this.laptopCompany = laptopCompany;
	}

	public String getLaptopRam() {
		return laptopRam;
	}

	public void setLaptopRam(String laptopRam) {
		this.laptopRam = laptopRam;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopModel=" + laptopModel + ", laptopCompany=" + laptopCompany
				+ ", laptopRam=" + laptopRam + "]";
	}
	
}
