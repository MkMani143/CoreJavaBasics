package com.ControlFlowSample;

import java.util.Scanner;

public class IfElseSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int score=76;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a testscore: ");
		int score=input.nextInt();
		char grade;
		
		if(score>=90) {
			grade='A';
		}else if(score>=80) {
			grade='B';
		}else if(score>=70) {
			grade='C';
		}else if(score>=60) {
			grade='D';
		}else
			grade='E';
		
		System.out.println("Grade: "+grade);
	}

}
