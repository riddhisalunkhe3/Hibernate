package com.moryaHospital.serviceProvider;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionProvider {
	static Session s;
	public static Session getConnection()
	{
		Configuration cfg = new Configuration();
		cfg.configure("com/moryaHospital/ServiceProvider/Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
	    s = sf.openSession();
		return s;
	}
}
