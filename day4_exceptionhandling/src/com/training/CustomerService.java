package com.training;

public class CustomerService {

	public String generateUserId(Customer cust) {
		String userId="";
		
		try {
			int firstPart = Integer.parseInt(cust.getCustomerid());
			String secondPart = cust.getEmail().substring(1,4);
			
			userId = firstPart + secondPart;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.err.println("Customer Id should be a number");
			e.printStackTrace();
		}
		
		return userId;
		
	}
	
	public void printCustomer(Customer cust) {
		
		try {
			System.out.println(cust.getCustomerName().length());
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			//ser ctrl + spacebar
			System.err.println("Customer name should not be empty");
			e.printStackTrace();
		}
		
		System.err.println("outside catch block");
	}

	public String encryptEmail(Customer cust) {
		
		String email = cust.getEmail();
		String encrypted =   null;
		boolean status = email.contains("@");
		
		if(!status) {
			try {
				throw new Exception("Invalid Email Id");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				return "From Catch";
				}
			finally {
				System.err.println("Inside Finally Block");
			}
		}else {
			encrypted =  "abcde"+email+"!4341@";
		}
		
		return encrypted  ;
	}
}
