package com.hibernate.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerService {
	public static void create()
	{
		Session s = ConnectionProvider.getConnection().openSession();
		Transaction tx = s.beginTransaction();
//		Laptop l1 = s.get(Laptop.class, 101);
//		Laptop l2 = s.get(Laptop.class, 102);
//		Laptop l3 = s.get(Laptop.class, 103);
		Customer c1 = new Customer();
		c1.setCusId(201);
		c1.setCus_name("Neha");
		c1.setAddress("Satara");
		
		Customer c2 = new Customer();
		c2.setCusId(202);
		c2.setCus_name("Wriddhi");
		c2.setAddress("Karad");
		
		List<Laptop> list = new ArrayList<Laptop>();
		list.add(s.get(Laptop.class, 101));
		list.add(s.get(Laptop.class, 102));
		list.add(s.get(Laptop.class, 103));
		c1.setLaptopList(list);
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
}
