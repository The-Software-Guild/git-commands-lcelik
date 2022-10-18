/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class GuessMeFinally {
    public static void main(String[] args) {
        
        int correctAnswer = randomNumber(-100, 100); // Cariable to store random number generated
        int userAnswer ; // Variable to store user input
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!");
        

        // Do while loop that will ask user for a number until user guesses correctly
        // then stops
         do {
            System.out.println("Your guess: ");
            String userAns = userInput.nextLine();
            userAnswer = Integer.parseInt(userAns);
            
            // Conditions to check user's input and print message accordingly
            if (userAnswer > correctAnswer) {
                System.out.println("Too bad, way too high. Try again!");
            } else if (userAnswer < correctAnswer) {
                System.out.println("Ha, nice try - too low! Try again!");
            }
        }while (userAnswer != correctAnswer);
        
        if (userAnswer == correctAnswer) {
            System.out.println("Finally! It's about time you got it!");
        }
    }
        // Method to generate a random number including the min and max values
        public static int randomNumber(int s, int e) {
            Random rndNum = new Random();
            int start = s;
            int end = e;
            int rnd = rndNum.nextInt((end + 1) - start) + start;
            return rnd;
        }
        
        
    }


