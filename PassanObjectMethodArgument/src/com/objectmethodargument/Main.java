package com.objectmethodargument;

public class Main {

	public void show(Employee e) {
		System.out.println("employee id:"+e.empid);
		System.out.println("employee name:"+e.name);
		System.out.println("employee salary:"+e.salary);
	}
	
	public static void main(String[] args) {
		Main m=new Main();
	
		Employee e=new Employee(101,"sakashi",30000);
		m.show(e);

	}

}