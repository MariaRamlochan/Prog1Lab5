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
public class Team {
    //Variables
    private String myTeam;
    
    //Constructor
    public Team (String team) {
       this.myTeam = team;
    }
    //public Team (String team) {
     //   this.myTeam = team;
    //}
    
    //getters/accessors
    public String getBrand(){ return myTeam; }

    //Setters/mutators
    public void setTeam(String team){ myTeam = team; }

    public boolean equals(Team other) {
        return myTeam.equals(other.myTeam);
    }
    
    @Override
    public String toString() {
        return "\nTeam: " + myTeam + "\n***************"; 
    }
    
}