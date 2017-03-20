package Program;

import java.util.Scanner;

public class Npalin {
	public static void main(String args[])
	{
		int n,rem,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no :");
		n=s.nextInt();
		int org=n;
		while(n!=0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
			
		}
		if(sum==org)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}
}
