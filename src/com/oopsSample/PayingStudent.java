package com.oopsSample;

public class PayingStudent extends Student implements PrintStudent{
	boolean madePayment;
	int m1,m2,m3,m4,m5;
	public PayingStudent(String name, float gpa,int m1,int m2,int m3,int m4, int m5) {
		//super();
		this.name=name;
		this.gpa=gpa;
		this.m1= m1;
		this.m2= m2;
		this.m3= m3;
		this.m4= m4;
		this.m5= m5;
		
	}
	public void gotoClass() {
	
		System.out.println("PayingStudent goto class... "+ this.name+" "+ this.gpa);
	}
	
	public String toString() {
		String strObj="Object of PayingStudent name is..."+this.name;
		return strObj;
	}
	@Override
	public void PrintMarksheet() {
		float mark;
		mark=(m1+m2+m3+m4+m5)/totalSubjects;
		System.out.println("Total Mark: "+mark);
		
	}
	
}
