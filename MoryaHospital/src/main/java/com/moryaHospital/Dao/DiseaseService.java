package com.moryaHospital.Dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.moryaHospital.pojo.Disease;
import com.moryaHospital.serviceProvider.ConnectionProvider;

public class DiseaseService {
	public static void createDisease()
	{
		Session s = ConnectionProvider.getConnection();
		Transaction tx = s.beginTransaction();
		Scanner sc = new Scanner(System.in);

		while(true)
		{
			System.out.println("Enter the Disese Id : ");
			int id = sc.nextInt();
			System.out.println("Enter the Disease Name : ");
			String name = sc.next();
			System.out.println("Enter the Disease Symptoms : ");
			String symptoms = sc.next();
			
			Disease d = new Disease(id,name,symptoms);
			s.save(d);
			tx.commit();
			System.out.println("Enter 0 to Exit or 1 to add disease.");
			int a = sc.nextInt();
			if(a == 0)
			{
				System.exit(1);
			}
		}
	}
}
