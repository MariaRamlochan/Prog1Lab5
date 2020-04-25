/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 * Write a class encapsulating the concept of a team (for example, “Orioles”), 
 * assuming a team has only one attribute: the team name. Include a constructor,
 * the accessor and mutator, and methods toString and equals. Write a client 
 * class to test all the methods in your class.
 * 
 * Textbook Question 55
 * 
 * @author Maria Ramlochan
 */
public class TeamClient {
    
    public static void main(String[] args) {
    System.out.println("\n**** TEAM SET ****");
        
    Team team = new Team("Orioles");
    Team team2 = new Team("Dragons");
    Team team3 = new Team("Eagles");
    Team team4 = new Team("Java");
    

    System.out.println(team);
    System.out.println(team2);
    System.out.println(team3);
    System.out.println(team4);
    }
    
}