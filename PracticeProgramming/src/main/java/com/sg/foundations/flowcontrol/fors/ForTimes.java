/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ForTimes {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Which times table shall I recite?");
        String tempNum = userInput.nextLine();
        int userNumber = Integer.parseInt(tempNum);
        
        // For loop to print the times table from 1 to 15 inclusive of the number the user inputs
        for(int i = 1; i <= 15; i++) {
            System.out.println(i + " * " + userNumber + " is: " + (i * userNumber));
    }
}
}

