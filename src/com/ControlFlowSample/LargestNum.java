package com.ControlFlowSample;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {10,25,100,125,99,560,2,11};
		int max=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println(max);

	}

}
