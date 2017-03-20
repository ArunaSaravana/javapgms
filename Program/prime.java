package Program;

import java.util.Scanner;

public class prime {
	public static void main(String args[])
	{
		int a,i,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no :");
		a=s.nextInt();
		int n=a/2;
		for(i=2;i<=n;i++)
		{
			if(a%i==0)
			{
				System.out.println("Not prime");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("No is prime");
		}
	}
}
