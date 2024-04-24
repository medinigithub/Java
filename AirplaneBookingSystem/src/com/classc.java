package com;

import java.util.*;

public class classc extends Indigo
{
	private int price;
	
	classc()
	{
		
	}
	
	public void classc(int price)
	{
		this.price=price;
	}
	
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public void ebcategory()
	{
		System.out.println("Enter 1 for Economy");
		System.out.println("Enter 2 for Bussiness");
		System.out.println("Enter 3 to go back");
		
		//Scanner S=new Scanner(System.in);
		//System.out.println("Enter the price");
		//int price=S.nextInt();
	}

}
