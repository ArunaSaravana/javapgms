/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiles;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class Samplearraylist {
    public void display()
    {
        ArrayList<Integer> id=new ArrayList<Integer>();
        id.add(10);
        id.add(20);
        id.add(30);
        id.add(40);
        id.add(50);
        System.out.println("Array Elements");
        for (Integer i : id) {
            System.out.println(i);
        }       
        boolean a=id.contains(95);
        System.out.println(a);
        boolean b=id.contains(20);
        System.out.println(b);
        id.add(2,90);
        System.out.println("Array Elements");
        for (Integer j : id) {
            System.out.println(j);
        }
        int c=id.get(3);
        System.out.println(c);
        int d=id.hashCode();
        System.out.println(d);
        int e=id.indexOf(0);
        System.out.println(e);
        int f=id.lastIndexOf(4);
        System.out.println(f);
        int g=id.remove(3);
        System.out.println(g);
        boolean h=id.isEmpty();
        System.out.println(h);
        
        
     }
 }
