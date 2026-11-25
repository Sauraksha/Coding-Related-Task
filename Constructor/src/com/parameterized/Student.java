package com.parameterized;

public class Student {
	
	int rno;
	String name;
	String address;
	long contact;
	int age;
	char grade;
	
	Student(int stdRno,String stdName,String stdAddress,long stdContact,int stdAge,char stdGrade)
	{
		rno=stdRno;
		name=stdName;
		address=stdAddress;
		contact=stdContact;
		age=stdAge;
		grade=stdGrade;
	}

}
