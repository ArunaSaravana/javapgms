/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiles;

import java.util.HashSet;

/**
 *
 * @author Student
 */
public class Samplehashset {
    public void display()
    {
        HashSet h=new HashSet();
        h.add(5);
        h.add(10);
        h.add(15);
        h.add(20);
        h.add(25);
        System.out.println("HashSet Elements");
        for (Object i : h) {
            System.out.println(i);
        }
        boolean a=h.contains(32);
        System.out.println(a);
        boolean b=h.contains(10);
        System.out.println(b);
        boolean c=h.isEmpty();
           System.out.println(c);
           
                
    }
}
