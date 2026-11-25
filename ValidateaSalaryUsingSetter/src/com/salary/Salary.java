package com.salary;

public class Salary {
	private double salary;
	
	public void setSalary(double s)
	{
		salary=s;
		if(salary>=0)
		{
			System.out.println("Salary is updated");
		}
		else {
			System.out.println("Invalid salary");
		}
		
	
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public static void main(String[] args) {
		Salary s=new Salary();
		s.setSalary(20000);
		System.out.println(s.getSalary());
		
		s.setSalary(-23000);
		System.out.println(s.getSalary());
	}

}
