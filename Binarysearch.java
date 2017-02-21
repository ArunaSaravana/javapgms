package Javaprogram;

import java.util.Scanner;

public class Binarysearch {
	public void display()
	{
		int n,i,first,last,middle,search;
		int a[]=new int[20];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the No. of elemens u need");
		n=s.nextInt();
		System.out.println("Enter the nos. one by one");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the search element");
		search=s.nextInt();
		first=0;
		last=n-1;
		middle=(first+last)/2;
		while(first<=last)
		{
			if(a[middle]<search)
			{
				first=middle+1;
			}
			else if(a[middle]==search)
			{
				System.out.println(search+ "  Found "+middle);
				break;
			}
			else
			{
				last=middle-1;
			}
			middle=(first+last)/2;
		}
		if(first>last)
		{
			System.out.println("Not found");
		}
	}
}
