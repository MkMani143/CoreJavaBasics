package com.basicSamples;

import java.util.Scanner;

public class ConsoleInSample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		
		int number= input.nextInt();
		System.out.println("You entered: "+number);
		
		System.out.println("Enter float: ");
		float myFloat = input.nextFloat();
		System.out.println("You entered: "+myFloat);
		
		//Getting double input
		System.out.println("Enter double: ");
		double myDouble=input.nextDouble();
		System.out.println(myDouble);
		
		//Getting string input
		System.out.println("Enter text: ");
		String myString=input.next();
		System.out.println("You entered: "+myString);
		
		//closing the scanner object
		input.close();
	}

}
