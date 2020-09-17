package com.training.example.three;

import java.util.Scanner;

import com.training.ifaces2.Rent;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please choose either 1.Computer 2.Furniture");
		
		int choice = sc.nextInt();
		
		RentalShop saiKrupa = new RentalShop();
		
		Rent selected = saiKrupa.getProduct(choice);
		
		saiKrupa.printRent(selected);
		
//		Rent selected = saiKrupa
		
		
		sc.close();
		

	}

}
