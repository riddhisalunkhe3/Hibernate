package com.hibernate.task1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerService {
	
	public static void create()
	{
		Session s = ConnectionProvider.getConnection().openSession();
		Transaction tx = s.beginTransaction();
		Customer c1 = new Customer();
		c1.setCusId(203);
		c1.setCusName("Neha");
		c1.setAddress("Satara");
		Laptop l1 = s.get(Laptop.class, 103);
		c1.setLaptop(l1);
		
		Customer c2 = new Customer();
		c2.setCusId(204);
		c2.setCusName("Wriddhi");
		c2.setAddress("Karad");
		Laptop l2 = s.get(Laptop.class, 104);
		c2.setLaptop(l2);
		
//		s.update(l1);
//		s.update(l2);
		s.save(c1);
		s.save(c2);
		
		tx.commit();
		s.close();
	}
	
	public static void readData()
	{
		Session s = ConnectionProvider.getConnection().openSession();
		Transaction tx = s.beginTransaction();
		Customer c1 = s.get(Customer.class, 201);
		System.out.println(c1);
	}
	
	public static void update()
	{
		
	}
}
