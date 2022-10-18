/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class FortuneCookie {
    public static void main(String[] args) {
        
        Random randomiser = new Random();
        
        int x = randomiser.nextInt(10);
        
        System.out.println("Your Geek Fortune is: ");
      
        
        switch (x) {
            case 0 -> System.out.println("\"Never go in against a Sicilian when death is on the line!");
            case 1 -> System.out.println("Goonies never say die.");
            case 2 -> System.out.println("With great power, there must also come — great responsibility.");
            case 3 -> System.out.println("With great power, there must also come — great responsibility.");
        case 4 -> System.out.println("Never argue with the data.");
        case 5 -> System.out.println("Try not. Do, or do not. There is no try.");
        case 6 -> System.out.println("You are a leaf on the wind, watch how you soar.");
        case 7 -> System.out.println("Do absolutely nothing, and it will be everything that you thought it could be.");
        case 8 -> System.out.println("Kneel before Zod.");
        case 9 -> System.out.println("Make it so.");
                
        }
        
        
    }
}

