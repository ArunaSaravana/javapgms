package Connectionutill;

import java.util.Scanner;



public class Npattern10 {

	public static void main(String[] args) {
		int i,j,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rows");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
