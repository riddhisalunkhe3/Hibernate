package com.perfectChildWear;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerService {
	public static void createCustomer()
	{
		Session s = ConnectionProvider.getConnection().openSession();
		Transaction tx = s.beginTransaction();
	
		Cloth c1 = s.get(Cloth.class, 1);
		Cloth c2 = s.get(Cloth.class, 2);
		Cloth c3 = s.get(Cloth.class, 3);
		List<Cloth> clothList = new ArrayList<Cloth>();
		clothList.add(c1);
		clothList.add(c2);
		clothList.add(c3);
		Customer cus1 = new Customer(101,"Riddhi","766444","Julewadi",clothList);
		s.save(cus1);
		tx.commit();
		s.close();
		
	}
}
