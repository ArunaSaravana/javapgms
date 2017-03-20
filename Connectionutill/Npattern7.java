package Connectionutill;

import java.util.Scanner;

public class Npattern7 {

	public static void main(String[] args) {
		int n,i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rows ");
		n=s.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}

}
