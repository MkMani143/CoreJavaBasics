package com.classesAndObjects;

public class StringSample {

	public static void main(String[] args) {
		
		
		String first="Java program";
		String second="Java program";
		String third="python program";
		
		System.out.println(first.length());
		System.out.println(second.substring(8).trim().toUpperCase());
		
		//compare first and second strings
		boolean result1= first.equals(second);
		System.out.println("Strings first and second are equal: "+result1);
		
		//compare first and third strings
		boolean result2= first.equals(third);
		System.out.println("Strings first and third are equal: "+result2);
		
		String example="Hello";
		//example=example.concat(" Welcome");
		example=example+" Welcome";
		System.out.println(example);
		
//--------------------------------------------------------	
		//IMMUTABLE String  
	
		String strOne="Java";
		strOne=strOne+" Programming";
		System.out.println("Value of strOne: "+strOne);
		System.out.println("Reference of strOne: "+strOne.hashCode());
		
		strOne.concat("Language");
		System.out.println(strOne);
		//Here Java programming is unchanged, a new string object created 
		// with java programming language. It shows that the strings are immutable. The reference variable
		// points to the java programming not to the java programming language.
		
		//If we want to refer "Language" , we have to explicitly assign it to that variable.
		strOne=strOne.concat(" Language");
		System.out.println(strOne);
		
		
		
	}

}
