package com.hibernate.task1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LaptopService {
	
	public static void insertData()
	{
		SessionFactory sf = ConnectionProvider.getConnection();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Laptop l1 = new Laptop();
		l1.setLaptopId(103);
		l1.setModelName("Victus");
		l1.setCompanyName("HP");
		l1.setRam("8 GB");
		Customer c1 = s.get(Customer.class, 203);
		l1.setCustomer(c1);
		
		Laptop l2 = new Laptop();
		l2.setLaptopId(104);
		l2.setModelName("Pavillion");
		l2.setCompanyName("HP");
		l2.setRam("8 GB");
		Customer c2 = s.get(Customer.class, 204);
		l2.setCustomer(c2);
		
		s.save(l1);
		s.save(l2);
		tx.commit();

	}
	
	public static void readData()
	{
		SessionFactory sf = ConnectionProvider.getConnection();
		Session s = sf.openSession();
		Laptop l1 = s.get( Laptop.class, 101);
		System.out.println(l1);
	}
	
	public static void updateData()
	{
		SessionFactory sf = ConnectionProvider.getConnection();
		Session s = sf.openSession();
	    Transaction tx = s.beginTransaction();
		Laptop l1 = s.get(Laptop.class, 101);
		Laptop l2 = s.get(Laptop.class, 102);
		Laptop l3 = s.get(Laptop.class, 103);
		Laptop l4 = s.get(Laptop.class, 104);
		l1.setRam("16 GB");
		s.update(l1);
		
		Customer c1 = s.get(Customer.class, 201);
		l1.setCustomer(c1);
		Customer c2 = s.get(Customer.class, 202);
		l2.setCustomer(c2);
		s.update(c1);
		s.update(c2);
		Customer c3 = s.get(Customer.class, 203);
		l3.setCustomer(c3);
		Customer c4 = s.get(Customer.class, 204);
		l4.setCustomer(c4);
		s.update(c3);
		s.update(c4);
		tx.commit();
	}
}
