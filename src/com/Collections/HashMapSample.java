package com.Collections;

import java.util.Map.Entry;
import java.util.HashMap;

public class HashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create hash map
				HashMap<Integer,String> students = new HashMap<>();
				students.put(101,"priya");
				students.put(102,"mani");
				students.put(103,"neha");
				students.put(104,"pavi");
				students.put(105,"mega");
				System.out.println("HashMap: " +students);
				
				//get()method to get value
				for(Entry<Integer,String> i:students.entrySet()) {
					System.out.println(i.getKey()+" "+i.getValue());
				}
	}

}
