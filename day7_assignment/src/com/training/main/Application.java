package com.training.main;

import java.util.HashSet;

import com.training.Doctor;
import com.training.Hospital;
import com.training.Patient;

public class Application {

	public static void main(String[] args) {
		
		Hospital Sahyadri = new Hospital();
		HashSet<Patient> patientList = new HashSet();
		Doctor ram = new Doctor("ram","101");
		Doctor raj = new Doctor("raj","102");
		Doctor rakesh = new Doctor("rakesh","103");
		
		
		Patient Suresh = new Patient("Suresh",23,1);
		Patient Ramesh = new Patient("Ramesh",45,2);
		Patient Kamlesh = new Patient("Kamlesh",33,3);
		Patient Khagesh = new Patient("Khagesh",12,4);
		
		boolean response = Sahyadri.addAppointment(ram, Kamlesh);
		
		System.out.println("Response is" + response);
		
		Sahyadri.addAppointment(raj, Ramesh);
//		Sahyadri.addAppointment(ram, Khagesh);
		Sahyadri.addAppointment(raj, Khagesh);
		
		patientList = Sahyadri.getPatientList(ram);
		
//		Sahyadri.cancelAppointment(ram, Ramesh);
		System.out.println("Patient list for ram");
		for(Patient patient: patientList) {
		System.out.println(patient);
		}

	}

}
