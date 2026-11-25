package com.multipleobject;

public class Employee {
	
	int eid;
	String name;
	double salary;

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.eid=101;
		e1.name="Sauraksha";
		e1.salary=20000;
		
		System.out.println(e1.eid+" "+e1.name+" "+e1.salary);
		
		
		Employee e2=new Employee();
		e2.eid=102;
		e2.name="Sakshi";
		e2.salary=20500;
		
		System.out.println(e2.eid+" "+e2.name+" "+e2.salary);
		
		Employee e3=new Employee();
		e3.eid=103;
		e3.name="Tejaswini";
		e3.salary=50000;
		
		System.out.println(e3.eid+" "+e3.name+" "+e3.salary);
	}
	
}
