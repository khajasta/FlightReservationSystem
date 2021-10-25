package apa2;

import java.util.LinkedList;

public class Register {
	
	private LinkedList <String> logindetails; 
	public Register() {
		logindetails = new LinkedList<String>();
	}
    public void setnewlogin(String email,String pass) throws UniqueEmail
    {
    	for(int i=0;i<logindetails.size();i++)
    	{
    		if(email.equals(logindetails.get(i)))
    		{
    			throw new UniqueEmail("Email Already Exists");
    		}
    	}
    	logindetails.add(email);
    	logindetails.add(pass);
        
    }
 
	public void openaccount(String email,String pass)
    
    {    
    	boolean flag=false;
    	for(int i=0;i<logindetails.size();i++) {
			if(email.equals(logindetails.get(i)) && pass.equals(logindetails.get(i+1))) {
		        flag=true;
			}	
		 }
    	if(flag==true)
    		System.out.println("Your account is opened now.");
    	else
    		System.out.println("You haven't registered yet. Please register first");
    	
}
}
