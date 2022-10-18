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
public class AllTheTrivia {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        int numCorrect = 0; //tracking the number of correct answers
        
        //first question
        System.out.println("What is the capital city of France?");
        System.out.println("a. London, " + "b. Rome, " + "c. Paris" );
        
        String answer = myScanner.nextLine();
        
        if (answer.contains("c")) {
            System.out.println("That is correct!");
            numCorrect += 1;
        } else {
            System.out.println("That's not correct");
        }
        
        //second questions
        System.out.println("Which country's flag doesn't have a star on it?");
        System.out.println("a. Vietnam, " + "b. Russia, " + "c. Somalia" );
        
         answer = myScanner.nextLine();
        
        if (answer.contains("b")) {
            System.out.println("That is correct!");
             numCorrect += 1;
        } else {
            System.out.println("That's not correct");
        }
        
        //telling the score
        int totalQuestions = 2;
        double score = (100 * numCorrect) / totalQuestions; //multiplying with 100 for the percentage
        
        System.out.println("Your score is " + score + "%");
    }
}

