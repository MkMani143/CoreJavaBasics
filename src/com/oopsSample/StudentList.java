package com.oopsSample;

import java.util.ArrayList;

public class StudentList {
	ArrayList<Student> studList;
	public StudentList() {
		System.out.println("Creating Student list...\n");
		System.out.println("Add students to the list...\n");
		studList=new ArrayList<>();
	}
	
	public void addStudent(Student student) {
		
		studList.add(student);
	}
	
	public ArrayList getStudents() {
		return studList;
	}
}
