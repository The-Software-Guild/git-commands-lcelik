/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessment.BasicProgramingConcepts;

/**
 *
 * @author DELL
 */
public class SummativeSums {
    public static void main(String[] args) {
    
    
    int[] arr1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
    int[] arr2 = { 999, -60, -77, 14, 160, 301 };
    int[] arr3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
140, 150, 160, 170, 180, 190, 200, -99 }; 
    
    //find their sum using the result method
  int sum1 = result(arr1);
  int sum2 = result(arr2);
  int sum3 = result(arr3);
    
   
    //print out the results
        System.out.println("The sum of array1 is = " + sum1);
        System.out.println("The sum of array2 is = " + sum2);
        System.out.println("The sum of array3 is = " + sum3);
    
    
    }
    
    // static method that takes in an array of ints, adds them together, and returns the result.
    public static int result(int[] array) {
        
        int sum = 0; //initializing sum
        
        for (int i = 0; i < array.length; i++) { //looping through each element of array to the sum
            sum = sum + array[i];
        }
        return sum;  //final sum
        
    }
}
