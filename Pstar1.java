package Connectionutill;

import java.util.Scanner;

public class Pstar1 {

	public static void main(String[] args) {
		int i,j,n,u=4;
		Scanner s=new Scanner(System.in);
		System.out.println("ENter the rows");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=u;j++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
			{
				System.out.print("*  ");
			}
			System.out.println();
			u--;
		}

	}

}
