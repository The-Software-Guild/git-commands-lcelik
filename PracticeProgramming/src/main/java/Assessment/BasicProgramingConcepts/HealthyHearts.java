/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessment.BasicProgramingConcepts;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class HealthyHearts {
    public static void main(String[] args) {
    
        System.out.println("What is your age?");
        
        Scanner myScanner = new Scanner(System.in);
        
        int userAge = myScanner.nextInt();
        
        int maxHeartRate = 220 - userAge; //hear rate
        
        int targetZone1 = (maxHeartRate / 100) * 50; //calculating the percentage zone
        int targetZone2 = (maxHeartRate / 100) * 85; 
        
        System.out.println("Your maximum heart rate should be" + " " + maxHeartRate + " " + "per minute.");
        System.out.println("Your target HR Zone is" + " " + targetZone1 + " -" + targetZone2 + " " + "per minute.");
    
    }
}

