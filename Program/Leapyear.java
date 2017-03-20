package Program;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) 
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year :");
		n=s.nextInt();
		if(n%4==0)
		{
			System.out.println(n + " is a leap year");
			
		}
		else
		{
			System.out.println(n + " is not a leap year");
		}

	}

}
