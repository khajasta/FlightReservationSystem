package apa2;

public class Economy {
	
	protected int noofseats;
	protected int price;
	public Economy()
	{
		noofseats=0;
		price=1000;
	}
  public Economy(int seats)
  {
	  noofseats=seats;
		price=1000;
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
