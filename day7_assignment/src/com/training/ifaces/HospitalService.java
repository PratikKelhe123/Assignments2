package com.training.ifaces;

import java.util.HashSet;

import com.training.Doctor;
import com.training.Patient;

public interface HospitalService {

	
	public boolean addAppointment(Doctor doctor, Patient patient);
	public HashSet<Patient> getPatientList(Doctor doctor);
	public boolean cancelAppointment(Doctor doctor, Patient patient);
}
