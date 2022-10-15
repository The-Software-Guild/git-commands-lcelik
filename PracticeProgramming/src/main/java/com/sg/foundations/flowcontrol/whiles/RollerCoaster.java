/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class RollerCoaster {
    
     public static void main(String[] args) {
     
         Scanner userInput = new Scanner(System.in);
         
         System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");
        
        String keepRiding = "yes";
        
        //counting how many times the game has been played
        int loopsLooped = 0;
        
        while(keepRiding.equals("yes")) {
            System.out.println("WheeeEEeeeEEE...!!");
            System.out.println("Whant to keep going? (yes/no) :");
            
            keepRiding = userInput.nextLine();
            loopsLooped++;
        }
         System.out.println("Wow, that was fun");
         System.out.println("We looped that loop " + loopsLooped + " " + "times");
     }
    
}


