package com.moryaHospital.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.moryaHospital.pojo.Disease;
import com.moryaHospital.pojo.Patient;
import com.moryaHospital.serviceProvider.ConnectionProvider;

public class JoinService {
	public static void joinService()
	{
		Session s = ConnectionProvider.getConnection();
		Transaction tx = s.beginTransaction();
		
		Patient p = s.get(Patient.class, 101);
		Patient p1 = s.get(Patient.class, 102);
		
		Disease d1 = s.get(Disease.class, 1);
		Disease d2 = s.get(Disease.class, 2);
		Disease d3 = s.get(Disease.class, 3);
		List l = new ArrayList();
		l.add(d1);
		l.add(d2);
		p.setDiseases(l);
		
		List l1 = new ArrayList();
		l1.add(d3);
		p1.setDiseases(l1);
		
		s.update(p);
		s.update(p1);
		tx.commit();
		s.close();
	}
}
