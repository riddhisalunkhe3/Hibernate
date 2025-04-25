package com.hibernate.task1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	@Column(name = "laptop_Id")
	private int laptopId;
	@Column(name = "model_Name")
	private String modelName;
	@Column(name = "company_Name")
	private String companyName;
	@Column(name = " laptop_ram")
	private String ram;
	@OneToOne
	private Customer customer;
	
	
	public Laptop(int laptopId, String modelName, String companyName, String ram, Customer customer) {
		super();
		this.laptopId = laptopId;
		this.modelName = modelName;
		this.companyName = companyName;
		this.ram = ram;
		this.customer = customer;
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

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}
	
	
	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", modelName=" + modelName + ", companyName=" + companyName + ", ram="
				+ ram + ", customer=" + customer + "]";
	}
	
	
}
