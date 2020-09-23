package com.training;

import java.util.*;

public class Appointment {

	private HashMap<Doctor,HashSet<Patient>> appointment= new HashMap<Doctor,HashSet<Patient>>();

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(HashMap<Doctor, HashSet<Patient>> appointment) {
		super();
		this.appointment = appointment;
	}

	public HashMap<Doctor, HashSet<Patient>> getAppointment() {
		return appointment;
	}

	public void setAppointment(HashMap<Doctor, HashSet<Patient>> appointment) {
		this.appointment = appointment;
	}
	
	
	
	
}
