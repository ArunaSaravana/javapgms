/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiles;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Student
 */
public class Regex {
    public void display()
    {
        String t = "Self Help Is The Best Help";
        Pattern pattern = Pattern.compile("Best");
        Matcher matcher = pattern.matcher(t);
        if (matcher.find()) 
        System.out.println("Found ");
        else
        System.out.println("not found");
        int count = 0;
        Pattern p = Pattern.compile("kj");	
        Matcher m = p.matcher("asdflkjasdflkjwertoiuwertoiu");
        while (m.find()) {
        count++;
        System.out.println(m.start());
        System.out.println(m.end());
        System.out.println(m.group());
        }
        System.out.println("the no of occurrences : " + count);
        String x = ".*";
        String s1 = "welcome to all", s2 = "a1s          2d3f4g5", s3 = "   ";
	System.out.println(s1.matches(x));
	System.out.println(s3.matches(x));
	System.out.println();
        // + 1 or more of previous expression.
	String y = ".+";
        String a="hi",b="hello",c="  ";
	System.out.println(b.matches(y));
	System.out.println(c.matches(y));
	System.out.println();
// to match the first letter to the target string
	Pattern p1 = Pattern.compile("s");
	Matcher m1 = pattern.matcher(s3);
	if (m1.find())
                System.out.println("found");
	else
        	System.out.println("not found");
// \d Matches any decimal digit.
        String z = "\\d";
	System.out.println(s1.matches(z));
	System.out.println(s2.matches(z));
        //(...)	Logical grouping of part of an expression.
//  |Alternation.

        String group="(red|yellow|green)";
        System.out.println("red".matches(group));
        System.out.println("white".matches(group));
	String spellCheck="gr(a|e)y";
        System.out.println("gray".matches(spellCheck));
        System.out.println("grey".matches(spellCheck));
        System.out.println("rgeu".matches(spellCheck));
        String l="gra(y|e)?s";
        System.out.println("gas".matches(l));
        System.out.println("grays".matches(l));
// ? 0 or 1 of previous expression; 

        String word = "balo(o)n?";
        System.out.println("balon".matches(word));
        System.out.println("baloon".matches(word));
        String om = "apple Microsoft IBM";
	String[] s = om.split(" ");
	for (String str : s) {
		System.out.println(str);

//\\s - matches single white space
//\\s+ - matches multiple white space

        om = "apple     	 Microsoft IBM";
        s = om.split("\\s+");
        for (String i : s) {
               System.out.println(i); 
        }
        om = "sdafdsjhweoi.fgsd.";
        s = om.split("\\.");
        for (String j : s) {
        System.out.println(j);}
        om = "assd435hgj89623ghd";
        System.out.println(om.replaceAll("\\D", ""));
        System.out.println(om.replaceAll("\\s",""));
        System.out.println(om.replaceAll("\\w",""));
        System.out.println(om.replaceAll("\\W",""));
        om = "uyiyui435gj,sdf";
        System.out.println(om.replaceAll("[^0-9]+", ""));
        om = "ASDituy87358.kjhLKJH4534";
        System.out.println(om.replaceAll("[^a-zA-Z]+", ""));
        om = "fgdfhgAQER#58649K";
        System.out.println(om.replaceAll("[0-9$]+", ""));
     }
  }
}

