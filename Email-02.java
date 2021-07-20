//this is named as project.java and present in javaproject package



package javaproject;               //Email set up for one person         

import java.util.*;

import java.io.*;
import javaproject2.*;      //Package Importing


//interface
class inter implements inter2        //Interface implementation
{
	public void show()
	{
		System.out.println("\t\t\t\t\t\t EMAIL SET-UP FOR 1 PERSON  \t\t");
		System.out.println();
		System.out.println("The owner of the project is :-");
		System.out.println("Swasthik_S_Nettar - 4NI19IS102 - A_Section ");
		System.out.println("Welcome to the creation of your personal email account!!!!");
		System.out.println("Follow the steps to create yor email");
	}
}


//exception handling
class NewException extends Exception      //Exception Handling
{
	 NewException(String s)
	{
		super(s);
		System.out.println(s);
		
	}
} 
 
 class emailname extends email           //Single_level Inheritance
{
	 String e_adrs;
	
	public emailname()
	{
		e_adrs="Enter valid email address";
	}
	
	public emailname(String name,int dd, int mm,int yyyy,String e_adrs)
	{
		super(name,dd,mm,yyyy);
		this.e_adrs=e_adrs;
		
	}
	public void show(String x)     //overloading
	{
		super.show();    //Calling super class show() function
		System.out.println("The email address is "+this.e_adrs);
	}
}
 class emailpassword extends emailname      //Multi_level Inheritance
{
	String pswd;
	
	public emailpassword()
	{
		pswd="Enter password";
	}
	public emailpassword(String name,int dd, int mm,int yyyy,String e_adrs,String pswd)
	{
		super(name,dd,mm,yyyy,e_adrs);
		this.pswd=pswd;
	}
	public void show()                 //overriding
	{
		super.show();            //Calling super class show() function
		System.out.println("The email address is :-"+this.e_adrs);
		System.out.println("The password is :-"+this.pswd);
		
	}
	
}

 class NewThread implements Runnable       //Thread process
{
	Thread t;
	public NewThread()
	{
		t=new Thread(this,"thread");
		System.out.println("You will be allowed to access your email in : ");
		t.start();
	}
		
		public void run()   //what that child thread has to do
		{ 
			System.out.println("You can log in to your email in ");
			try
			{

				
				for(int i=5;i>0;i--)
				{
					System.out.println(+i);
					Thread.sleep(1000);
					
				}
				
				
			}
			catch(InterruptedException e)
			{
				System.out.println("Child Thread interrupted.");
			}
}
}

public class project {

	public static void main(String[] args)  throws NewException 
	
	{
		PrintWriter pw=new PrintWriter(System.out,true);
		Scanner sc=new Scanner(System.in);
		inter2 i=new inter();
		i.show();
	
		pw.println("Enter the name of user");
		String name=sc.nextLine();
		pw.println("Enter the date of brith in format dd-mm-yyyy");
		pw.println("Enter the date ");
		
		int dd=sc.nextInt();
		pw.println("Enter the month ");
		int mm=sc.nextInt();
		pw.println("Enter the year ");
		int yyyy=sc.nextInt();
		sc.nextLine();
		
		//pw.println("Enter any random integer value for a");
		//int a=sc.nextInt();
		//e.show();

		pw.println("Enter the email address for user (must end with @gmail.com)");
		String e_adrs=sc.nextLine();
		

		if(e_adrs.endsWith("@gmail.com"))
		{
			pw.println("You have entered correct format for the email");
		}
		
		else
		{
			throw new NewException("Your email is not acceptable");
		}
	
		
		pw.println("Enter a strong password for your email(password of minimum 6 characters) ");
		String pswd=sc.nextLine();
		
		
		
		
		
			if (pswd.length()>=6)
			{
				pw.println("Your password is accepted ");
			}
			else
			{
				throw new NewException("Your password is not accepted");
			}
			
		
		
			
		
		emailpassword e=new emailpassword(name,dd,mm,yyyy,e_adrs,pswd);
		pw.println();
		
		email e2=new email(e);                                       //object passed here
		pw.println("You have entered the flollowing credentials");
		e2.show();
		
		
		pw.println();
		//System.out.println("Simple inverted pattern  printed ");
		for (int k=5; k>=0 ; k--)  
		{  
		  
		for (int j=0; j<=k; j++)  
		{  
	      System.out.print(" * " );  
		}  
		
		System.out.println();  
		}  
		 
		
		new NewThread();   //THREAD called
		sc.nextLine();
		pw.println("Enter your email id :");
		
		
		String s=sc.nextLine();
		pw.println("You have entered email id :"+s);
		
		if(s.equals(e_adrs))               //Checking the present email and the email given at the time of creating account
		{
		   pw.println("Your email id is accepted");	
		}
		else
		{
			throw new NewException("Email incorrect proceed from the very beginning step once again ");
		}
		
		
		pw.println("Enter the password to your email account");
		String x=sc.nextLine();
		
		
		if(x.equals(pswd))                 //Checking the present password and the password given at the time of creating account
		{ 
			pw.println("Your password to your email account is accepted");
		}
		else
		{
			throw new NewException("Password incorrect proceed from the very beginning step once again");
		}
		
		
		pw.println();
		pw.println("You are now entering into your email account");
		
		
		pw.println("Welcome to your email account");
		
		pw.println("Have a nice time using your account !!! ");
		
		
	}

}
