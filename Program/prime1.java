package Program;

import java.util.Scanner;

public class prime1 {

	public static void main(String[] args) 
	{
		int a,a1,i,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the starting no and ending no :");
		a=s.nextInt();
		a1=s.nextInt();
		for(i=a;i<=a1;i++)
		{
			flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.print(i+ " ");
			}
		}		
	}
}


