package com.mobile.task1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	private int mobileId;
	private String mobileCompany;
	private String mobileModel;
	private String mobileRam;
	public int getMobileId() {
		return mobileId;
	}
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(int mobileId, String mobileCompany, String mobileModel, String mobileRam) {
		super();
		this.mobileId = mobileId;
		this.mobileCompany = mobileCompany;
		this.mobileModel = mobileModel;
		this.mobileRam = mobileRam;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileCompany() {
		return mobileCompany;
	}
	public void setMobileCompany(String mobileCompany) {
		this.mobileCompany = mobileCompany;
	}
	public String getMobileModel() {
		return mobileModel;
	}
	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}
	public String getMobileRam() {
		return mobileRam;
	}
	public void setMobileRam(String mobileRam) {
		this.mobileRam = mobileRam;
	}
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileCompany=" + mobileCompany + ", mobileModel=" + mobileModel
				+ ", mobileRam=" + mobileRam + "]";
	}
	
	
}
