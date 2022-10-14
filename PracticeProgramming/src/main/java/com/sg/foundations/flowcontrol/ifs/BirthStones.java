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
public class BirthStones {
    public static void main(String[] args) {
    
        int userAnswer;
        
        String input;
        
    Scanner myScanner = new Scanner(System.in);
    
        System.out.println("What month's birthstone do you want to know? Type the number for the month");
        
        input = myScanner.nextLine();
        userAnswer = Integer.parseInt(input);
        
        
    if (userAnswer == 1) {
        System.out.println("January's birthstone is Garnet");
    } else if ( userAnswer == 2) {
        System.out.println("February's birthstone is Amethyst");
    } else if ( userAnswer == 3) {
        System.out.println("March's birthstone is Aquamarine");
    } else if ( userAnswer == 4) {
        System.out.println("Aprils's birthstone is Diamond");
    } else if (userAnswer == 5) {
        System.out.println("May's birthstone is Emerald");
    } else if (userAnswer == 6) {
        System.out.println("June's birthstone is Emerald");
    } else if (userAnswer == 7){
        System.out.println("July's birthstone is Emerald");
    } else if (userAnswer == 8){
        System.out.println("August's birthstone is Peridot");
    } else if (userAnswer == 9){
        System.out.println("September's birthstone is Sapphire");
    } else if (userAnswer == 10){
        System.out.println("October's birthstone is Opal");
    } else if (userAnswer == 11){
        System.out.println("November's birthstone is Topaz");
    } else if (userAnswer == 12) {
        System.out.println("December's birthstone is Turquoise");
    } else {
       System.out.println("Invalid number. Please chose numbers between 1 and 12");
    }
    }
}




