/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiles;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Lctouc {
    public static void main(String args[])
    {
        char ch;
        int temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the character in lower case");
        ch=s.next().charAt(0);
        temp=(int) ch;
        temp=temp-32; // temp=temp+32; Change into lower case
        ch= (char) temp;
        System.out.println("Character changed to Upper case :" +ch);
        
     }
}
