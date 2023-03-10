package com.basicSamples;

public class RelationalOpSample {

	public static void main(String[] args) {
		//Create variables
		int a=7, b=11;
		
		//value of a and b
		System.out.println("a is "+a+" and b is "+b);
		
		// == operator
		System.out.println(a==b);  //false
		
		// != operator
		System.out.println(a!=b);  //true
		
		// > operator
		System.out.println(a>b);  //false
		
		// < operator
		System.out.println(a<b);  //true
		
		// >= operator
		System.out.println(a>=b);  //false
		
		// <= operator 
		System.out.println(a<=b);  //true
		
		
		//Logical Operators
		
		// && operator
		System.out.println((5>3) && (8>5));  //true
		System.out.println((5>3) && (8<5));  //false
		
		
		// || operator
		System.out.println((5<3) || (8>5));  //true
		System.out.println((5>3) || (8<5));  //true
		System.out.println((5<3) || (8<5));  //false
		
		// ! operator
		System.out.println(!(5==3));  //true
		System.out.println(!(5>3));   //false
		
		
		//TERNARY OPERATOR
		int februaryDays=29;
		String result;
		result=((februaryDays==28) ? "Not a leap year" : "Leap year");
		System.out.println(result);
	}
}

