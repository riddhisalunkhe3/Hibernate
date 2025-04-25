package com.oneToManyMapping.task1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyMain {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		//creating Question
//		Questions q1 = new Questions();
//		q1.setQuestionId(101);
//		q1.setQuestion("What is Hibernate ?");
//		
		//creating multiple answers
//		Answers a1 = new Answers();
//		a1.setAnswerId(201);
//		a1.setAns("Hibernate is a ORM Tool");
//		a1.setQuestion(q1);
//		
//		Answers a2 = new Answers();
//		a2.setAnswerId(202);
//		a2.setAns("Hibernate is a Framework");
//		a2.setQuestion(q1);
//		
//		Answers a3 = new Answers();
//		a3.setAnswerId(203);
//		a3.setAns("Instead of JDBC we can use Hibernate.");
//		a3.setQuestion(q1);
//		
//		List<Answers> newList = new ArrayList<Answers>();
//		newList.add(a1);
//		newList.add(a2);
//		newList.add(a3);
//		q1.setAnswer(newList);
//		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
//		s.save(q1);
//		s.save(a1);
//		s.save(a2);
//		s.save(a3);
//		s.save(a1);
		//fetching........
		Questions q = (Questions)s.get(Questions.class, 101);
		System.out.println(q.getQuestion());
		for(Answers a : q.getAnswer())
		{
			System.out.println(a.getAns());
		}
		tx.commit();
		s.close();
		sf.close();
	}
}
