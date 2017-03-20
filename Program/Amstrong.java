package Program;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) 
	{
		int n,rem,sum=0,org;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		n=s.nextInt();
		org=n;
		while(org!=0)
		{
			rem=org%10;
			sum=sum+rem*rem*rem;
			org=org/10;
			
		}
		if(sum==n)
			System.out.println("Amstrong");
		else
			System.out.println("Not amstrong");
	}

}
