/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testoddeven;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Toddeven {
    public void odev()
    {
         int a,b;
        System.out.println("Enter a value:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        if(a%2==0)
        {
            System.out.println("No. is Even");
        }
        else
        {
            System.out.println("No. is odd");
        // TODO code application logic here
        }
    }
}
