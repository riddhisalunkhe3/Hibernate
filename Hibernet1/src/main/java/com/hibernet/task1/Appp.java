package com.hibernet.task1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Appp {
	public static void main(String[] args) {
		Patients p = new Patients(4,"Anuja","sardi");
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernet/task1/Hibernate.cfg.xml");
		System.out.println("Configured successfully.");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
//		to read data of id = 2
		Object o = s.get(Patients.class, 2); 
		System.out.println(o);
		
		//to update patient details
//		Patients p1 = s.get(Patients.class, 2);
//		p1.setDisease(null);
//		s.update(p1);
//		System.out.println(p1);
		
		//to delete patient
//		s.delete(p);
		//s.save(p); 
		tx.commit(); //use when there is gonna be change in database. i.e. create/update/delet
		s.close();
	}
}
