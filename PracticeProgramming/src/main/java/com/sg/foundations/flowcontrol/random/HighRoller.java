/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class HighRoller {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        Random diceRoller = new Random();

        int rollResult = diceRoller.nextInt(6) + 1;
        
        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);
        
        
        

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        }
        
        
        System.out.println("What is the number of sides a single die has?");
        int answer = myScanner.nextInt();
        int sidesOfDie = diceRoller.nextInt(answer) + 1;
        
         System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + sidesOfDie);
        
        if (sidesOfDie == 1) {
            System.out.println("You rolled a critical failure!");
        } else if (sidesOfDie == answer) {
            System.out.println("You rolled a critical, nice job!");
        }

        
    }
}

