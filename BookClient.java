/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 * Write a client class to test all
 * the methods in your Book class. Also test if two book objects share the same
 * values for publisher and amountOfBooks.
 * 
 * @author maria
 */
public class BookClient {
    
    public static void main(String[] args) {
    System.out.println("\n***** BOOKS *****");

    Book book1 = new Book("The Stand", "Stephen King", 1978, "ABC", 
            "9780340951446", 3);
    Book book2 = new Book("Princess", "Maria Ramlochan", 2020, "75748838382", 8);
    Book book3 = new Book("JAVA ILLUMANATED", "Julie Anderson",2012, "Learning",
            "9781284140996", 5 );

    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book3);


    }
    
}
