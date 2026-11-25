package com.acceptparameter;

public class Employee {

	public void displayDetails(int id,String name)
	{
		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+name);
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		e.displayDetails(101, "Rani");
	}
}
