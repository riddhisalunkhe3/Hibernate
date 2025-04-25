package com.hibernet.task1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		//get , load
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		//get student:101
		Student student = (Student)s.load(Student.class, 105);//similary you can use get here instead of load.
		System.out.println(student.getStudentName());
		
		Address address = (Address)s.get(Address.class, 2);
		System.out.println(address.getStreet()+" "+address.getAddedDate());
		s.close();
		sf.close();
	}
}
