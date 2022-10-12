/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class GuessMe {
    public static void main(String[] args) {
        
    int myChoice = 20;
    int userInput;
    
    //user input as the answer
    Scanner myScanner = new Scanner(System.in);
    
    //asking the user to pick a number
    System.out.println("I've chosen a number. Try to guess it...go on");
    
    
    //retrieve the user's input:
    userInput = myScanner.nextInt();
        
   
   
    
    if (userInput == myChoice) {
        System.out.println("Congrats, that's the correct answer");
    } else if(userInput < myChoice){
        System.out.println("Ha, " + userInput + "? Nice try, but your guess is too low. l've chosen 20");
    } else {
        System.out.println("Ha, " + userInput + "? Nice try, but your guess is too high. l've chosen 20");
    }
    

}
}
