package Connectionutill;

import java.util.Scanner;

public class Npattern8 {

	public static void main(String[] args) {
		int n,i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rows");
		n=s.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(i=2;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
