package com.training;

import com.training.*;
import com.training.ifaces.HospitalService;
import java.util.*;

public class Hospital implements HospitalService {

	Appointment appoint;
	HashSet<Patient> patientList = null;
	HashSet<Patient> patientList2 = null;
	HashMap<Doctor, HashSet<Patient>> appointment = null;
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
		patientList = new HashSet();
	appoint = new Appointment();
	appointment = appoint.getAppointment();
	}

	@Override
	public boolean addAppointment(Doctor doctor, Patient patient) {
	
		
		patientList.add(patient);
		 appointment.put(doctor, patientList);
		
		return true;
	}

	@Override
	public HashSet<Patient> getPatientList(Doctor doctor) {
		patientList2 = appointment.get(doctor);
		
		return patientList2;
	}

	@Override
	public boolean cancelAppointment(Doctor doctor, Patient patient) {
		
		patientList.remove(patient);
		appointment.put(doctor, patientList);
		return true;
	}

}
