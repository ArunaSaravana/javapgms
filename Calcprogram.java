/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calcprogram;


import java.util.Scanner;
import testcalcprogram.Testcalcprogram;
public class Calcprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a and b value:");
        Testcalcprogram tcp=new Testcalcprogram();
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=tcp.add(a,b);
        int d=tcp.sub(a,b);
        int e=tcp.mul(a,b);
        int f=tcp.div(a,b);
        int g=tcp.mod(a,b);
        System.out.println("The sum is:"+c);
        System.out.println("The sum is:"+d);
        System.out.println("The sum is:"+e);
        System.out.println("The sum is:"+f);
        System.out.println("The sum is:"+g);
        
        
        // TODO code application logic here
    }
    
}
