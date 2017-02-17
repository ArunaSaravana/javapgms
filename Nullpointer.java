package Javaprogram;

public class Nullpointer {
public void display()
{
	try{
		String str=null;
		System.out.println (str.length());
	}catch(NullPointerException e){
		System.out.println("NullPointerException..");
	}
}
}

