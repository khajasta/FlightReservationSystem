package apa2;

public class Business {

	protected int noofseats;
	protected int price;
	public  Business()
	{
		noofseats=0;
		price=2000;
	}
  public  Business(int seats)
  {
	  noofseats=seats;
	  price=5000;
  }
  public int getnoofseats()
  {
	  return noofseats;
  }
  public int getprice()
  {
	  return price;
  }
  public void setnoofseats(int seats)
  {
	  noofseats=seats;
  }
  public void setprice(int p)
  {
	  price=p;
  }
	
}
