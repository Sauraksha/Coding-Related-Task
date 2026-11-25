package com.instancemethod;

public class Student {
	int rno;
	String name;
	
	void setDetails(int r,String n)
	{
		rno=r;
		name=n;
		
	}
	
	void displayDetails()
	{
		System.out.println("roll no:"+rno);
		System.out.println("Name:"+name);
		System.out.println("--------------");
	}
	
	
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.setDetails(1,"pratik");
		s1.displayDetails();
		
		s1.setDetails(2,"pooja");
		s1.displayDetails();
		
		s1.setDetails(3,"pranav");
		s1.displayDetails();
		
	}

}
