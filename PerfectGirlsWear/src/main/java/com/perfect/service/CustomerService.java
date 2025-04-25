package com.perfect.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.connectionProvider.ConnectionProvider;
import com.perfect.pojo.Cloth;
import com.perfect.pojo.Customer;

public class CustomerService {
	public static void createCustomer()
	{
		SessionFactory sf = ConnectionProvider.getConnection();
		Session s =sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Cloth> clothList = new ArrayList();
		clothList.add(s.get(Cloth.class, 401));
		clothList.add(s.get(Cloth.class, 402));
		clothList.add(s.get(Cloth.class, 404));
		Customer c1 = new Customer(1,"Riddhi","766644","Karad",clothList);
		s.save(c1);
		tx.commit();
		s.close();
	}
}
