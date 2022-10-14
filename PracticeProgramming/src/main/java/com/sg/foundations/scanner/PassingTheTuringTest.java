/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PassingTheTuringTest {
    public static void main(String[] args) {
    
    String userName, color, favoriteFood;
    int userNumber;
    
    Scanner userInput = new Scanner(System.in);
    
        System.out.println("Hello there");
        System.out.println("What's your name");
        
        userName = userInput.nextLine();
        
        System.out.println("Hi, "  + " " + userName + " " + "I am Lidija");
        
        System.out.println("What's your favorite color");
        
        color = userInput.nextLine();
        
        System.out.println("Huh," + " " + color + "? Mine is yellow.");
        
        System.out.println("I realy like oranges. What's your favorite fruit" + " " + userName);
        
        favoriteFood = userInput.nextLine();
        
        System.out.println("Really?" + " "  + favoriteFood);
        
        System.out.println("What's your favorite number");
        
         userNumber = Integer.parseInt(userInput.nextLine());
         
         System.out.println("Great" + " " + userNumber);
        
    
    
    }
}
