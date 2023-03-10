package com.oopsSample;

public class CompanyStudent extends Student implements PrintStudent{
	String companyName;
	int m1,m2,m3,m4,m5;
	public CompanyStudent(String name,String companyName,int m1,int m2,int m3,int m4, int m5) {
		this.name=name;
		this.companyName=companyName;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
	}
	public void gotoClass() {
		System.out.println("CompanyStudent goto class... "+ this.name+" " + this.companyName);
	}
	
	public String toString() {
		String strObj="Object of CompanyStudent name is..."+this.name;
		return strObj;
	}
	@Override
	public void PrintMarksheet() {
		float mark;
		mark=(m1+m2+m3+m4+m5)/totalSubjects;
		System.out.println("Total Mark: "+mark);
		
	}
}
