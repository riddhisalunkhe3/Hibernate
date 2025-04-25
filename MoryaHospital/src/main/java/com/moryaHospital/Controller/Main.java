package com.moryaHospital.Controller;

import java.util.Scanner;

import com.moryaHospital.Dao.DiseaseService;
import com.moryaHospital.Dao.JoinService;
import com.moryaHospital.Dao.PatientService;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PatientService ps = new PatientService();
		System.out.println("press 1 to disease Entry");
		System.out.println("press 2 to patient Entry");
		System.out.println("press 3 to add disease to patient");
		System.out.println("press 4 to read patient data");
		System.out.println("press Any number to exit");
		int v = sc.nextInt();

		if (v == 1) {
			DiseaseService.createDisease();
		} else if (v == 2) {
			ps.createPatient();
		}else if(v == 3){
			JoinService.joinService();
		}else if(v == 4){
			PatientService.readPatient();
		}else {
			System.exit(2);
		}

	}
}
