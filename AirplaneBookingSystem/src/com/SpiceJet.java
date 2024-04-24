package com;

import java.util.*;

public class SpiceJet extends Airlines
{
	//private String name;
	//private String gender;
	//private int age;
	//private Date timing;
	//private int price;
	static boolean isRegistered=true;
	
	SpiceJet()
	{
		
	}
	
	public SpiceJet(long contact,String email,String password,String cpassword,String from,String to,String departuredate,String returndate,String name,String gender,int age,int price)
	{
		//super();
		this.name=name;
		this.gender=gender;
		this.age=age;
		//this.price=price;
	}
	public void travellers_details()
	{
		if(isRegistered==false)
		{
			System.out.println("Please Register your personal details:");
			spicejetairline();
		}
	}
	
	public void agev()
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter Age");
		try {
		age=S.nextInt();
		if (age>0 && age<100)
		{
			System.out.println("Entered Age entered is valid");
		} 
		else 
		{
			System.err.println("Entered age is invalid");
			agev(); // method recursion
		}
		}
		catch(InputMismatchException i)
		{
			System.err.println("ENTER NUMBERS");
			agev();
		}
	}
	public void spicejetairline()//signup
	{
		System.out.println("Enter details for registration");
		Scanner S=new Scanner(System.in);
		System.out.println("Enter your name:");
		name=S.next();
		System.out.println("Enter your Gender:");
		gender=S.next();
		agev();
		//System.out.println("Enter the price:");
		//price=S.nextInt();
		isRegistered=true;
		//this.ITravellers_details();
	}
	
	public void scategory()
	{
		System.out.println("Enter 1 for Economy");
		System.out.println("Enter 2 for Bussiness");
		System.out.println("Enter 3 to go back");
		Scanner S = new Scanner(System.in);
		
		int v = S.nextInt();
		if (v == 1) {
			//v.ITravellers_details();
		} 
		else if (v == 2)
		{
			//payment
			//ITravellers_details();
		}
		else if (v == 3)
		{
			homepage();
		}
		
	}
	
	
}

