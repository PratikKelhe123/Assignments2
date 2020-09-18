package com.training;

import com.training.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) {
		
		try {
			
		
		
		String id;
		Customer ram = new Customer();
		
		ram.setCustomerid("202");
		ram.setEmail("ram@abc.com");
		ram.setMobileNumber(494949);
		ram.setCustomerName("ram");
		CustomerService service = new CustomerService();
		
		service.printCustomer(ram);
		
		Customer shyam = new Customer();
		shyam.setCustomerid("244");
		shyam.setEmail("shyam.com");
		shyam.setMobileNumber(4944449);
		shyam.setCustomerName("Ramesh");
		
		System.out.println("Encrypted"+service.generateUserId(shyam));
		
		System.out.println("Encrypted"+service.encryptEmail(shyam));
		
		System.out.println("Encrypted"+service.encryptEmail(ram));

		
//		CustomerService service = new CustomerService();
		
		id = service.generateUserId(shyam);
		
		service.encryptEmail(shyam);
		
		System.out.println(id);
		}catch(RangeCheckException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
