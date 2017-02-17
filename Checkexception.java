package Javaprogram;

import java.io.FileInputStream;

public class Checkexception {
	public void display()
	{
		try
		{
		FileInputStream f=new FileInputStream("C:/file.doc");
		f.read();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
