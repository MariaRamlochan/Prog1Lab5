/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * Write a class encapsulating the concept of a circle, assuming a circle has
 * the following attributes: a Point representing the center of the circle, and
 * an integer, the radius of the circle. Include a constructor, the accessors
 * and mutators, and methods toString and equals. Also include methods returning
 * the perimeter (2 * π * radius) and area (π * radius ) of the circle. Write a
 * client class to test all the methods in your class.
 * Textbook Question 70.
 * 
 * @author Maria Ramlochan
 */
public class CircleClient {
    
   public static void main(String[] args) {
    System.out.println("\n***** Circle *****");
        
    Circle c1 = new Circle(0, 7);
    Circle c2 = new Circle(7, 4);
    Circle c3 = new Circle(3, 9);
    Circle c4 = new Circle(5, 12);
    
    
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    
   }  
}
