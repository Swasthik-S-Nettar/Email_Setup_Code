//this is named as email.java and present in javaproject2 package

package javaproject2;

 public class email        //Super class
{
	String name;
	int dd,mm,yyyy;
	
	
	
	public email()    //Default constructor
	{
		name="Unkonown";
		dd=00;
		mm=00;
		yyyy=0000;
		
	}
	
	public email(String name,int dd, int mm,int yyyy)      //parameterized constructor
	{
		this.name=name;
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;
	}
	public email(email ob)                       //constructor with object
	{
		this.name=ob.name;
		this.dd=ob.dd;
		this.mm=ob.mm;
		this.yyyy=ob.yyyy;
		
	}
	public void show()               //Super class show()     //overriding
	{
		System.out.println("The name of the user is :"  +this.name);
		System.out.println("The date of birth for the user is : "+this.dd + "-" + this.mm + "-" + this.yyyy);
		
	}
}