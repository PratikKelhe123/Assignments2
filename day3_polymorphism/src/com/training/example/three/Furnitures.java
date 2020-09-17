package com.training.example.three;

import com.training.ifaces2.Rent;

public class Furnitures implements Rent {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Sofa";
	}

	@Override
	public double getRent(int Quantity, int days) {
		// TODO Auto-generated method stub
		int perDayRent = 2000;
		return perDayRent * Quantity * days;
	}

}
