package com.perfect.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.connectionProvider.ConnectionProvider;
import com.perfect.pojo.Cloth;

public class ClothService {
	public static void createCloth()
	{
		SessionFactory sf = ConnectionProvider.getConnection();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Cloth c1 = new Cloth(401,"H&M","M",1000);
		Cloth c2 = new Cloth(402,"Zara","L",1500);
		Cloth c3 = new Cloth(403,"Gucci","XL",2000);
		Cloth c4 = new Cloth(404,"Zara","M",1600);
		
		s.save(c1);
		s.save(c2);
		s.save(c3);
		s.save(c4);
		tx.commit();
		s.close();
	}
}
