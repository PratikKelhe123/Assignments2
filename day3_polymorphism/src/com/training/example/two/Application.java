package com.training.example.two;

import com.training.ifaces.Automobile;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Also can use
//		ShowRoom saiCars = new ShowRoom();
//		NewShowroom Hero = new NewShowroom();
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
		System.out.println("Please enter your choice");
		 choice = sc.nextInt();
		//Polymorphism
		ShowRoom saiCars = new NewShowroom();
//		int choice = Integer.parseInt(args[0]);
		
		
		
		Automobile selected = saiCars.getProduct(choice);
//		Automobile selected2 = Hero.getProduct(choice);
		
		if(selected != null) {
		saiCars.printEstimate(selected);
		}else {
			System.out.println("Invalid Choice-Choose 1 or 2");
		}
		System.out.println("Please enter 0 to close or 1 to continue");
		choice = sc.nextInt();
		}while(choice!=0);
//		Hero.printEstimate(selected2);
		
	
		sc.close();
		
		
//		int ch = sc.nextInt();
//		
//		System.out.println(ch);
		
		
	}

}
