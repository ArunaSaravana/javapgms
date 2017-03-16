package Program;

import java.util.Scanner;

public class Delwor {

	public static void main(String[] args) {
		String sor,swor,str;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sentence");
		str=s.nextLine();
		System.out.println("Enter the delete word");
		swor=s.nextLine();
		
		str=str.replaceAll(swor,"");
		System.out.println(str);
	}

}
