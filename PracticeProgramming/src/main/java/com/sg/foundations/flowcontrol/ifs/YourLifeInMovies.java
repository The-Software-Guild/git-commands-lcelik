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
    
    if (1965 > userYearOfBirth > 1975) {
          System.out.println("MASH TV series has been around for almost half a century!");
      } else if (userYearOfBirth < 1975 || userYearOfBirth > 1985 ) {
          System.out.println("Original Jurassic Park release is closer to the first lunar landing than it is to today.");
       } else if (userYearOfBirth < 1985 || userYearOfBirth > 1980) {
         System.out.println("Space Jam came out not last decade, but the one before THAT."); 
         
         if (userYearOfBirth == 1980) {
         
         System.out.println("Pixar's 'Up' came out over a decade ago.");
         
         System.out.println("The first Harry Potter came out over 15 years ago.");
         
         System.out.println("Space Jam came out not last decade, but the one before THAT.");
         } }
     else if (userYearOfBirth < 2005 || userYearOfBirth > 1995 ) {
         System.out.println("Pixar's 'Up' came out over a decade ago.");
      } else if (userYearOfBirth < 1995 || userYearOfBirth > 1985 ) {
         System.out.println("The first Harry Potter came out over 15 years ago.");   
         
         
    }
    
    
    }}
