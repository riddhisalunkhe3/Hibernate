package com.hibernet.task1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("com/hibernet/task1/Hibernate.cfg.xml");
    	System.out.println("Configured Successfully.");
    	SessionFactory sf = cfg.buildSessionFactory();
    	System.out.println(sf);
    	System.out.println(sf.isClosed());
    	
    	//creating Alien
    	Aliens pk = new Aliens(103,"Jaadu","Gray");
    	System.out.println(pk);
    	Session s = sf.openSession();
    	Transaction tx = s.beginTransaction();
    	s.save(pk);
    	tx.commit();
    	s.close();
    }
}
