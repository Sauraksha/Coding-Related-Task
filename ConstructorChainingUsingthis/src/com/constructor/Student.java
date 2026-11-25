package com.constructor;

public class Student {
	
	Student()
	{
		this(20,"PQR");
		System.out.println("default constructor");
		
	}
	Student(int i)
	{
		this(90.0,true,"abc");
		System.out.println("Single parameter constructor");
	}
	Student(int i,String name)
	{
		this(10);
		System.out.println("two parameter constructor");
	}
	Student(double d,boolean flag,String n)
	{
		System.out.println("Three parameter constructor");
	}
	public static void main(String[] args) {
		Student s= new Student();
		
	}
	
}
