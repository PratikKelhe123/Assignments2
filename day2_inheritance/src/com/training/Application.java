package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double premium;
		
		Insurance person = new Insurance(101,"Bharat",40,60000.0);
		
		premium = person.calulatePremium();
		
		System.out.println("Premium is" + premium);
		
		vehicleInsurance audi = new vehicleInsurance(102,"Mark",36,50000.0,"Two",300000,2021);
		
		premium = audi.calulatePremium();
		
		System.out.println("Premium is" + premium);
	}
	
	

}
