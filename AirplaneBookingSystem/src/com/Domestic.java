package com;

import java.util.*;


public class Domestic extends Airlines
{
	/*private static String from;
	private static String to;
	//private Date timing;
	private static String departuredate;
	private static String returndate;*/
	
	Domestic()
	{
		
	}
	
	
	public Domestic(String from,String to,String departuredate,String returndate)
	{
		//super();
		this.from=from;
		this.to=to;
		this.departuredate=departuredate;
		this.returndate=returndate;
	}
	
	/*public void dtraveller()
	{
		if(isRegistered==false)
		{
			System.out.println("Please Register your personal details:");
			domestic();
		}
	}*/
	public void domestic()//signup
	{
		System.out.println("=============================================================");
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
		//isRegistered=true;
	}
	

	
	
	public void dcategory()
	{
		System.out.println("Enter 1 for Indigo");
		System.out.println("Enter 2 for SpiceJet");
		System.out.println("Enter 3 to go back");
		
		Scanner S = new Scanner(System.in);
		int o = S.nextInt();
		switch (o) {
		case 1:
			Indigo d=new Indigo();
			d.indigoairline();
			System.out.println("==========================================================================");
			System.out.println("Choose Class");
			switch(o)
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
			//int w=S.nextInt();
			System.out.println("===============================================================");
			System.out.println("Choose Class:");
			switch(o)
			{
			case 2:
				SpiceJet h=new SpiceJet();
				h.scategory();
			}
			break;
		case 3:
			System.out.println("Thankyou");
			System.exit(0);
			break;
		default:
			System.err.println("Invalid");
			dcategory();
		}
	}
	
		
		
/*	public String getFrom()
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
	}*/
}
