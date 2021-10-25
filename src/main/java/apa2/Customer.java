package apa2;

public class Customer {

	
	private String name;
	private String gender;
	private int age;
	private String address;
	private int Passport;
	private int cardnumber;
	private String email;
	private String pass;
	public Customer()
	{
		cardnumber=0;
	}
	public Customer(String nam,String gen,int umer, String add,int pass1,String emai,String pas,int card)
	{
		nam=name;
		gender=gen;
		age=umer;
		address=add;
		Passport=pass1;
		cardnumber=card;
		email=emai;
		pass=pas;
	}
	public void setname(String nam)
	{
		name=nam;
	}
	public void setgender(String gen)
	{
		gender=gen;
	}
	public void setage(int umer)
	{
		age=umer;
	}
	public void setaddress(String add)
	{
		address=add;
	}
	public void setPassport(int pass1)
	{
		Passport=pass1;
	}
	public void setemail(String emai)
	{
		email=emai;
		
	}
	public void setpass(String pas)
	{
		pass=pas;
	}
	public void setcard(int car)
	{
		cardnumber=car;
	}
	public String getname()
	{
		return name;
	}
	public String getaddress()
	{
		return address;
	}
	public int getPassport()
	{
		return Passport;
	}
	public int getage()
	{
		return age;
	}
	public int getcardnumber()
	{
		return cardnumber;
	}
	public String getemail()
	{
		return email;
	}
	public String getpass() {
        return pass;
	}
	public String getgender()
	{
		return gender;
	}
}
