package com.hibernate.task1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmbedDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Student s1 = new Student();
		s1.setStudId(1);
		s1.setStudName("Riddhi");
		s1.setStudCity("Julewadi");
		
		Certificate c1 = new Certificate();
		c1.setCourseName("SpringBoot");
		c1.setCourseDuration("3 months");
		s1.setCerti(c1);
		
		Student s2 = new Student();
		s2.setStudId(2);
		s2.setStudName("Wriddhi");
		s2.setStudCity("Karad");
		
		Certificate c2 = new Certificate();
		c2.setCourseName("Android");
		c2.setCourseDuration("6 months");
		s2.setCerti(c2);
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		//object save
		s.save(s1);
		s.save(s2);
		
		tx.commit();
		s.close();
		sf.close();
	}
}
