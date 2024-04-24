package com;

import java.util.*;

public class Driver 
{
	
	static
	{
		System.out.println("Welcome to Airlines");
	}
	
	public static void main(String[]args)
	{
		System.out.println("Enter 1 to Register");
		System.out.println("Enter 2 to Login");
		System.out.println("Enter 3 to GuestLogin");
		System.out.println("Enter 4 to Exit");
		
		Scanner S=new Scanner(System.in);
		
		Airlines i=new Airlines();
		//SpiceJet s=new SpiceJet();
		
		int n=S.nextInt();
		switch(n)
		{
		case 1:
			i.signup();
		case 2:
			i.details();
		case 3:
			i.homepage();
			break;
		case 4:
			System.out.println("Bye");
			System.exit(0);
			break;
		default:
			System.err.println("Try Again");
			main(null);
			
		}
		System.out.println(Airlines.ticket);
		
	}
}
