package com.privatememberthroughpublicmethod;

public class Student {
	
	private int id;
	private String name;
	private String address;
	private double fees;
	
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id1) {
		id = id1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name1) {
		name = name1;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address1) {
		address = address1;
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.setId(101);
		System.out.println("ID="+s.getId());
		s.setName("sauraksha");
		System.out.println("NAME="+s.getName());
		s.setAddress("pune");
		System.out.println("ADDRESS="+s.getAddress());
		s.setFees(30000);
		System.out.println("FEES="+s.getFees());
	}
	
	

}
