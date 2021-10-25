package apa2;

import java.lang.reflect.Array;

public class FCalendar {
	
	protected Flight [] f;
	protected String route;
	public FCalendar()
	{
		f=new Flight[10];
		route="";
	}
	public void setflights()
	{
	f[0]=new Flight("Pakistan","India","Qatar",1,4,2021);
	f[1]=new Flight("Pakistan","India","AirbusA300",1,4,2021);
	f[2]=new Flight("Pakistan","India","AirbusA310",1,4,2021);
	f[3]=new Flight("Pakistan","UK","AirbusA320",2,4,2021);
	f[4]=new Flight("Pakistan","UK","AirbusA320-200",2,4,2021);
	f[5]=new Flight("Pakistan","UK","ATR42/72",2,4,2021);
	f[6]=new Flight("Pakistan","Canada","Douglas DC/8",3,4,2021);
	f[7]=new Flight("Pakistan","Canada","Boeing777",3,4,2021);
	f[8]=new Flight("Pakistan","Canada","Boeing747",3,4,2021);
	f[9]=new Flight("Pakistan","Bangladesh","Boeing737",3,4,2021);
	}
	public void Displaycalendar()
	{
		for(int i=0;i<10;i++)
		{
		System.out.print(i+"Origin  "+f[i].origin+"  ");
		System.out.print("Destination  "+f[i].destination+"  ");
		System.out.print("Type  "+f[i].type+"  ");
		System.out.print("Date  "+f[i].month+"/"+f[i].day+"/"+f[i].year+"  ");
		System.out.println("\n");
		}
	}
	public void Displayroute()
	{
		for(int i=0;i<10;i++)
		{
		System.out.print(i+"Origin  "+f[i].origin+"  ");
		System.out.print("Destination  "+f[i].destination+"  ");
		System.out.print("Type  "+f[i].type+"  ");
		System.out.print("Date  "+f[i].month+"  "+f[i].day+" "+f[i].year+"  ");
		if(i%2==0)
		route="direct";
		else
		route="Indirect";
		System.out.print(route);
		System.out.println("\n");
	}
	}
		public Flight getflight(int id)
		{
			return f[id];
		}

}
