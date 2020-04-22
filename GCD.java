/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.util.*;
/**
 * Program to compute the greatest common divisor (GCD) of two integers. 
 * 
 * @author Maria Ramlochan
 */
public class GCD {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n**** GREATEST COMMON DIVIDOR ****");
        //Variables
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        System.out.println("Input a FIRST integer number: ");
        //First safe input
        while (!sc.hasNextInt()) {
               System.out.println("\nSorry this is NOT a valid integer number");
               sc.next(); //clear the invalid input before prompting again
               System.out.println("Please input a FIRST integer number: ");
        }
        num1 = sc.nextInt();
        System.out.println("You've inputted: " + num1 + " as a FIRST number");
        
        
        System.out.println("\nInput a SECOND integer number: ");
        //Second safe input
        while (!sc2.hasNextInt()) {
               System.out.println("\nSorry this is NOT a valid integer number");
               sc2.next(); //clear the invalid input before prompting again
               System.out.println("Please input a SECOND integer number: ");
        }
        num2 = sc2.nextInt();
        System.out.println("You've inputted: " + num2 + " as a SECOND number");
        
        
        System.out.println("\nGreatest Common Divider of " + num1 + " and "
                + num2 + " is: " + gcd(num1, num2));
    }
    
    private static int gcd (int num1, int num2) {
        if (num2 == 0) 
        return num1; 
       return gcd(num2, num1 % num2); //used modulo operator in Euclid algorithm. 
    } 
}