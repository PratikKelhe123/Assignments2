package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lawyer rajesh = new Lawyer(494949, "Rajesh Khannan", "HighCourt", "B.L");
		
		Musician sharma = new Musician(23233, "UmeshKhanna", "Shenoy", "Alahabad");
		
		Billing bill = new Billing();
		
		bill.printFees(sharma);
		
		bill.printFees(rajesh);

	}

}
