/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 * Write a class encapsulating the concept of a book. The attributes of a book
 * are title, author, ISBN and year of publishing. The class has a static
 * attribute publisher initialized as “Vanier”, and an amountOfBooks, which is
 * initially zero. Include a constructor, accessors and mutators, and the 
 * methods toString and equals. Every time a new object is instantiated, the 
 * class variable amountOfBooks is incremented by 1. When a book object is 
 * printed, it should output all its attributes in a nice way. Two books are
 * considered equal if they have the same ISBN. Make sure you have at least one
 * method that uses the object reference this.
 * 
 * @author Maria Ramlochan
 */
public class Book {
    
    //Variables
    private String aTitle, aAuthor, aPublisher, aIsbn;
    private int  aYear, aAmountOfBooks;

    //Constructor
    public Book (String title, String author, int year,
            String isbn, int amountOfBooks) {
        
        this.aTitle = title;
        this.aAuthor = author;
        this.aYear = year;
        this.aPublisher = "vanier";
        this.aIsbn = isbn;
        this.aAmountOfBooks = 0;
    }
    public Book (String title, String author, int year, String publisher,
            String isbn, int amountOfBooks) {
        
        this.aTitle = title;
        this.aAuthor = author;
        this.aYear = year;
        this.aPublisher = publisher;
        this.aIsbn = isbn;
        this.aAmountOfBooks = amountOfBooks;
    }
    
    //getters/accessors
    public String getTitle(){ return aTitle; }
    public String getAuthor(){ return aAuthor; }
    public int getYear(){ return aYear; }
    public String getPublisher() { return aPublisher; }
    public String getIsbn(){ return aIsbn; }
    public int getAmountOfBooks(){ return aAmountOfBooks; }
    
    
    //Setters/mutators
    public void setTitle(String title){ aTitle = title; }
    public void setAuthor(String author){ aAuthor = author; }
    public void setYear(int year){ aYear = year; }
    public void setPublisher(String publisher) { aPublisher = publisher; }
    public void setIsbn(String isbn){ aIsbn = isbn; }
    public void setAmountOfBooks(int amountOfBooks){ aAmountOfBooks = 
            amountOfBooks; }

    @Override
    public String toString() {
        return "\nTitle: " + aTitle + "\nAuthor: " + aAuthor + "\nYear: " +aYear 
                + "\nPublisher: " + aPublisher  + "\nISBN: " + aIsbn
                + "\nAmount of Books: " + aAmountOfBooks
                + "\n\n***** BOOKS *****";
    }
    
    public boolean equals(Book other) {
        return aTitle.equals(other.aTitle) && aAuthor.equals(other.aAuthor);
    }
}
