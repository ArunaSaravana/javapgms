/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiles;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Student
 */
public class Sampletreeset {
    public void display()
    {
        Set<String> s=new TreeSet<>();
        s.add("Hello");
        s.add("Hai");
        s.add("Welcome");
        s.add("Good");
        s.add("Goodbye");
        System.out.println("Set of Elements");
        for (String i : s) {
            System.out.println(i);
        }
        boolean a=s.contains("ABC");
        System.out.println(a);
        boolean b=s.contains("Hello");
        System.out.println(b);
        boolean c=s.equals("Welcome");
        System.out.println(c);
        System.out.println(s.hashCode());
        System.out.println(s.isEmpty());
        System.out.println(s.iterator());
        System.out.println(s.remove("Hai"));
        for (String j : s) {
            System.out.println(j);
        }
        System.out.println(s.size());
        
    }
}
