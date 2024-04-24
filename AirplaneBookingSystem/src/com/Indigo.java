package com;

import java.util.*;

public class Indigo extends Domestic
{
	/*private String name;
	private String gender;
	private int age;
	//private Date timing;
	private int price;*/
	static boolean isRegistered=true;
	
	Indigo()
	{
		
	}
	
	public Indigo(String name,String gender,int age,String departureTime,String arrivalTime,String price)
	{
		//super();
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.departureTime=departureTime;
		this.arrivalTime=arrivalTime;
		this.price=price;
	}
	public void travellers_details()
	{
		if(isRegistered==false)
		{
			System.out.println("Please Register your personal details:");
			indigoairline();
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
	public void indigoairline()//signup
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
	
	public void ebcategory()
	{
		System.out.println("Enter 1 for Economy");
		System.out.println("Enter 2 for Bussiness");
		System.out.println("Enter 3 to go back");
		Scanner S = new Scanner(System.in);
		
		int o = S.nextInt();
			if(o==1) {
				timings();
			}
			
		else if (o == 2)
		{
			timings();
			
		}
		else if (o == 3)
		{
			homepage();
		}
		
	}
	
	
}

