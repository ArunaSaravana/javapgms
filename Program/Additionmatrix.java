package Program;

import java.util.Scanner;

public class Additionmatrix {

	public static void main(String[] args) 
	{
		int r,c,i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row and column of the matrix :");
		r=s.nextInt();
		c=s.nextInt();
		int first[][]=new int[r][c];
		int second[][]=new int[r][c];
		int sum[][]=new int[r][c];
		
		System.out.println("Enter the elements of first matrix");
		for(i=0;i<r;i++)
		
			for(j=0;j<c;j++)
			
				first[i][j]=s.nextInt();
			
		
		System.out.println("Enter the elements of second matrix");
		for(i=0;i<r;i++)
		
			for(j=0;j<c;j++)
			
				second[i][j]=s.nextInt();
			
		
		System.out.println("Addition matrix");
		for(i=0;i<r;i++)
		
			for(j=0;j<c;j++)
			
				sum[i][j]=first[i][j]+second[i][j];
			
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			
				System.out.print(sum[i][j]);
			System.out.println();
		}	
	}

}
