package com.ControlFlowSample;

public class FibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		int c;
		int n=10;
		for(int i=0;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
	}

}
