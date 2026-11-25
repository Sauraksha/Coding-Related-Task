package com.bankacount;
import java.util.Scanner;
public class BankAcount {
	
	private double balance;
	Scanner sc=new Scanner(System.in);
	
	 
	public void deposit()
	{
		System.out.println("enter the balance:");
		balance=sc.nextDouble();
		
		System.out.println("enter the amount to deposit:");
		double amount=sc.nextDouble();
		if(amount>=0)
		{
			balance=balance+amount;
			System.out.println("Total balance is:"+balance);
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}
	
	public void withdraw()
	{
		System.out.println("enter the amount to withdraw:");
		double amount1=sc.nextDouble();
		if(amount1<=0)
		{
			System.out.println("not valid ");
		}
		else if( amount1<=balance)
		{
			balance=balance-amount1;
			System.out.println("Total balance is:"+balance);
			
		}
		else
		{
		System.out.println("Not enough amount");
		}
		
	}
	
	public static void main(String[] args) {
		BankAcount b=new BankAcount();
		b.deposit();
		b.withdraw();
	}
	
	
	
	

}
