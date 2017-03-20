package Program;

import java.util.Scanner;

public class Evenodd {
	public static void main(String args[])
	{
		int n;
		char ch;
		Scanner s=new Scanner(System.in);
		do
		{
		System.out.println("Enter the number :");
		n=s.nextInt();
		if(n%2==0)
		{
			System.out.println(n+ "is even");
		}
		else
		{
			System.out.println(n+ "is odd");
		}
		System.out.println("Do u want to continue[Y/N]: ");
		ch=s.next().charAt(0);
		}
		while(ch=='Y' || ch=='y');
		
	}
}
