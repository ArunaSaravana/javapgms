package Program;

import java.util.Scanner;

public class Countoddeven {

	public static void main(String[] args) 
	{
		int n[]=new int[10];
		int even=0,odd=0,n1;
		Scanner s=new Scanner(System.in);
			System.out.println("ENter the element :");
			n1=s.nextInt();
			System.out.println("Enter the value :");
			for(int i=0;i<10;i++)
			{
			n[i]=s.nextInt();
			}
		for(int i=0;i<10;i++)
		{
			if(n[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("Total even numbers" +even);
		System.out.println("Total odd numbers" +odd);
	}

}
