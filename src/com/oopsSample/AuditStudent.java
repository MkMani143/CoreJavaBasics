package com.oopsSample;

public class AuditStudent extends Student implements PrintStudent{
	String classLocation;
	int m1,m2,m3,m4,m5;
	public AuditStudent(String name,String classLocation,int m1,int m2,int m3,int m4,int m5) {
		this.classLocation=classLocation;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
	}
	public void gotoClass() {
		System.out.println("AuditStudent "+this.name+" goto class..."+this.classLocation);
	}
	
	public String toString() {
		String strObj="AuditStudent name is..."+this.name;
		return strObj;
	}
	@Override
	public void PrintMarksheet() {
		float mark;
		mark=(m1+m2+m3+m4+m5)/totalSubjects;
		System.out.println("Total Mark: "+mark);
		
		
	}
	
}
