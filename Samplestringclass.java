

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Samplestringclass {
    public void str()
    {
    String s1="WelcomeTo";
    String s2="Tami    lnadu";
    String s3=s1+s2;
    String s4="WelcomeTo";
    System.out.println(s3);
    System.out.println(s1.charAt(4));  
    System.out.println(s1.codePointAt(3));
    System.out.println(s2.codePointBefore(6));
    System.out.println(s2.codePointCount(2,7));
    System.out.println(s1.compareTo(s2));
    System.out.println(s2.concat("IsSuper"));
    System.out.println(s2.trim().length());
    System.out.println(s1.toLowerCase());
    System.out.println(s2.toUpperCase());
    System.out.println(s2.toString());
    System.out.println(s1.substring(2,8));
    System.out.println(s2.subSequence(2, 8));
   // System.out.println(s1.split(s2));
    System.out.println(s1.equals(s2));
    System.out.println(s1==s4);
    }     
}
