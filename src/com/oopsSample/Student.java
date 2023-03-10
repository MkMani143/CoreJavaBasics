package com.oopsSample;

public abstract class Student implements PrintStudent {
	String name;
	String address;
	float gpa;
	
//	public Student(String name) {
//		this.name=name;
//	}
	
//	public Student(String name, float gpa) {
//		this.name=name;
//		this.gpa=gpa;
//	}
	
	public Student() {
		
	}
	
//	public void gotoClass() {
//		System.out.println("Student goto class... "+ this.name+" " + this.gpa);
//	}
	
//	public final void calculateGPA() {
//		System.out.println("calculateGPA");
//	}
	
	public abstract void gotoClass();
	
	public abstract void  PrintMarksheet();
//{
//		int marks = 400;
//		System.out.println("Marks: "+marks/totalSubjects);
//	}
	
}
