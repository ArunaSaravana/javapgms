package Connectionutill;

import java.util.Scanner;

public class Npattern4 {

	public static void main(String[] args) {
		int i,j,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}

	}

}
