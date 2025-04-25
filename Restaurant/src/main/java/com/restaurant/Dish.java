package com.restaurant;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="dish_details")
public class Dish {
	@Id
	private int dishId;
	private String dishName;
	@ManyToMany
	private List<Restaurant> restaurants;
	
	public Dish(int dishId, String dishName) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
	}
	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dish(int dishId, String dishName, List<Restaurant> restaurants) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.restaurants = restaurants;
	}
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public List<Restaurant> getRestaurants() {
		return restaurants;
	}
	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}
	@Override
	public String toString() {
		return "Dish [dishId=" + dishId + ", dishName=" + dishName + ", restaurants=" + restaurants + "]";
	}
	
	
}
