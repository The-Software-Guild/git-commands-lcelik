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
public class DoOrDoNot {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Should I do it? (y/n) ");
        boolean doIt;
        
        if (input.next().equals("y")) {
            doIt = true; 
        } else {
            doIt = false;
        }
        
        boolean iDidIt = false;
        
//        do {
//            iDidIt = true;
//            break;
//        } while (doIt);

while (doIt) {
    iDidIt = true;
}


        
        
        if (doIt && iDidIt) {
            System.out.println("I did it");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        }
        
        
        
    }
}


// prints out "I did it' if you tell it to do it
// prints out "I know you said not to... but I totally did anyways"
// by using the while loop it doesn't access the second if statement
//when l choose "n" with the while loop it will not execute


