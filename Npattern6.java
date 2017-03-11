package Connectionutill;

import java.util.Scanner;

public class Npattern6 {

	public static void main(String[] args) {
		int i,j,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		n=s.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}

}
