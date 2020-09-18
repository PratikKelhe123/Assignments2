package com.training;

import java.io.File;

public class Application {

	public static void main(String[] args) {
		
		Customer ramesh = new Customer("123","Ragesh",94949,"ram@abc.com");
		
		FilesExample service = new FilesExample();
		
		service.writeToFile(new File("Customer.txt"), ramesh);
		
		service.readFromFile(new File("Customer.txt"));
	}
}
