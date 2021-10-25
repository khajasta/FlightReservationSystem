package apa2;



public class Flight {

	protected String origin;
	protected String destination;
	protected int month;
	protected int day;
	protected int year;
	protected String type;
    protected  static Seat []s;
	public Flight()
	{
		 s=new Seat[100];
	        for(int i=0;i<100;i++)
	        	s[i]=new Seat();
	        
	}
	public Flight(String orig,String desti,String typ,int mon,int d,int y)
	{
		origin=orig;
		destination=desti;
		type=typ;
	    month=mon;
	    day=d;
	    year=y;
        s=new Seat[100];
        for(int i=0;i<100;i++)
        	s[i]=new Seat();
	}
	public void setflightseat(int seatno)
	{
		try{
			s[seatno].seatno=seatno;
			s[seatno].setreserved();
		}catch(ArrayIndexOutOfBoundsException o)
		{
			System.out.println("Seat Out of Bound");
				
		}
		
	}
	public void setorigin(String orig)
	{
		origin=orig;
	}
	public void setdesti(String desti)
	{
		destination=desti;
	}
	public void settype(String typ)
	{
		type=typ;
	}
	public String getorigin()
	{
		return origin;
	}
	public String getdestination()
	{
		return destination;
	}
	public String gettype()
	{
		return type;
	}
	public int getmonth()
	{
		return month;
	}
	public int getday()
	{
		return month;
	}
	public int getyear()
	{
		return year;
	}
	public String getflighttype()
	{
		return type;
	}
	public Seat getseat(int id)
	{
		return s[id];
	}
}
