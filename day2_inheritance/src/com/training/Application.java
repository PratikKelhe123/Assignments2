package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double premium;
		
		Insurance person = new Insurance(101,"Bharat",40,60000.0);
		
		premium = person.calulatePremium();
		
		System.out.println("Premium is" + premium);
		
		VehicleInsurance audi = new VehicleInsurance(102,"Mark",36,50000.0,"Two",300000,2021);
		premium = audi.calulatePremium();
		
		VehicleInsurance bmw = new VehicleInsurance(103,"Ramesh",46,30000.0,"Two",600000,2022);
		VehicleInsurance pulsar = new VehicleInsurance(201,"Steve",26,20000.0,"Two",200000,2023);
		VehicleInsurance ktm = new VehicleInsurance(202,"Sameer",33,70000.0,"Two",100000,2029);
		
		premium = audi.calulatePremium();
		
		System.out.println("model number is"+audi.getVehicleModel()+"Premium is" + premium);
	}
	
	

}
