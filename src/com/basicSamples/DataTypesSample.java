package com.basicSamples;

public class DataTypesSample {

	public static void main(String[] args) {
		
		double myDouble=3.4;
		float myFloat=3.4f;
		
		// 3.445*10^2
		double myDoubleScientific = 3.445e2;
		
		System.out.println(myDouble);  //prints 3.4
		System.out.println(myFloat);   //prints 3.4
		System.out.println(myDoubleScientific);  //prints 344.5
		
		char letter = 'a';
		System.out.println(letter);
		
		String str1="Java Programming";
		String str2="Programiz";
		System.out.println(str1);
		System.out.println(str2);
		
		int irange=-4250000;
		System.out.println(irange);  //prints -4250000
		long lrange=-42332200000L;
		System.out.println(lrange);  // prints -42332200000
		
	}

}
