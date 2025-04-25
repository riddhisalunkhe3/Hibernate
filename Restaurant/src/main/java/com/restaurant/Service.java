package com.restaurant;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Service {
	public void create()
	{
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		
		Dish d1 = new Dish(101,"Paneer");
		Dish d2 = new Dish(102,"Veg Biryani");
		Dish d3 = new Dish(103,"Pulav");
		Dish d4 = new Dish(104,"Akkha Masoor");
		
		Restaurant r1 = new Restaurant(1,"Manas");
		Restaurant r2 = new Restaurant(2,"Dadus");
		Restaurant r3 = new Restaurant(3,"Vrindavan");
		Restaurant r4 = new Restaurant(4,"Jal Sagar");
		
		s.save(d1);
		s.save(d2);
		s.save(d3);
		s.save(d4);
		s.save(r1);
		s.save(r2);
		s.save(r3);
		s.save(r4);
		tx.commit();
		s.close();
		
	}
	public void join()
	{
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		Restaurant r1 = s.get(Restaurant.class, 1);
		
		Dish d1 = s.get(Dish.class, 101);
		Dish d2 = s.get(Dish.class, 102);
		Dish d3 = s.get(Dish.class, 103);
		
		List<Dish> l1 = new ArrayList();
		l1.add(d1);
		l1.add(d2);
		l1.add(d3);	
		r1.setDishes(l1);
		s.update(r1);
		
		Restaurant r2 = s.get(Restaurant.class, 2);
		r2.setDishes(l1);
		s.update(r2);
		tx.commit();
		s.close();
	}
	public void read()
	{
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		System.out.println(s.get(Restaurant.class, 1));;
		s.close();
		
	}
}
