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
public class StayPositive {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("What number should l count down from?");
        
        int userInput = myScanner.nextInt();
    
        System.out.println("Here goes");
        
//        int someNum = 10;
        
        while(userInput >= 0) {
             System.out.println(userInput);
            userInput--;
            
        }
    System.out.println("Blast off");
    }
    
}



