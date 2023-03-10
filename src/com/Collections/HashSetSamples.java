package com.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> evenNumber = new HashSet<Integer>();
		
		//using add()method
		evenNumber.add(4);
		evenNumber.add(2);
		evenNumber.add(8);
		evenNumber.add(6);
		//while printing it will be ordered
		System.out.println("HashSet: "+evenNumber);
		
		//calling iterator()method
		Iterator<Integer> Iterate= evenNumber.iterator();
		System.out.println("HashSet using Iterator: ");
		while(Iterate.hasNext()) {
			System.out.print(Iterate.next());
			System.out.print(", ");
		}
	}

}
