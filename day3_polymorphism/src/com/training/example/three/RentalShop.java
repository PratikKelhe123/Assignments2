package com.training.example.three;

import java.util.Scanner;

import com.training.ifaces2.Rent;


public class RentalShop {
	int quantity, days;
public Rent getProduct(int key) {
		
		switch (key) {
		case 1:
			
			return new Computers();

		case 2:
			return new Furnitures();
		default:
			
			return null;
		}
		
	}
public void printRent(Rent product) {
	
	
	Scanner sc = new Scanner(System.in);
	
	
	
	System.out.println("Please enter quantity and days");
	
	quantity = sc.nextInt();
	days = sc.nextInt();
	System.out.println(product.APPNAME);
	System.out.println(product.getName());
	System.out.println(product.getRent(quantity,days));
	
	sc.close();
}
}
