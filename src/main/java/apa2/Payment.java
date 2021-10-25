package apa2;

import java.util.Scanner;

public class Payment {


	private static int id;
	Payment()
	{
		id+=1;
	
	}
	
	public void makepayment(Reservation r,int increment,int id) throws InvalidAmount
	{
		
	if(r.getcurrentid()>increment)
		throw new InvalidReservationID("Reservation ID doesn't exist");
	int card; int amount = 0;
	System.out.println("Enter your card number: ");
	@SuppressWarnings("resource")
	Scanner s1=new Scanner(System.in);
	card=s1.nextInt();
	r.getcustomer().setcard(card);
	System.out.print("Your Booking Details are as follows: ");
	System.out.print("Flight Info :"+ r.getflight().getorigin()+" to "+r.getflight().getdestination());
	System.out.println("\nSeat: "+r.getseat().getseat());
	System.out.print("Total Amount: ");
	System.out.println(r.getprice());
	System.out.print("Enter Amount to pay: ");
	amount=s1.nextInt();
	if(amount==r.getprice())
	r.setpayment();
	else
		throw new InvalidAmount("Please Enter Correct Amount");
	}
}
