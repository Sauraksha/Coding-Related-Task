package com.overload;


public class Calculator {
	int a;
	int b;
	int c;

	public void add()
	{
		System.out.println("Default Add method");
	}
	
	public int add(int a, int b)
	{
		this.a=a;
		this.b=b;
	
		System.out.println("Substraction between two number:"+(a+b));
		return a+b;
	}
	
	public int add(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("Addition between three number:"+(a+b+c));
		return a+b+c;
	}
	
	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		c.add();
		c.add(30,20);
		c.add(60,20,20);
		
	}
}