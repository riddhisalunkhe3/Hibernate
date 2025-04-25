package com.mobile.task1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Dao {
	public static void createMobile()
	{
		SessionFactory sf = ConnectionProvider.getConnection();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
//		Session s = ConnectionProvider.getConnection().openSession();
//		Transaction tx = s.beginTransaction();
//		
		Mobile m1 = new Mobile(1,"Samsung","Samsung A12","4 GB");
		Mobile m2 = new Mobile(2,"Realme","Realme C21Y","8 GB");
		Mobile m3 = new Mobile(3,"Oppo","Oppo A5S","16 GB");
		Mobile m4 = new Mobile(4,"Samsung","Samsung A20","4 GB");
		Mobile m5 = new Mobile(5,"Vivo","Vivo Y28S","4 GB");
		Mobile m6 = new Mobile(6,"Redmi","Redmi 9 Power","16 GB");
		
		s.save(m1);
		s.save(m2);
		s.save(m3);
		s.save(m4);
		s.save(m5);
		s.save(m6);
		tx.commit();
		s.close();
	}
	
	public static void readData()
	{
		Session s = ConnectionProvider.getConnection().openSession();
		Mobile m1 = s.get(Mobile.class, 1);
		Mobile m2 = s.get(Mobile.class, 4);
		System.out.println(m1);
		System.out.println(m2);
	}
	
	public static void updateData()
	{
		Session s = ConnectionProvider.getConnection().openSession();
		Transaction tx = s.beginTransaction();
		Mobile m = s.get(Mobile.class, 4);
		m.setMobileRam("16 GB");
		s.update(m);
		tx.commit();
		s.close();
	}
	
	public static void deleteData()
	{
		Session s = ConnectionProvider.getConnection().openSession();
		Transaction tx = s.beginTransaction();
		Mobile m = s.get(Mobile.class , 5);
		s.delete(m);
		tx.commit();
		s.close();
	}
}
