package com.hibernet.task1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aliens {
	@Id
	private int alienId;
	private String alienName;
	private String alienColour;
	
	public Aliens(int alienId, String alienName, String alienColour) {
		super();
		this.alienId = alienId;
		this.alienName = alienName;
		this.alienColour = alienColour;
	}
	
	public Aliens() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAlienId() {
		return alienId;
	}
	public void setAlienId(int alienId) {
		this.alienId = alienId;
	}
	public String getAlienName() {
		return alienName;
	}
	public void setAlienName(String alienName) {
		this.alienName = alienName;
	}
	public String getAlienColour() {
		return alienColour;
	}
	public void setAlienColour(String alienColour) {
		this.alienColour = alienColour;
	}

	@Override
	public String toString() {
		return "Alien [alienId=" + this.alienId + ", alienName=" + this.alienName + ", alienColour=" + this.alienColour + "]";
	}
	
}
