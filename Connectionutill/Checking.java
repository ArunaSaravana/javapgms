package Connectionutill;

import java.util.Scanner;

public class Checking {

	public static void main(String[] args) 
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two numbers :");
		a=s.nextInt();
		b=s.nextInt();
		
		
			if(a%b==0)
			{
				System.out.println("No is divisible");
				
			}
			else
			{
				System.out.println("No is not divisible");
			}
		
		//System.out.println("Check the no ");
		
	}

}
