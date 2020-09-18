package com.training.example.three;

import java.util.Scanner;

import com.training.ifaces2.Rent;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		double total = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Please choose either 1.Computer 2.Furniture");
		
		 choice = sc.nextInt();
		
		RentalShop saiKrupa = new RentalShop();
		
		Rent selected = saiKrupa.getProduct(choice);
		
		total = saiKrupa.printRent(selected);
		
		System.out.println("Press 0 to terminate or 1 for coninue");
		
		choice = sc.nextInt();
		
		}while(choice != 0);
		

		

	}
	