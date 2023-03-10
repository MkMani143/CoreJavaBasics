package com.Collections;

import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create Arraylist
				ArrayList<String> students = new ArrayList<>();
				//Add elements to Array List
				
				students.add("Priya");
				students.add("Mani");
				students.add("Aruna");
				students.add("Niran");
				students.add("Raj");
				
				//Student  = new PayingStudent("Peter");
						
				System.out.println("ArrayList:" + students);
				
				//To read element
				System.out.println("Get element: " +students.get(1));
				System.out.println(students.get(0));
				//to update element
				students.set(2, "Mega");
				System.out.println(students);
				//to remove element
				students.remove(3);
				System.out.println(students);
				
				//to clear 
				students.clear();
				System.out.println(students);
	}

}
