package com.connectionProvider;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionProvider {
	static SessionFactory sf;
	public static SessionFactory getConnection()
	{
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		sf = cfg.buildSessionFactory();
		return sf;
	}
}
