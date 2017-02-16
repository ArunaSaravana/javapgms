/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiles;
 import java.io.*;
/**
 *
 * @author Student
 */
public class Shutdown {
   


    public static void main(String args[]) throws IOException
    {
        Runtime runtime = Runtime.getRuntime();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
        System.out.print("Enter No. of Seconds after which You want your Computer to Shutdown :");
        long a=Long.parseLong(br.readLine());
		
        Process proc = runtime.exec("shutdown -s -t " +a);
		
        System.exit(0);
    }
}

