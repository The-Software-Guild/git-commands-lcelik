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
public class GuessMeMore {
    public static void main(String[] args) {
        
        Random randomiser = new Random();
        Scanner myScanner = new Scanner(System.in);
        
        int myGuess = randomiser.nextInt(200) - 99;
        
        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it");
        
        int userGuess = myScanner.nextInt();
        
        System.out.println("Your guess is " + userGuess);
        
        if (userGuess > myGuess) {
            System.out.println("Nice try, it is too high");
        } else if (userGuess < myGuess) {
            System.out.println("Nice try, it is too low");
        } else if (userGuess == myGuess){
            System.out.println("Wow, that!");
        }
        
        
        
    }
}

