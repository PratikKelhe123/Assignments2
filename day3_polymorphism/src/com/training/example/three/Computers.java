package com.training.example.three;

import com.training.ifaces2.Rent;

public class Computers implements Rent {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Dell";
	}

	@Override
	public double getRent(int Quantity, int days) {
		// TODO Auto-generated method stub
		int perDayRent = 1000;
		return perDayRent * Quantity * days;
	}

}
