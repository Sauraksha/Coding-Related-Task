package com.constructor;

public class DefaultConstructor {
	
	int rno;
	String name;
	int age;
	String address;
	long contact;
	double fees;
	
	DefaultConstructor()
	{
		rno=10;
		name="Sauraksha";
		age=28;
		address="Lonavala";
		contact=8390199127l;
		fees=129000;
	}
	
	public void displayDetails()
	{
		DefaultConstructor dc=new DefaultConstructor();
		System.out.println("roll_no="+dc.rno);
		System.out.println("Name="+dc.name);
		System.out.println("Address="+dc.address);
		System.out.println("Age="+dc.age);
		System.out.println("Contact_no="+dc.contact);
		System.out.println("Fees="+dc.fees);
	}
	public static void main(String[] args) {
		
		DefaultConstructor dc=new DefaultConstructor();
		dc.displayDetails();
	}
	

}
