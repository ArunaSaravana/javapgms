/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiles;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Student
 */
public class Samplehashmap {
    public void display()
    {
        Map<String,String> m=new HashMap<>();
        m.put("A","1");
        m.put("B","2");
        m.put("C","3");
        m.put("D","4");
        m.put("E","5");
        System.out.print(m);
        System.out.println(m.containsKey("C"));
    System.out.println(m.containsKey("J"));
    System.out.println(m.entrySet());
    System.out.println(m.get("B"));
    System.out.println(m.getOrDefault("C", "F"));
    System.out.println(m.remove("D"));
    
   System.out.println(m);
    
    System.out.println(m.replace("E", "5","Z"));
   
   System.out.println(m);

       
    }
}
