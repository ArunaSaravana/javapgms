package Program;

import java.util.Scanner;

public class Vowercons {
	public static void main(String args[])
	{
		char ch,con;
		Scanner s=new Scanner(System.in);
		do
		{
		System.out.println("Enter the vowel r consonant");
		ch=s.next().charAt(0);
		if(ch=='a'|| ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		{
			System.out.println(ch +"is a vowel");
		}
		else
		{
			System.out.println(ch +"is a consonant");
		}
		System.out.println("do u want to continue[Y/N] :");
		con=s.next().charAt(0);
		}while(con=='Y' || con=='y');
	}
		
}
