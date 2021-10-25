package apa2;

import java.io.FileWriter;
import java.io.IOException;

public class Reservation {

	private  Customer [] c;
	private Flight [] f;
	private FCalendar fc;
	private static int id=0;
	private Seat s[];
	private int currentid;
	int price;
	private boolean payment;
    public Reservation()
    {
    	id+=1;
    	currentid=id-1;
    	c=new Customer[100];
    	f=new Flight[100];
    	fc=new FCalendar();
    	fc.setflights();
    	price=0;
    	payment=false;
    	s=new Seat[100];
    }
    public void setreservation(Customer c1,int choice,int seatnumber)
    {
    	f[currentid]=new Flight();
    	c[currentid]=new Customer();
    	 s[currentid]=new Seat();
        f[currentid]=fc.getflight(choice);
    
    c[currentid]=c1;//c1;	
   
	f[currentid].setflightseat(seatnumber);
	s[currentid].setseat(seatnumber);
	
    if(seatnumber<35)
    {
    	s[currentid].setseatclass("Economy");
    price=1000;
    }
    else if(seatnumber>=35 && seatnumber<75)
    	 {
    	s[currentid].setseatclass("Executive");
    	price=2000;
    	 }
    else if(seatnumber>=75 && seatnumber<100)
    	 {
    	s[currentid].setseatclass("Business");
    	price=5000;
    	 }
  
    try {
        FileWriter f1 = new FileWriter("filename.txt",true);
        f1.append("ID: "+currentid+"\n"+"Name: " + c[currentid].getname()+"\n"+ " Gender: " + c[currentid].getgender() +"\n");
        f1.append("Age:  "+c[currentid].getage()+"\n"+"Address: "+c[currentid].getaddress()+"\n");
        f1.append("Source: "+fc.getflight(currentid).getorigin()+"\n" +" Destination: "+fc.getflight(choice).getdestination()+"\n");
        f1.append("Seat No: "+s[currentid].getseat()+"\n");
        f1.append("Class: "+s[currentid].getseatclass()+"\n");
         f1.close();
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    
    
    }
   
    public int getreservationid()
    {
    	return currentid;
    }
    public Customer getcustomer()
    {
    	return c[currentid];
    }
    public Flight getflight()
    {
    	return f[currentid];
    }
    public Seat getseat()
    {
    	return s[currentid];
    }
    public void setprice(int amount) {
    	price=amount;
    }
    public int getprice()
    {
    	return price;
    }
    public int getcurrentid()
    {
    	return currentid;
    }
    public void setpayment()
    {
    	payment=true;
    }
    public boolean getpayment()
    {
    	return payment;
    }
}
