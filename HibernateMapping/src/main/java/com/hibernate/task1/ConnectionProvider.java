package com.hibernate.task1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionProvider {
	static SessionFactory sf;
	public static SessionFactory getConnection()
	{
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/task1/Hibernate.cfg.xml");
		sf = cfg.buildSessionFactory();
		return sf;
	}
}
