package com.constructoroverloading;

public class Add {
	int a;
	int b;
	int c;

	Add()
	{
		System.out.println("default parameterized method");
	}
	
	Add(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Addition of two number="+(a+b));
		
	}
	Add(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("Addition of three number="+(a+b+c));
		
	}
	public static void main(String[] args) {
		
		Add a=new Add();
		Add a1=new Add(20,40);
		Add a2=new Add(70,76,45);
	}
}
