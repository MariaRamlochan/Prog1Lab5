/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.io.*;
import java.util.*;
/**
 * Program that reads a file containing a list of names and scores. 
 * The program should identify and output the names with highest
 * and lowest score, the total amount of grades processed, and the average
 * score of all processed.
 * 
 * @author Maria Ramlochan
 */
public class FileReader {
    /**
    * Main method
    * @param args the command line arguments
    * @throws FileNotFoundException
    */   
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("\n**** FILE READER ****");
        //Variables
        double grades, min = 100, max = 0, sum =0;
        int counter = 0;
        String file;
        File inFile = new File("C:\\Users\\maria\\OneDrive\\Desktop\\SchoolGrades.txt");
        Scanner scFile = new Scanner(inFile);
        
        while (scFile.hasNext()) {
            file = scFile.next();
            grades = scFile.nextDouble();
            counter++;
            System.out.println("Line# " + counter + ": " + file + " " + grades);
         

            //Getting the highest, lowest and average grades.
            if (grades > max) {
                max = grades;
            }
            if (grades < min) {
                min = grades;
            }
            sum += grades;
        }
           
        System.out.println("\nTotal number of grades processed: " + counter);
        System.out.println("\nThe person with the highest grade is: " + max);
        System.out.println("\nThe lowest grade is: " + min);
        System.out.printf("\nThe average score is: " + "%.2f\n",sum/counter);
    }
}