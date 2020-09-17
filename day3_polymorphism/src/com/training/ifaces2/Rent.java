package com.training.ifaces2;

public interface Rent {

	String APPNAME = "Rental Generation System";
	
	public String getName();
	public double getRent(int Quantity , int days);
}
