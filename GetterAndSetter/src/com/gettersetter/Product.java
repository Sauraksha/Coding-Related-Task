package com.gettersetter;

public class Product {
	private int pid;
	private String name;
	private double price;
	
	public int getPid()
	{
		return pid;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	
	public void setPid(int i)
	{
		pid=i;
	}
	public void setName(String s)
	{
		name=s;
	}
	public void setPrice(double d)
	{
		price=d;
	}
}
