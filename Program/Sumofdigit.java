package Program;

import java.util.Scanner;

public class Sumofdigit {

	public static void main(String[] args) {
		int n,rem,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no: ");
		n=s.nextInt();
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		System.out.println(sum);
	}

}
