package Connectionutill;

import java.util.Scanner;

public class Npattern3 {

	public static void main(String[] args) {
		int i,j,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rows :");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(i=n-1;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
