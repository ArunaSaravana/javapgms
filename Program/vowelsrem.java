package Program;

import java.util.Scanner;

public class vowelsrem {
	public static void main(String args[])
	{
		String sor,sne;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the original string");
		sor=s.nextLine();
		System.out.println("Remove vowels ["+sor+"] ");
		sne=sor.replaceAll("[aeiouAEIOU]","");
		System.out.println(sne);
		
				
		
	}

}
