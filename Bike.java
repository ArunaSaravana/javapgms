package Javaprogram;

import java.util.Scanner;
 class Bike {
	
	String a[]={"1.Yamaha","2.Pulsar","3.Scooty"};
	public void display()
	{
		System.out.println("Bikes Are Available In The ShowRoom");
		for (String n : a) {
			System.out.println(n);
			
		}
		
		if(a[1]=="2.Pulsar")
		{
			String cmpy="HeroHonda";
			int year=2000;
			int price=72000;
			int tax=3245,wtax;
			System.out.println("Company Name:" +cmpy);
			System.out.println("Launched Year: "+year);
			System.out.println("Cost of price without tax: "+price);
			wtax=tax+price;
			System.out.println("Withtax the price of bike is "+wtax);
		}
	}

}
class Hero extends Bike
{
	
	int mg,cc;
	public void dis()
	{
		System.out.println("Enter the milage and cc");
		Scanner s=new Scanner(System.in);
		mg=s.nextInt();
		cc=s.nextInt();
		
				
	if(mg>50 && cc<10)
	{
		System.out.println("Herohonda company is splitted into Hero");
		System.out.println("Hero company is launching Scooty bikes");
	}
	else
	{
		System.out.println("It is honda company");
		System.out.println("It launching only Yamaha related bike");
	}
	}	
}
class Honda extends Hero
{
	public void dis1()
	{
		System.out.println("The honda company Launching only Tvs related bikes");
	}
}