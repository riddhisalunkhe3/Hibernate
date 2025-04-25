package com.ManyToManyMapping.task1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyMapping {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Employee e1 = new Employee();
		e1.setEmpId(101);
		e1.setEmpName("Riddhi Salunkhe");
		
		Project p1 = new Project();
		p1.setpId(201);
		p1.setProjectName("Society Management System.");
		
		Employee e2 = new Employee();
		e2.setEmpId(102);
		e2.setEmpName("Wriddhi");
		
		Project p2 = new Project();
		p2.setpId(202);
		p2.setProjectName("Image Recognition");
		
		List<Employee> list1 = new ArrayList<Employee>();
		list1.add(e1);
		list1.add(e2);
		
		List<Project> list2 = new ArrayList<Project>();
		list2.add(p1);
		list2.add(p2);
		
		//
		e1.setProjects(list2);
		p2.setEmployees(list1);
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);
		tx.commit();
		s.close();
		sf.close();
	}
}
