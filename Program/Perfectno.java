package Program;

import java.util.Scanner;

public class Perfectno {
	public static void main(String args[])
	{
		int sum=0,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value :");
		n=s.nextInt();
		System.out.println("Factors are:");
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
				System.out.println(i);
			}
		}
		if(sum==n)
			System.out.println(sum + " no is perfect number");
		else
			System.out.println(sum + " no is not a perfect number");
	}
}
