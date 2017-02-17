package Javaprogram;

public class Trycatch {
	public void display()
	{
		int n1,n2;
		try
		{
			n1=0;
			n2=100;
			int n3=n2/n1;
			System.out.println("Try block message"+n3);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number is not divide by zero  "+e);
		}
	}
}
