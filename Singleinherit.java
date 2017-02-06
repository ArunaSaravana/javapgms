/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

/**
 *
 * @author Student
 */
class A {

    public void display() {
        System.out.println("Welcome to ALl");
    }
}

public class Singleinherit extends A {

    public void oddev() {
        int n = 20;
        if (n % 2 == 0) {

            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

}
