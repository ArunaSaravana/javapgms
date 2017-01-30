/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Studentgrade {

   public void stud()
   {
       String name,grade;
       System.out.println("Enter your name:");
       System.out.println("Enter Ur grade");
       Scanner s=new Scanner(System.in);
       name=s.nextLine();
       grade=s.nextLine();
       if(grade.equals("a"))
       {
           System.out.println("U r Excellent");
       }
       else if(grade.equals("b"))
     //  else if("b".equals(grade))
               {
                   System.out.println("U r Good");
               }
       else if(grade.equals("c"))
       {
           System.out.println("U r Bad");
       }
       else
       {
           System.out.println("Invalid grade");
       }
   }
    
}
