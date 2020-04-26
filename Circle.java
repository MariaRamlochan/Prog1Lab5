/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
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
public class Circle {
    
    private int myPoint, myRadius;
    private double perimeter, area;
    
    public Circle (int point, int radius){
        myPoint = point;
        myRadius = radius;
        perimeter = (Math.PI * myRadius * 2);
        area = Math.PI * myRadius;
    }
    
    //getters/accessors
    public int getPoint(){ return myPoint; }
    public int getRadius(){ return myRadius; }
    public double getPerimeter() { return perimeter; }
    public double getArea() { return area; }
    
    //setters/mutators
    public void setPoint(int point) { myPoint = point; }
    public void setRadius (int radius) { myRadius = radius; }
    
   // public boolean equals(Circle other) {
   //return 
   //}

    
    @Override
    public String toString() {
        return "\nCenter point: " + myPoint + "\nRadius: " + myRadius 
                + "\nPerimeter: " + Math.round(perimeter) + "\nArea: " 
                + Math.round(area) + "\n***************"; 
    }
    
}