/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 * Write a class encapsulating the concept of a television set, assuming a 
 * television set has the following attributes: a brand and a price. Include a 
 * constructor, the accessors and mutators, and methods toString and equals. 
 * Write a client class to test all the methods in your class.
 * 
 * Textbook Question 56
 * 
 * @author maria
 */
public class TelevisionClient {
    
    public static void main(String[] args) {
    System.out.println("\n**** TELEVISION SET ****");
        
    Television tv1 = new Television("SamSung", 1259.99);
    Television tv2 = new Television("Sony", 1299.99);
    Television tv3 = new Television("Panasonic", 1489.99);
    Television tv4 = new Television("Toshiba", 1579.99);
    
    

    System.out.println(tv1);
    System.out.println(tv2);
    System.out.println(tv3);
    System.out.println(tv4);
    }
    
}