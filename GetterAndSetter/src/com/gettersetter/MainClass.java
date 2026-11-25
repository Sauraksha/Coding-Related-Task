package com.gettersetter;

public class MainClass {
	public static void main(String[] args) {
		Product p=new Product();
		p.setPid(101);
		p.setName("sauraksha");
		p.setPrice(20000);
		
		System.out.println(p.getPid());
		System.out.println(p.getName());
		System.out.println(p.getPrice());
	}

}
