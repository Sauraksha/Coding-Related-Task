package com.parameterized;

public class MainClass {
	
	public static void main(String[] args) {
		System.out.println("----Student Details----");
		Student s=new Student(101,"sauraksha","lonavala",8390199127l,28,'A');
		System.out.println("Student RollNo="+s.rno);
		System.out.println("Student Name="+s.name);
		System.out.println("Student Address="+s.address);
		System.out.println("Student ContactNo="+s.contact);
		System.out.println("Student Age="+s.age);
		System.out.println("Student Grade="+s.grade);
		
		
		System.out.println("--------------------------");
		
		System.out.println("----Employee Details----");
		Employee e=new Employee(102,"sauraksha",100000);
		System.out.println("Employee id="+e.eid);
		System.out.println("Employee Name="+e.name);
		System.out.println("SEmployee Salary="+e.salary);
		
	}

}
