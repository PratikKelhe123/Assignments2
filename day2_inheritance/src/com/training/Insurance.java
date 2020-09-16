package com.training;

public class Insurance {
	private int policyNumber;
	private String policyHolderName;
	private int policyHolderAge;
	private double insuredAmount;
	
	
	public Insurance(int policyNumber, String policyHolderName, int policyHolderAge, double insuredAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.policyHolderAge = policyHolderAge;
		this.insuredAmount = insuredAmount;
	}


	public int getPolicyNumber() {
		return policyNumber;
	}


	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}


	public String getPolicyHolderName() {
		return policyHolderName;
	}


	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}


	public int getPolicyHolderAge() {
		return policyHolderAge;
	}


	public void setPolicyHolderAge(int policyHolderAge) {
		this.policyHolderAge = policyHolderAge;
	}


	public double getInsuredAmount() {
		return insuredAmount;
	}


	public void setInsuredAmount(double insuredAmount) {
		this.insuredAmount = insuredAmount;
	}
	
	public double calulatePremium() {
		if(this.policyHolderAge < 25) {
			return 0.6 * this.insuredAmount;
		}
		else {
			return 0.7 * this.insuredAmount;
		}
	}
}
