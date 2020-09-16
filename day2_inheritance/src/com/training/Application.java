package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double premium;
		
		Insurance person = new Insurance(101,"Bharat",40,60000.0);
		
		premium = person.calulatePremium();
		
		System.out.println("Premium is" + premium);
	}

}
