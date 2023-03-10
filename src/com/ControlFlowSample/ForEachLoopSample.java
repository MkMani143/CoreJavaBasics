package com.ControlFlowSample;

public class ForEachLoopSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int sum=0;
		for(int numbers:arr) {
			sum+=numbers;
			//System.out.print(numbers+" ");
		}
		System.out.println("Total: "+sum);
	}

}
