package com.ControlFlowSample;

public class BreakSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayofInts = {32,85,87,97,127,85,45,12,34,300};
	    int searchfor=12;
		int i=0;
		boolean foundIt =false;
		
		for(;i<arrayofInts.length;i++) {
			if(arrayofInts[i]==searchfor) {
				foundIt=true;
				break;
			}
		}
		if(foundIt) {
			System.out.println("Found: "+searchfor+" at index "+i);
		}else {
			System.out.println(searchfor+" Not in the Array");
		}
	}

}
