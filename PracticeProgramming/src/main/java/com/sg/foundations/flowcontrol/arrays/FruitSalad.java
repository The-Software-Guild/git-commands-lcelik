/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author DELL
 */
public class FruitSalad {
    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad;

        // Code Recipe for fruit salad should go here!
           int fruitCounter = 0;
        int appleCounter = 0;
        int orangeCounter = 0;
        
        for (int i = 0; i < fruitSalad.length; i++) {
           do {
               if (fruit[i].contains("berry")) {
                   fruitSalad[i]= fruit[i];
                   fruitCounter += 1;
               } else if (fruit[i].contains("Apple")) {
                   if (appleCounter < 3) {
                       fruitSalad[i] = fruit[i];
                       appleCounter += 1;
                       fruitCounter += 1;
                   }
               } else if (fruit[i].contains("Orange")) {
                   if (orangeCounter < 2) {
                       fruitSalad[i] = fruit[i];
                       orangeCounter += 1;
                       fruitCounter += 1;
                   }
               } else if (!fruit[i].contains("Tomato")) {
                   fruitSalad[i] = fruit[i];
                   fruitCounter += 1;
               } 
           } while(fruitSalad.length < 12);
       }
    
        System.out.println("My fruit salad contains " + fruitCounter + "fruits: " + Arrays.toString(fruitSalad));
        System.out.println(fruitCounter);
        System.out.println(appleCounter);
        System.out.println(orangeCounter);
        
          
          
    }
}
