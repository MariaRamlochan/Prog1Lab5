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
 * @author Maria Ramlochan
 */
public class Television {
    //Variables
    private String myBrand; 
    private double myPrice;
    
    //Constructor
    public Television (String brand, double price) {
       this.myBrand = brand;
       this.myPrice = price;
    }
    
    //getters/accessors
    public String getBrand(){ return myBrand; }
    public double getPrice(){ return myPrice; }


    //Setters/mutators
    public void setBrand(String brand){ myBrand = brand; }
    public void setPrice(double price){ myPrice = price; }

    public boolean equals(Television other) {
        return myBrand.equals(other.myBrand);
    }
    
    @Override
    public String toString() {
        return "\nBrand: " + myBrand + "\nPrice: " + myPrice 
                + "\n***************"; 
    }
    
}
