/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiles;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Student
 */
public class Sampletreemap {

    
    public void display()
    {
    Map<Integer,String> p=new TreeMap<>();
    p.put(101,"A");
    p.put(102,"B");
    p.put(103,"C");
    p.put(104,"D");
    System.out.println("Map Elements");
    for(Map.Entry m:p.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
    System.out.println(p.containsKey(103));
    System.out.println(p.containsKey(108));
    System.out.println(p.entrySet());
    System.out.println(p.get(101));
    System.out.println(p.getOrDefault(106, "F"));
    System.out.println(p.remove(102));
    for(Map.Entry m:p.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());
    }
    System.out.println(p.replace(104, "D","E"));
    for(Map.Entry m:p.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());
}
}
}