package com.multipleconstructor;

public class Student {
	
	int rno;
	String name;
	String address;
	int age;
	long contact;
	
	Student()
	{
		rno=10;
		name="Sauraksha";
		address="Pune";
		age=28;
		contact=8390199127l;
	}
	
	Student(int r,String n,String a,int ag,long c)
	{
		rno=r;
		name=n;
		address=a;
		age=ag;
		contact=c;
		
	}
	
	
	Student(String a,int ag,long c)
	{
		
		address=a;
		age=ag;
		contact=c;
		
	}
	
	Student(String n,long c)
	{

		name=n;
		contact=c;
		
	}
	
	public void display()
	{
		System.out.println("Roll No: " + rno);
        System.out.println("Name: " + name);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Contact_no: "+contact);
        
        System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student(2,"Disha","PCMC",20,876543899l);
		Student s3=new Student("Lonavala",25,8765489067l);
		Student s4=new Student("Prakul",4567890987l);
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		
	}
	

}
