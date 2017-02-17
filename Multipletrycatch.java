package Javaprogram;

public class Multipletrycatch {
	public void display()
	{
		int a[]={10,20,30,40,50};
		try
		{
			a[3]=90/0;
			System.out.println("It is in try block ");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception " +e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
