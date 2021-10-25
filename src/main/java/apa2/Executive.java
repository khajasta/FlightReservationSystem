package apa2;

public class Executive {

	
	protected int noofseats;
	protected int price;
	public Executive()
	{
		noofseats=0;
		price=2000;
	}
  public Executive(int seats)
  {
	  noofseats=seats;
	  price=2000;
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
