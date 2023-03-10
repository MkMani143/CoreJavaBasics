package com.Collections;

import java.util.TreeSet;

import java.util.Iterator;

public class TreeSetSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> evenNumber = new TreeSet<String>();
		
		//using add()method
		evenNumber.add("Jaa");
		evenNumber.add("Prasanth");
		evenNumber.add("Ak");
		evenNumber.add("Mani");
		//while printing it will be ordered
		System.out.println("HashSet: "+evenNumber);
		
		
		//calling iterator()method
				Iterator<String> Iterate= evenNumber.iterator();
				System.out.println("TreeSet using Iterator: ");
				while(Iterate.hasNext()) {
					System.out.print(Iterate.next());
					System.out.print(", ");
				}
	}

}
