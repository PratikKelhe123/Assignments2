package com.training;

public class Lawyer extends ServiceProvider {

	public Lawyer(long phoneNubmer, String firstName, String type, String qualification) {
		super(phoneNubmer, firstName);
		this.type = type;
		this.qualification = qualification;
	}
	
	private String type;
	private String qualification;
	
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type = type;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	@Override
	public double calculateFees() {
		// TODO Auto-generated method stub
		
		double fees = 3000;
		
		if(this.type.equalsIgnoreCase("Supreme Court")) {
			return 10000.0;
		}
		
		return fees;
	}
	
	
	
	
	
}
