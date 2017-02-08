package Javaprogram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int factorial=1,fact,v1;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		fact=s.nextInt();
		for(v1=1;v1<=fact;v1++)
		{
			factorial=factorial*v1;
		}
		System.out.println("The factorial of "   +fact+" is "+factorial);

	}

}
