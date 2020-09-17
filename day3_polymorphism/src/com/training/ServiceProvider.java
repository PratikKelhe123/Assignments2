package com.training;

public abstract class ServiceProvider {

	public ServiceProvider(long phoneNubmer, String firstName) {
		super();
		this.phoneNubmer = phoneNubmer;
		this.firstName = firstName;
	}
	
	private long phoneNubmer;
	private String firstName;
	public long getPhoneNubmer() {
		return phoneNubmer;
	}
	public void setPhoneNubmer(long phoneNubmer) {
		this.phoneNubmer = phoneNubmer;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public abstract double calculateFees();
		
	
}
