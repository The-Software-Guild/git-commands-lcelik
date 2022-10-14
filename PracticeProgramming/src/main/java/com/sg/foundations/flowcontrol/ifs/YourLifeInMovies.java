/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class YourLifeInMovies {
    public static void main(String[] args) {
    
    String userName;
    int userYearOfBirth;
    
    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("Hey, let's play a game! What's your name?");
    
    userName = myScanner.nextLine();
    
    System.out.println("Ok, " + userName + ", when were you born?");
    
    userYearOfBirth = myScanner.nextInt();
    
    if (userYearOfBirth < 2005) {
        System.out.println("Pixar's 'Up' came out over a decade ago");
    } 
    if (userYearOfBirth < 1995) {
        System.out.println("First Harry Potter came out over 15 years ago");
    }
    if (userYearOfBirth  < 1985) {
        System.out.println("Space Jam came out not last decade, but the one before THAT");
    }
    if (userYearOfBirth < 1975) {
        System.out.println("The original Jurassic Park release is closer to the first lunar landing than it is to today.");
    }
    if (userYearOfBirth < 1965) {
        System.out.println("MASH TV series has been around for almost half a century!");
    } if (userYearOfBirth == 1980) {
        System.out.println("""
                           Did you know that Pixar's 'Up' came out over a decade ago?
                           And that the first Harry Potter came out over 15 years ago!
                           Also, Space Jam came out not last decade, but the one before THAT.""");
    }

    
    }
    
    }


