package JavaTaskprograms;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Taskprogram1 {
    public void task1()
    {
        float a;
        System.out.println("Enter the value");
        Scanner s=new Scanner(System.in);
        a=s.nextFloat();
        if(a==0)
        {
            System.out.println("Given no is ZERO");
            
        }
        else if(a>0)
        {
            System.out.println("Given no is POSITIVE");
        }
        else 
        {
            System.out.println("Given no is Negative");
        }
    
    if(a<1)
    {
        System.out.println("Given no is SMALL");
    }
    if(a>1000000)
    {
        System.out.println("Given no is LARGE");
    }
    }
}
