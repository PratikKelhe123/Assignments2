package com.training;

public class WrapperAndStatic {

	private int id;
	private static String aadharNumber;
	
	public void show() {
		System.out.println(id);
		System.out.println(aadharNumber);
	}
	
	public static void display() {
		//cannot access non static members in static method
		//		System.out.println(id);
		//		show();
		System.out.println(aadharNumber);
	}
	
	public void parse(String strNumber) {
		
		
		int number = Integer.parseInt(strNumber);
		
		System.out.println(++number);
	}
	
	public String useToString(int number) {
		return Integer.toString(number);
	}
	
	public void useValueOf() {
		
		String age = "A";
		int i= Integer.valueOf(age,16);
		System.out.println(i);
	}
}
