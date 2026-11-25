package com.constructorexecutionorder;

public class Student {

	    Student() {
	        System.out.println("Constructor is executed");
	        System.out.println("-------------------------");
	    }

	    public static void main(String[] args) {

	        System.out.println("Creating first object");
	        Student s1 = new Student();

	        System.out.println("Creating second object");
	        Student s2 = new Student();

	        System.out.println("Creating third object");
	        Student s3 = new Student();
	    }
	
}
