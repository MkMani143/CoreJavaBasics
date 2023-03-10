package com.basicSamples;

public class Calculator {
	
	//instance variable
	int number;
	
	//class variable
	static int c;
	
	final double pi=3.14;
	//a,b are parameters
	public void add(int a,int b) {
		
		System.out.println(a+b);
	}
	
	public void area(double radius) {
	//	pi=3.45;  Error because we use final keyword;
		double area=pi*radius*radius;
	}
	
	public static void main(String[] args) {
		Calculator calobj=new Calculator();
		calobj.add(10,5);
		calobj.number=10;
		c=15;
	}

}
