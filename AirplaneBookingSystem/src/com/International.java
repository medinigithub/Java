package com;

import java.util.*;

public class International extends Airlines
{
	/*private String name;
	private String gender;
	private String from;
	private String to;
	//private Date timing;
	private String departuredate;
	private String returndate;*/
	static boolean isRegistered=true;
	
	International()
	{
		
	}
	
	public International(String name,String gender,int age,long price)
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
			international();
		}
	}
	
	public void international()//signup
	{
		System.out.println("Enter details for registration");
		Scanner S=new Scanner(System.in);
		System.out.println("Enter from:");
		from=S.next();
		System.out.println("Enter To:");
		to=S.next();
		System.out.println("Enter Departure Date:");
		departuredate=S.next();
		System.out.println("Enter Return Date:");
		returndate=S.next();
		isRegistered=true;
	}
	
	public void icategory()
	{
		System.out.println("Enter 1 for Indigo");
		System.out.println("Enter 2 for SpiceJet");
		System.out.println("Enter 3 to go back");
		Scanner S = new Scanner(System.in);
		int e = S.nextInt();
		switch (e) {
		case 1:
			Indigo d=new Indigo();
			d.indigoairline();
			System.out.println("==========================================================================");
			System.out.println("Choose Class");
			switch(e)
			{
			case 1:
				//System.out.println("Choose Airline");
				Indigo c=new Indigo();
				c.ebcategory();
				}
			break;
		case 2:
			SpiceJet in=new SpiceJet();
			in.spicejetairline();
			System.out.println("===============================================================");
			System.out.println("Choose Class:");
			switch(e)
			{
			case 2:
				SpiceJet h=new SpiceJet();
				h.scategory();
			}
		case 3:
			System.out.println("Thankyou");
			System.exit(0);
			break;
		default:
			System.err.println("Invalid");
			icategory();
		}
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	
	public String getFrom()
	{
		return from;
	}
	public void setFrom(String from)
	{
		this.from=from;
	}
	
	public String getTo()
	{
		return to;
	}
	public void setTo(String to)
	{
		this.to=to;
	}
	
	public String getDepartureDate()
	{
		return departuredate;
	}
	public void setDepartureDate(String departuredate)
	{
		this.departuredate=departuredate;
	}
	
	public String getReturnDate()
	{
		return returndate;
	}
	public void setReturnDate(String returndate)
	{
		this.returndate=returndate;
	}
}
