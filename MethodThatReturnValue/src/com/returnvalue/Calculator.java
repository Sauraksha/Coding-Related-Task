package com.returnvalue;

public class Calculator {

	public int add(int a,int b) 
	{
		int sum=a+b;
		return sum;
	}
	
	public int sub(int p,int q) 
	{
		int sub=p-q;
		return sub;
	}
	
	public int mul(int x,int y) 
	{
		int mul=x*y;
		return mul;
	}
	
	public double div(int j,int k) 
	{
		double div=j/k;
		return div;
		
	}
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		int sum1=c.add(10, 20);
		System.out.println("Addition is:"+sum1);
		int sub1=c.sub(100, 20);
		System.out.println("Substraction is:"+sub1);
		int mul1=c.mul(10, 20);
		System.out.println("Multiplication is:"+mul1);
		double div1=c.div(100, 20);
		System.out.println("Division is:"+div1);
		
	}
}
