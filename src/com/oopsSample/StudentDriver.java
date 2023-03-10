package com.oopsSample;

import java.util.ArrayList;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s1=new Student("Peter");
		
		Student s1=new PayingStudent("Peter",  9.5f,98,89,67,89,67);
		//s1.gotoClass();
		
		Student s2=new PayingStudent("Vicky", 8.9f,56,78,87,98,99);
		//s2.gotoClass();
		Student s3=new CompanyStudent("John","Zuci",56,87,98,78,57);
		Student s4=new CompanyStudent("Raj","Zuci",66,99,90,78,80);
		Student s5=new AuditStudent("Ram","Auditorium 1",70,80,90,67,45);
		StudentList students=new StudentList();
		students.addStudent(s1);
		students.addStudent(s2);
		students.addStudent(s3);
		students.addStudent(s4);
		students.addStudent(s5);
		
		//System.out.println("Object of s5..."+s5.toString());
		
		ArrayList<Student> studs= students.getStudents();
		for(Student stud: studs) {
			System.out.println(stud.toString());
			stud.PrintMarksheet();
			stud.gotoClass();
			System.out.println();
			
			
		}
		
		
		
	}

}
