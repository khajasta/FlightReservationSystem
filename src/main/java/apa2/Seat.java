package apa2;

public class Seat {

	protected String seatclass;
	protected int seatno;
	protected boolean reserved; 
	protected static int nextseat=0; 
	Seat()
	{
		nextseat++;
		seatclass="";
	seatno=nextseat;
	reserved=false;
	}
	public void setseatclass(String c)
	{
		seatclass=c;
	}
	public void setseat(int seatnumber)
	{
		seatno=seatnumber;
	}
	public int getseat()
	{
		return seatno;
	}
	public void setreserved()
	{
		reserved=true;
	}
	public boolean isreserved()
	{
		return reserved;
	}
	public String getseatclass()
	{
		return seatclass;
	}
}
