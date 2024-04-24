package com;

import java.util.*;


public class Airlines {


	static String name;
	private long contact;
	static String gender;
    private String email;
    static String from;
    static String to;
	//private Date timing;
	 static String departuredate;
	 static String returndate;
	 static String departureTime;
	 static String arrivalTime;
	 static String price;
	 private String password;
	private  String cpassword;
	 static int age;
	 static String display;
	
	static int ticket;
	
	static Map<String, Integer> cart = new LinkedHashMap<>();
	
	static boolean isRegistered=false;
	boolean b=false;
	
	Airlines()
	{
		
	}
	
	public void details()//login
	{
		if(isRegistered==true)
		{
			System.out.println("No such account exist.Please create a new one");
			signup();
		}
		System.out.println("Proceed for login");
		Scanner S=new Scanner(System.in);
		System.out.println("Enter 1 to login with Contact No");
		System.out.println("Enter 2 to login with Email ID");
		
		int c=S.nextInt();
		switch(c){
		case 1:
			System.out.println("Enter Contact No:");
			try
			{
		    long contact=S.nextLong();
		    S.nextLine();//Closing statement
		    if(contact==this.contact)
		    {
		    	System.out.println("Your Contact no is valid");
		    	passwordvalidation();
		    	}
		    else
		    {
		    	System.err.println("Invalid Contact ID");
		    	details();
		    }
			}
			catch(InputMismatchException i)
			{
				System.err.println("Enter numbers");
				details();
				
			}
		    break;
		
		case 2:
			System.out.println("Enter Email ID");
			S.nextLine();
			String email=S.nextLine();
			if(email.equals(this.email))
			{
				System.out.println("Your email ID is valid");
				passwordvalidation();
			}
			else
			{
				System.err.println("Invalid emailID");
				details();
			}
			break;
			
		default:
			System.err.println("Something went wrong.Try Again!!!");
			details();
		}
	}
	
	
	
	//Validating password
	public void passwordvalidation()
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter your password to Login:");
		password=S.nextLine();
		if(password.equals(this.password))
		{
			System.out.println("Password is valid:");
			b=true;
		}
		else
		{
			System.err.println("Enter valid password:");
			details();
		}
	}
	
	//Confirming password matches cpassword
	public void confirming()
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the password:");
		password=S.nextLine();
		System.out.println("Enter the password again:");
		cpassword=S.nextLine();
		if(password.equals(cpassword))
		{
			System.out.println("You have entered the right password.");
		}
		else
		{
			System.err.println("Password do not match");
			confirming();
		}
	}
	
	//Signin through contact or emailID
	public void signup()
	{
		System.out.println("Enter details for registration");
		Scanner S=new Scanner(System.in);
		contactvalidation();
		emailvalidation();
		confirming();
		captcha();
		isRegistered=true;
	}
	
	//Captcha Generation
	public void captcha()
	{
		String captcha="";
		Random r=new Random();
		while(captcha.length()<6)
		{
			int n=r.nextInt(123);
			if ((n >= 65 && n <= 90) || (n >= 97 && n <= 122) || (n >= 48 && n <= 57)) {
				captcha = captcha + (char) n;//
			}
		}
		System.out.println(captcha);
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the above captcha:");
		String userCaptcha =S.nextLine();
		if (captcha.equals(userCaptcha)) {
			System.out.println("Successful");
		} else {
			System.err.println("Try Again!!!");
			captcha();
		}
	}
	
	//Contact validation
	public void contactvalidation()
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter contact details");
		try {
		contact=S.nextLong();
		if (contact > 999999999L && contact < 10000000000L)
		{
			System.out.println("The Contact is Valid");
		} 
		else 
		{
			System.err.println("Enter 10 digit number");
			contactvalidation(); // method recursion
		}
	}
		catch(InputMismatchException i)
		{
//			System.err.println("ENTER NUMBERS");
			contactvalidation();
		}
	}
	
	public void emailvalidation()
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter your email id:");
		email=S.nextLine();
		if(email.endsWith("@gmail.com329"))
		{
			System.out.println("Email is valid");
		}
		else
		{
			System.err.println("Invalid Email ID");
			emailvalidation();
		}
	}
	
	public static void mtimings(Map<Object,Object>m)
	{
		for(Map.Entry<Object,Object>entry:m.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		//ITravellers_details();
	}
	
	public static void pricings(Map<Object,Object>is)
	{
		for(Map.Entry<Object,Object>entryc:is.entrySet())
		{
			System.out.println(entryc.getKey()+" : "+entryc.getValue());
		}
	}
	
	public static void display()
	{
		Map<String ,String>m=new HashMap<>();
		System.out.println("===================================================================");
		for(Map.Entry<String,String>entry:m.entrySet())
		{
			String departureTime=entry.getKey();
			String arrivalTime=entry.getValue();
		}
		
		
		Scanner S=new Scanner(System.in);
		String ty=S.next();
		
		if(ty.equals("1"))
		{
		System.out.println("Enter 0 if you want to go back");
		System.out.println("Enter 1 if you want to print details");
		//Scanner S=new Scanner(System.in);
			
			//timings();
			System.out.println("=============================PRINTING YOUR TICKET=============================");
			System.out.println("Name:"+name);
			System.out.println("Gender:"+gender);
			System.out.println("Age:"+age);
			System.out.println("From:"+from);
			System.out.println("To:"+to);
			System.out.println("Departure Date:"+departuredate);
			System.out.println("Return date:"+returndate);
		}
	}
			
			//System.out.println("Price:"+price);
			//System.out.println("Departure Time: "+departureTime+" Arrival Time: "+arrivalTime);
			
		
		
	
	public static void timings() {
		System.out.println("Enter 1 for Morning Flights");
		System.out.println("Enter 2 for Afternoon Flights");
		System.out.println("Enter 3 for Evening Flights");
		System.out.println("Enter 4 to go back");
		
		Scanner S=new Scanner(System.in);
		int choice=S.nextInt();
		
		switch(choice)
		{
		case 1:
			displayFlights("Morning Flights:");
			//display();
			break;
		case 2:
			displayFlights("Afternoon Flights:");
			//display();
			break;
		case 3:
			displayFlights("Evening Flights:");
		    //display();
		    break;
		case 4:
			System.out.println("Go back:");
		default:
			System.out.println("Invalid");
		}
	}
	
	public static void displayFlights(String timeOfDay)
	{
		Map<String,String> flight=new HashMap<>();
		System.out.println("Enter 1 for Morning");
		System.out.println("Enter 2 for Afternoon");
		System.out.println("Enter 3 for Evening");
		Scanner sb=new Scanner(System.in);
		int s=sb.nextInt();
		switch(s)
		{
		case 1:
		flight.put("08:45", "10:45");
		System.out.println("Flights "+timeOfDay+":");
		price();
		//display();
		break;
		
		case 2:
		flight.put("11:00","01:00");
		System.out.println("Flights "+timeOfDay+":");
		price();
		//display();
		break;
		
		case 3:
		flight.put("06:00", "08:00");
		System.out.println("Flights "+timeOfDay+":");
		price();
		//display();
		break;
		}
		//System.out.println("Flights "+timeOfDay+":");
		
		for(Map.Entry<String,String>entry:flight.entrySet())
		{
		String departureTime=entry.getKey();
		String arrivalTime=entry.getValue();
		System.out.println("Departure Time: "+departureTime+" Arrival Time: "+arrivalTime);
		}
	}
	
	public static void price()
	{
		Map<Integer,String> mp=new HashMap<>();
		System.out.println("Enter 1 for Mprices Prices");
		System.out.println("Enter 2 for Afternoon Prices");
		System.out.println("Enter 3 for Evening prices");
		
		Scanner S=new Scanner(System.in);
		int cg=S.nextInt();
		switch(cg)
		{
		case 1:
			mp.put(1, "5128");
			//System.out.println("Morning prices: Rs 5128");
			display();
			break;
		case 2:
			mp.put(2, "6231");
			//System.out.println("Afternoon prices: Rs 6231");
			display();
			break;
		case 3:
			mp.put(3, "7124");
			//System.out.println("Morning prices: Rs 7124");
			display();
			break;
		default:
			System.out.println("Invalid Choice");
			}
		
		for(Map.Entry<Integer,String>entry:mp.entrySet())
		{
		Integer keys=entry.getKey();
		String price=entry.getValue();
		System.out.println("Price: "+price);
		}
	}
	
	/*public static void displayp()
	{
		Map<Integer,String> mp=new HashMap<>();
		mp.put(1, "5128");
		mp.put(2, "6231");
		mp.put(3,"7124");

		for(Map.Entry<Integer,String>entry:mp.entrySet())
		{
		Integer keys=entry.getKey();
		String price=entry.getValue();
		System.out.println("Price is: "+price);
		}
		
		display();
	}*/
			
			
		
				/*case "2":
					Map<Object,Object> q=new HashMap<>();
					q.put(2,6124);
					System.out.println("===================================================================");
					System.out.println("Enter 0 if you want to go back");
					System.out.println("Enter 1 if you want to print details");
					
						Airlines e=new Airlines();
						e.homepage();
						
						//timings();
						System.out.println("=============================PRINTING YOUR TICKET=============================");
						System.out.println("Name:"+name);
						System.out.println("Gender:"+gender);
						System.out.println("Age:"+age);
						System.out.println("From:"+from);
						System.out.println("To:"+to);
						System.out.println("Departure Date:"+departuredate);
						System.out.println("Return date:"+returndate);
						//System.out.println("Price:"+price);
						System.out.println("Departure Times And Arrival Times:");
						mtimimgs(m);
					    
					}
					break;
				
				case 3:
					Map<Object,Object> v=new HashMap<>();
					v.put(3,7126);
					//break;
				    
				    for(Map.Entry<Object, Object> entryn : m.entrySet())
				{
				    Object keyn=entry.getKey();
					Object valuen=entry.getValue();
					
					String keyStringn=key.toString();
				}
				
				switch(g)
				{
				case 1:
				System.out.println("===================================================================");
				System.out.println("Enter 0 if you want to go back");
				System.out.println("Enter 1 if you want to print details");
				
					Airlines e=new Airlines();
					e.homepage();
					
					//timings();
					System.out.println("=============================PRINTING YOUR TICKET=============================");
					System.out.println("Name:"+name);
					System.out.println("Gender:"+gender);
					System.out.println("Age:"+age);
					System.out.println("From:"+from);
					System.out.println("To:"+to);
					System.out.println("Departure Date:"+departuredate);
					System.out.println("Return date:"+returndate);
					//System.out.println("Price:"+price);
					System.out.println("Departure Times And Arrival Times:");
					mtimimgs(m);
				    
				}
				break;
			default:
				System.out.println("Try Again");
			
			}
		}
		    //ITravellers_details();
		    //mtimimgs(m);
		}
		}*/
		
		//Arrival Time
				/*if (o == 2) {
					Map<Object,Object> op=new HashMap<>();
						op.put("12:00","02:45");
					   // m.put("11:00","01:00");
					   // m.put("10:00","12:00");
					    
					    for(Map.Entry<Object, Object> nm: op.entrySet())
					{
					    Object keyop=nm.getKey();
						Object valueop=nm.getValue();
						String keyStringop=keyop.toString();
						
						
						
						switch(keyStringop)
						{
						case "12:00":
							System.out.println("Departure Time: "+keyStringop+" Arrival Time: "+valueop);
							int dw=S.nextInt();
							
							Map<Object,Object> pi=new HashMap<>();
							pi.put(1,5198);
							
							System.out.println("Enter 1 for Morning Ticket Price");
							System.out.println("Enter 2 for Afternoon Ticket Price");
							System.out.println("Enter 3 for Evening Ticket Price");
							
							for(Map.Entry<Object, Object> ent: pi.entrySet())
							{
							    Object keyr=ent.getKey();
								Object valuer=ent.getValue();
								String keyStringr=keyr.toString();
							
								switch(keyStringr)
								{
								case "2":
									System.out.println("Price: "+price);
								
									System.out.println("===================================================================");
									System.out.println("Enter 0 if you want to go back");
									System.out.println("Enter 1 if you want to print details");
									
										
									switch(keyStringr)
									{
									case "1":
										
										System.out.println("=============================PRINTING YOUR TICKET=============================");
										System.out.println("Name:"+name);
										System.out.println("Gender:"+gender);
										System.out.println("Age:"+age);
										System.out.println("From:"+from);
										System.out.println("To:"+to);
										System.out.println("Departure Date:"+departuredate);
										System.out.println("Return date:"+returndate);
										//System.out.println("Price:"+price);
										System.out.println("Departure Times And Arrival Times:");
									mtimings(op);
									    System.out.println("Price:");
								    pricings(pi);
								    
									case "0":
										timings();
									    
								
									break;
									}
									}
							}
							}
						}
					    
					    if (o == 3) {
							Map<Object,Object> n=new HashMap<>();
								n.put("08:45","10:45");
							   // m.put("11:00","01:00");
							   // m.put("10:00","12:00");
							    
							    for(Map.Entry<Object, Object> entr: n.entrySet())
							{
							    Object keya=entr.getKey();
								Object valuea=entr.getValue();
								String keyStringa=keya.toString();
								
								switch(keyStringa)
								{
								case "08:45":
									System.out.println("Departure Time: "+keyStringa+" Arrival Time: "+valuea);
									int t=S.nextInt();
									System.out.println("Enter 1 for Morning Ticket Price");
									System.out.println("Enter 2 for Afternoon Ticket Price");
									System.out.println("Enter 3 for Evening Ticket Price");
									
									for(Map.Entry<Object, Object> ent: n.entrySet())
									{
									    Object keyr=entr.getKey();
										Object valuer=entr.getValue();
										String keyStringr=keyr.toString();
									
									switch(t)
									{
									case 3:
										System.out.println("Price: "+price);
										Map<Object,Object> pe=new HashMap<>();
										pe.put(3,6123);
										
										switch(keyStringr)
										{
										case "1":
											System.out.println("Price: "+price);
									
									
										System.out.println("===================================================================");
										System.out.println("Enter 0 if you want to go back");
										System.out.println("Enter 1 if you want to print details");
										
											//Airlines e=new Airlines();
											//homepage();
											
										switch(t)
										{
										case 3:
											
											System.out.println("=============================PRINTING YOUR TICKET=============================");
											System.out.println("Name:"+name);
											System.out.println("Gender:"+gender);
											System.out.println("Age:"+age);
											System.out.println("From:"+from);
											System.out.println("To:"+to);
											System.out.println("Departure Date:"+departuredate);
											System.out.println("Return date:"+returndate);
											System.out.println("Departure Times And Arrival Times:");
										mtimings(n);
										System.out.println("Price:");
										pricings(pe);
										
										case 0:
											timings();
										
										    
										
									default:
										System.out.println("Try Again");
									
										break;
										}
											}
									}
					}
			}
		}

				}
			}


			}
		}
		}





		
				   // ITravellers_details();
		//ITravellers_details();


	
	
	
	

	//Getter-Setter Methods
	public long getContact()
	{
		return contact;
	}
	public void setContact(long contact)
	{
		this.contact=contact;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	
	public String getCPassword()
	{
		return cpassword;
	}
	public void setCPassword(String cpassword)
	{
		this.cpassword=cpassword;
	}
	
	
	
	
	
    /*public static void display()
	{
		System.out.println("Departure time is:");
		
		//String[] departureTime= {"08:40","07:00","09:00"};
		//String[] arrivalTime= {"10:45","08:55","11:05"};
		//String[] price= {"6188","6531","6636","6689"};
		
		//String[] tp={"Departure Time is: "+departureTime,"Arrival Time is: "+arrivalTime,"Price is: "+price};
		//for(int i=0;i<departureTime.length ;i++)
		{
			System.out.println((i+1)+","+departureTime[i]);
		}
		//String[] tp={"Departure Time is: "+departureTime,"Arrival Time is: "+arrivalTime,"Price is: "+price};
		Scanner S=new Scanner(System.in);
		//DepartureTime
		//System.out.println("Choose the DepartureTime");
		int dt=S.nextInt();
		S.nextLine();
		
		//Departure Time
		if(dt<1||dt>departureTime.length)
		{
			System.out.println("Invalid please select the options");
			return;
		}
		
		//Arrival Time
		for(int j=0;j<arrivalTime.length;j++)
		{
			System.out.println((j+1)+","+arrivalTime[j]);
		}
		
		System.out.println("Choose the ArrivalTime");
		int at=S.nextInt();
		S.nextLine();
		
		if(at<1||at>arrivalTime.length)
		{
			System.out.println("Invalid please select the options");
			return;
		}
		
		//Price
		for(int i=0;i<price.length;i++)
		{
			System.out.println((i+1)+","+price[i]);
		}
		
		System.out.println("Choose the price");
		int pp=S.nextInt();
		S.nextLine();
		
		if(pp<1||pp>price.length)
		{
			System.out.println("Invalid please select the options");
			return;
		}
		
		
		/*public String toString()
		{
		String combine="Departure Time is: "+departureTime+"Arrival Time: "+arrivalTime+"Price is: "+price;
		System.out.println(combine);
		return "";
		}
	}*/
		
		//String dap=(DepartureTime + ArrivalTime + price);
		//display(DepartureTime,ArrivalTime,price);
		//public static void display(String departureTime,String arrivalTime,String price)
		//{
			//String combine="Departure Time is: "+departureTime+"Arrival Time: "+arrivalTime+"Price is: "+price;
			//System.out.println(combine);
		//}
	

	
	public static void homepage()
	{
		System.out.println("===========================================================================");
		System.out.println("Enter 1 for Domestic:");
		System.out.println("Enter 2 for International:");
		System.out.println("Enter 3 for Exit:");
		
		Scanner S = new Scanner(System.in);

		int o = S.nextInt();
		switch (o) {
		case 1:
			Domestic d=new Domestic();
			d.domestic();
			System.out.println("==========================================================================");
			System.out.println("Choose Airline");
			int u = S.nextInt();
			switch(u)
			{
			case 1:
				//System.out.println("Choose Airline");
				Domestic c=new Domestic();
				c.dcategory();
				}
			break;
		case 2:
			International i=new International();
			i.international();
			System.out.println("Choose Mode");
			int n = S.nextInt();
			switch(n)
			{
			case 1:
				//System.out.println("Choose Airline");
				International c=new International();
				c.icategory();
				}
			
			break;
		case 3:
			System.out.println("Bye Bye");
			System.exit(0);
			break;
		default:
			System.err.println("Try Again !!");
			//main(null);
			homepage();
		}
		//System.out.println(ticket);
	}
			
		    
		
	}







