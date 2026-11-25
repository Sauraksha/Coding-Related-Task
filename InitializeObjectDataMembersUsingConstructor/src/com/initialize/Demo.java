package com.initialize;

public class Demo {
	
	int rollno;
	String name;
	float marks;
	
	Demo(int rollno,String name,float marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	
	public static void main(String[] args) {
		
		Demo d=new Demo(101,"Sauraksha",60);
		System.out.println("RollNo="+d.rollno);
		System.out.println("Name="+d.name);
		System.out.println("Marks="+d.marks);
		
		Demo d1=new Demo(102,"Tejaswini",90);
		System.out.println("RollNo="+d1.rollno);
		System.out.println("Name="+d1.name);
		System.out.println("Marks="+d1.marks);
		
		Demo d2=new Demo(103,"Sakshi",87);
		System.out.println("RollNo="+d2.rollno);
		System.out.println("Name="+d2.name);
		System.out.println("Marks="+d2.marks);
		
	}

}
