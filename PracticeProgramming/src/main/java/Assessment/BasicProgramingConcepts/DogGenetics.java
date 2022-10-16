/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessment.BasicProgramingConcepts;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DogGenetics {
    public static void main(String[] args) {
    
        System.out.println("What is the name of your dog?");
        
        Scanner myScanner = new Scanner(System.in);
        
        String userInput = myScanner.nextLine();
        
        System.out.println("Well then, I have this highly reliable report on" + " " + userInput + "'s prestigious background right here.");
        
        //generate random numbers
        Random rng = new Random();
        
      int sum = 0;
      int a = 0;
      int b = 0;
      int c = 0;
      int d = 0;
      int e = 0;
      
      while (sum != 100) {
          a = rng.nextInt(100);
          b = rng.nextInt(100 - a);
          c = rng.nextInt(100 - b);
          d = rng.nextInt(100 - c);
          e = rng.nextInt(100 - d);
          
          sum = a + b + c + d + e;
      }
      
        System.out.println(a + "% St.Bernard");
         System.out.println(b + "% Chihuahua");
          System.out.println(c + "% Dramatic RedNosed Asian Pug");
           System.out.println(d + "% Common Cur");
            System.out.println(e + "% King Doberman");
          System.out.println("Wow, that's QUITE the dog!"); 
    
    }
}

