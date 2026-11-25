package com.overloading;

public class Calculator {
	int a;
	int b;
	int c;

	public void sub()
	{
		System.out.println("Default substract method");
	}
	
	public int sub(int a, int b)
	{
		this.a=a;
		this.b=b;
	
		System.out.println("Substraction between two number:"+(a-b));
		return a-b;
	}
	
	public int sub(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("Substraction between three number:"+(a-b-c));
		return a-b-c;
	}
	
	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		c.sub();
		c.sub(30,20);
		c.sub(60,20,20);
		
	}
}
