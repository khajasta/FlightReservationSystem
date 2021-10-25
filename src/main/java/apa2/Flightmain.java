package apa2;

import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Flightmain {

	@SuppressWarnings({ "resource", "resource" })
	public static void main( String[] args ) throws UniqueEmail, InvalidAmount 
	    {
		 Menu m = new Menu();
		 int option; boolean flag=false;
		 Scanner sc= new Scanner(System.in);
		 option=0;
		 Reservation  []r=new  Reservation[100];
		 Register r1=new Register(); 
		 int increment=0;
		 while(option!=10)
		 {
			 m.displaymenu();
			 option=sc.nextInt();
		 if(option==1)
		 {
			 FCalendar fCalendar=new FCalendar();
			 fCalendar.setflights();
			 fCalendar.Displaycalendar();
		 }
		 else if(option==6)
		 {
			 FCalendar fCalendar=new FCalendar();
			 fCalendar.setflights();
			 fCalendar.Displayroute();
		 }
		 else if(option==2)
		 {
			 int age,passport; int flightid; int seatno = 0;
			 String name,address,gender;
			   
			 name=""; address=""; age=0; passport=0; gender="";
				r[increment]=new Reservation();
			    Scanner sc1= new Scanner(System.in);
			   
				System.out.println("Enter your details");
				System.out.println("Enter name: ");
			
				name=sc1.nextLine();
				System.out.println("Enter gender: ");
				
				gender=sc1.nextLine();
				
				System.out.println("Enter address: ");
				
					address=sc1.nextLine();
				
				System.out.println("Enter age: ");
				try
				{
					age=sc1.nextInt();
				}
				catch (InputMismatchException e)
				{
					System.out.println("Please enter numerical value. Start Reservation Again");
					continue;
				}
				System.out.println("Enter Passport: ");
				try
				{
					passport=sc1.nextInt();
				}
				catch (InputMismatchException e)
				{
					System.out.print("Please enter numerical value.Start Reservation Again");
					continue;
					
				}
				
				Customer c=new Customer ();
				c.setname(name); c.setaddress(address);
				c.setage(age); c.setPassport(passport);
				c.setgender(gender);
				FCalendar fCalendar=new FCalendar();
				fCalendar.setflights();
				System.out.println("Choose flight id from 0-9 to select your flight type");
				fCalendar.Displaycalendar();
					flightid=sc1.nextInt();
			
				System.out.println("Select seat no(1-100): ");
					seatno=sc1.nextInt();
				
				try {
				r[increment].setreservation(c, flightid, seatno);
				
				}catch(NullPointerException e)
				{
					 System.out.println("NullPOinterException \n Customer Object Not found");
				}
				System.out.println("Your reservation id is "+(r[increment].getreservationid()+1));
				increment+=1;
				flag=true;
		        }
		 else if(option==3)
		 {
			 System.out.println("Enter your reservation id:  ");
			 Scanner sc1= new Scanner(System.in); int id=0;
			 id=sc1.nextInt();
			 try {
		     System.out.println("Name: "+r[id-1].getcustomer().getname());
		     System.out.println("Passport: "+r[id-1].getcustomer().getPassport());
		     System.out.println("Flight type: "+r[id-1].getflight().getflighttype());
		     System.out.println("Seatno: "+r[id-1].getseat().getseat());
		     System.out.println("Class: "+r[id-1].getseat().getseatclass());
			 }
			 catch(NullPointerException e)
			 {
				 System.out.println("NullPOinterException");
			 }
		 }
		 else if(option==4)
		 {
			 int answer; String email, pass; 
			 System.out.println("Press 1 to login \n Press 2 to open new account");
			 Scanner sc1= new Scanner(System.in); 
			 answer=sc1.nextInt();
			 if(answer==1)
			 {
				 Scanner sc2= new Scanner(System.in); 
				System.out.println("Enter email");
				
				 email=sc2.nextLine();
				 Scanner sc3= new Scanner(System.in); 
				 System.out.println("Enter pass");
				 pass=sc3.nextLine();
				 r1.openaccount(email, pass);
				 
			 }
			 else if(answer==2)
			 {
				 Scanner sc2= new Scanner(System.in);
				 System.out.println("Enter email");
				 email=sc2.nextLine();
				 Scanner sc3= new Scanner(System.in); 
				 System.out.println("Enter pass");
				 pass=sc3.nextLine();
				 try {
			     r1.setnewlogin(email, pass);
			 }
				 catch(UniqueEmail e)
				 {
				System.out.println(e.getMessage());
				 }
			 }
		 }
		 else if(option==5)
		 {
			 Payment p=new Payment();
			 int id=0; int amount;
			 System.out.println("Enter Your Reservation id:");
			 Scanner sc1=new Scanner(System.in);
		
			 try {
				 id=sc1.nextInt();
			 }
			 catch(InvalidReservationID i)
			 {
				 System.out.println(i.getMessage());
			 }
			 try {
			 if(flag=true)
			 p.makepayment(r[increment-1], increment-1, id);
			 else
				 p.makepayment(r[increment], increment, id);
			 }
			 catch (InvalidAmount i)
			 {
				System.out.println(i.getMessage());
				if(flag=true)
					 p.makepayment(r[increment-1], increment-1, id);
					 else
						 p.makepayment(r[increment], increment, id);
			 }
			if(r[id-1].getpayment()==true)
			
				System.out.println("Thanks for Payment");
			
		 }
		 }
	    }
}
