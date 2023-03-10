package com.basicSamples;

public class OperatorsSample {

	public static void main(String[] args) {
		int a=10, b=2;
		//division operator
		System.out.println("a/b ="+ (a/b));
		
		//modulo operator
		System.out.println("a % b ="+ a%b);
		
		//create variables
		int ac = 4;
		int var;
	
		//assign value using =
		var = ac;
		System.out.println("Var using = : "+var);
		
		//assign value using +=
		var += ac;
		System.out.println(var);
		
		//assign value using *=
		var *= ac;
		System.out.println(var);
	}

}
