package com.moryaHospital.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.moryaHospital.pojo.Patient;
import com.moryaHospital.serviceProvider.ConnectionProvider;

public class PatientService {
	public static void createPatient()
	{
		Session s = ConnectionProvider.getConnection();
		Transaction tx = s.beginTransaction();
		
		//Patient p1 = new Patient(101,"Samaira",3445345,"Karad");
		Patient p2 = new Patient(102,"Avika",565345,"Pune");
		Patient p3 = new Patient(103,"Purti",34345,"Satara");
		//s.save(p1);
		s.save(p2);
		s.save(p3);
		tx.commit();
	}
	public static void readPatient()
	{
		Session s = ConnectionProvider.getConnection();
		Transaction tx = s.beginTransaction();
		
		Patient p = s.get(Patient.class, 101);
		System.out.println(p);
		System.out.println(p.getDiseases());
	}
}
