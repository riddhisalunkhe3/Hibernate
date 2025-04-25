package com.hibernet.task1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
		Configuration cfg = new Configuration();
		cfg.configure();
		System.out.println("Configuared successfully.");
		
		//creating object of student object
		Student s1 = new Student();
		
		//creating object of address class
		Address a1 = new Address();
		a1.setStreet("Street 3");
		a1.setCity("Panmalewadi");
		a1.setOpen(true);
		a1.setAddedDate(new Date());
		a1.setX(90.45);
		
//		//reading image
//		FileInputStream sf1 = new FileInputStream("src/main/java/image3.jpeg");
//		byte[] data = new byte[sf1.available()];
//		sf1.read(data);
//		a1.setImage(data);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		//s.save(s1);
		s.save(a1);
		tx.commit();
		s.close();
		System.out.println("Done");
	}  
}
