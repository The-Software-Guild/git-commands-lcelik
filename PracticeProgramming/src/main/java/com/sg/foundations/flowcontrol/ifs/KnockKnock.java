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
public class KnockKnock {
    public static void main(String[] args) {
    
     Scanner inputReader = new Scanner(System.in);

        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();
        
        if (nameGuess.equals("Marty McFly")){
            System.out.println("Hey! That's right! I'm back!");
            
        } else {
            System.out.println("Dude, do I look like" + " " + nameGuess);
        }
    
    }
}


//if we change .equals to == it works fine
//if we don't type the name in the right capitalization it is not recognizes 


