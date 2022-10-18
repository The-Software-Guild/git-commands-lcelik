
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Factorizer {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("What number would you like to factor? ");
        String numIn = userInput.nextLine();
        int numberToFactor = Integer.parseInt(numIn);
        
        System.out.println("The factors of " + numberToFactor + " are:");
        int numOfFactors = 0;
        int sumOfFactors = 0;
        
        
        for (int i = 1; i <= numberToFactor; i ++) {
            if (numberToFactor % i == 0) {
                System.out.print(i + " ");
                numOfFactors ++;
                if (i != numberToFactor) {
                    sumOfFactors += i;
                }
            }
        }
        System.out.println(numberToFactor + " has " + numOfFactors + " factors.");
        
        if (sumOfFactors == numberToFactor) {
            System.out.println(numberToFactor + " is a perfect number.");
        } else {
            System.out.println(numberToFactor + " is not a perfect number");  
        }
        
        if (numOfFactors == 2) {
            System.out.println(numberToFactor + " is a prime number");
        } else {
            System.out.println(numberToFactor + " is not a prime number");
        }
    }
}
