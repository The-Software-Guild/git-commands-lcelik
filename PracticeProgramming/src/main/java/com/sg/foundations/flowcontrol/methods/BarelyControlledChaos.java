/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {
    
        String color = chooseColor(); // call color method here
        String animal = chooseAnimal(); // call animal method again here
        String colorAgain = chooseColor(); // call color method again here
        int weight = chooseNumber(5, 200); // call number method,
            // with a range between 5 - 200
        int distance = chooseNumber(10, 20); // call number method,
            // with a range between 10 - 20
        int number = chooseNumber(1000, 2000); // call number method,
            // with a range between 10000 - 20000
        int time = chooseNumber(2, 6); // call number method,
            // with a range between 2 - 6       
    
    
           System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("""
                           
                           It was QUITE the experience, let me tell you!"""); 
            
    }
    
    // Write a method that returns a randomly chosen color
    public static String chooseColor() {
        String[] colors = new String[] {"blue", "red", "orange", "purple", "green"};
        Random range = new Random();
        int randomIndex = range.nextInt(colors.length);
        String randomColor = colors[randomIndex];
        return randomColor;
    }
    
    // ??? Write method that returns a randomly chosen animal
    public static String chooseAnimal() {
        String[] animals = new String[] {"dog", "cat", "bird", "fish", "lion"};
        Random range = new Random();
        int randomIndex = range.nextInt(animals.length);
        String randomAnimal = animals[randomIndex];
        return randomAnimal;
    }
    
    
    // Write a method that returns a random integer chosen from a range(min/max)
    public static int chooseNumber(int min, int max) {
    Random range = new Random();
    int randomNumber = range.nextInt(++max - min) + min;
    return randomNumber;
    }
    
}
