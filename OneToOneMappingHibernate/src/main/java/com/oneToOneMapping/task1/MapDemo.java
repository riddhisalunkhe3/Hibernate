package com.oneToOneMapping.task1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		//creating question
		Questions q1 = new Questions();
		q1.setQuestionId(101);
		q1.setQuestion("What is Java ? ");
		
		//creating answer
		Answers a1 =new Answers();
		a1.setAnswerId(201);
		a1.setAns("Java is Programming Language.");
		a1.setQuestion(q1);
		q1.setAnswer(a1);
		
		Questions q2 = new Questions();
		q2.setQuestionId(102);
		q2.setQuestion("Who developed java ?");
		
		Answers a2 = new Answers();
		a2.setAnswerId(202);
		a2.setAns("James Gosling developed java.");
		a2.setQuestion(q2);
		q2.setAnswer(a2);
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		//save object
		s.save(q1);
		s.save(q2);
		s.save(a1);
		s.save(a2);
		tx.commit();
		
		//fetching.........
		Questions newQuestion = (Questions)s.get(Questions.class, 101);
		System.out.println(newQuestion.getQuestion());
		System.out.println(newQuestion.getAnswer().getAns());
		s.close();
		sf.close();
	}
}
