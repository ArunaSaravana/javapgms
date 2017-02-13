package Javaprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public void display()
	{
		String str="akdjfkldjfweisfdksfdsruiwoeldfhjsjkdal";
		Pattern p=Pattern.compile("j");
		Matcher m=p.matcher(str);
		if(m.find())
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("NotFound");
		}
		Pattern p1=Pattern.compile("ru");
		Matcher m1=p.matcher(str);
					while(m1.find())
					{
						System.out.println(m1.start());
						System.out.println(m1.end());
						System.out.println(m1.group());
						
						
					}
		String s1="Wel536rfg3245674fhffgfcome",s2="345346",s3="    ";
		String x=".*";
		System.out.println(s1.matches(x));

		System.out.println(s3.matches(x));
		String a="asdflkjhasdflkjhiewriewrtu";
		System.out.println(a.replaceAll("\\D",""));
		String b="I Am Lives in CHennai";
		System.out.println(b.split("\\s"));
		
				
		
			
	}
}
