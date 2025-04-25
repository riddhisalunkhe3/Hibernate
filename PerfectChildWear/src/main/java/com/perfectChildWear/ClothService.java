package com.perfectChildWear;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClothService {
	public static void createCloths()
	{
		Session s = ConnectionProvider.getConnection().openSession();
		Transaction tx = s.beginTransaction();
		
		Cloth c1 = new Cloth(1,"Zara","S size",1000);
		Cloth c2 = new Cloth(2,"Gucci","S size",200);
		Cloth c3 = new Cloth(3,"H&M","M size",250);
		Cloth c4 = new Cloth(4,"Zara","S size",1300);
		
		s.save(c1);
		s.save(c2);
		s.save(c3);
		s.save(c4);
		tx.commit();
		s.close();
	}
}
