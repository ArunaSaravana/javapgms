package Javaprogram;

public class Numberformat 
{	
	public void display()
	{   
	     try
	      {
	    	  int num=Integer.parseInt ("XYZ") ;
	    	  System.out.println(num);
	      }
	      catch(NumberFormatException e)
	      {
	    	  System.out.println("Number format exception occurred");
	      }
	   }
	}

