package Connectionutill;

import java.util.Scanner;

public class Npattern5 {
	public static void main(String args[])
	{
		int i,j,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no :");
		n=s.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
