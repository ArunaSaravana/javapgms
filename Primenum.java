package Javaprogram;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		int v1,i,flag=0;
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		v1=s.nextInt();
		for( i=2;i<=v1/2;i++)
		{
			if(v1%i==0)
			{
				flag=0;
				break;
			}
			if(flag==1)
				System.out.println("Given number is not a prime number");
			else
				System.out.println("Given number is prime number");
		}

	}

}
