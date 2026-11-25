package com.constructor;

public class Student {
	int Roll_no;
	String name;
	String address;
	
	Student(int r,String n,String a)
	{
		Roll_no=r;
		name=n;
		address=a;
	}
	
	public void display()
	{
		System.out.println("Roll_no="+Roll_no);
		System.out.println("Name="+name);
		System.out.println("Address="+address);
		System.out.println("---------------------");
		
	}
	
	public static void main(String[] args) {
		Student s1=new Student(1,"Sauraksha","Lonavala");
		Student s2=new Student(2,"Pranav","Pune");
		s1.display();
		s2.display();
		
	}

}
