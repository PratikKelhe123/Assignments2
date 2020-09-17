package com.training.ifaces;

public interface Automobile {
	
	//The following attribute is of type Public static final by default
	String APPNAME = "Quotation Generation System";
	
	//All the three methods are public and abstract by dedault
	//to understand that we have added the same in different methods
	
	public String getColor();
	public String getModel();	
	double getPrice();
	
}
