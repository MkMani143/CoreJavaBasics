package com.ControlFlowSample;

import java.util.Scanner;

public class MaxOfNumbers {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n1=input.nextInt();
		int n2=input.nextInt();
		int n3=input.nextInt();
		
		if((n1>n2)&&(n1>n3)) {
			System.out.print("Maximum Number is: "+n1);
		}else if((n2>n1)&&(n2>n3)){
			System.out.print("Maximum Number is: "+n2);
		}else {
			System.out.print("Maximum Number is: "+n3);
		}
		
		
		//Using Ternary operator
//		int number=n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
//		System.out.println("Maximum of three numbers: "+number);
		

	}

}
