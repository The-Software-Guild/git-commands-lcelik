/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.variables;

/**
 *
 * @author DELL
 */
public class Variables {

    public static void main(String[] args) {
        System.out.println("Practising Programs, Statements and Variables!");
        
          // Declare variables to use in the examples
        int result;
        int operand1;
        int operand2;
        int operand3;

        
        // Assignment
        //
        // Initialize result with the value of 0 by using the
        // assignment (=) operator. The assignment operator takes the
        // value on the right and assigns it to the variable on the
        // left
        
        result = 0;
        
        // Initialize the operands
        operand1 = 5;
        operand2 = 7;
        
        // Assignment works with variable values as well as literal
        // values. We'll set operand3 to the same value as operand2
        operand3 = operand2; // now both have the value 7
        
        // Addition
        //
        // Addition is a binary infix operator.  It works with
        // literals:
        result = 42 + 53;  // result is now 95
        
         // We use the modulus operator (%) to get the remainder:
        result = operand1 % operand2;  // result now equals 5
        
         // It works with a combination of literals and variables:
        result = 20 / operand1;  // result now equals 4
        
         // You can chain division operators together:
        // result now equals 1
        result = 245 / operand1 / operand2 / operand3;

        // Finally, the /= operator is used to add a value to a
        // variable. result /= operand1 is equivalent to
        // result = result / operand1.
        // NOTE: the initial value of result is used to calculate the
        //       new value of result:
        result = 40;  // set result to 40
        result /= 4;  // result is now equal to 10 (40 / 4)
        result /= operand1; // result is now equal to 2 (10 / 5)

        
        
        
        
         // It also works with variables:
        result = operand1 + operand2;  // result now equals 12

        // It works with a combination of literals and variables:
        result = 1 + operand1;  // result now equals 6

        // You can chain addition operators together:
        // result now equals 20
        result = 1 + operand1 + operand2 + operand3;
        
        // Finally, the += operator is used to add a value to a
        // variable. result += operand1 is equivalent to
        // result = result + operand1.
        // NOTE: the initial value of result is used to calculate the
        //       new value of result:
        result = 2;  // set result to 2
        result += 4;  // result is now equal to 6 (2 + 4)
        result += operand1; // result is now equal to 11 (6 + 5)

        // Subtraction
        //
        // Subtraction is a binary infix operator.  It works with
        // literals:
        result = 9 - 5;  // result is now 4

        // It also works with variables:
        result = operand1 - operand2;  // result now equals -2
        
        // It works with a combination of literals and variables:
        result = 15 - operand1;  // result now equals 10
        
         // You can chain subtraction operators together:
        // result now equals 0
        result = 19 - operand1 - operand2 - operand3;
        
        // Finally, the -= operator is used to add a value to a
        // variable. result -= operand1 is equivalent to
        // result = result - operand1.
        // NOTE: the initial value of result is used to calculate the
        //       new value of result:
        result = 2;  // set result to 2
        result -= 4;  // result is now equal to -2 (2 - 4)
        result -= operand1; // result is now equal to -7 (-2 - 5)

          // Multiplication
        //
        // Multiplication is a binary infix operator.  It works with
        // literals:
        result = 2 * 3;  // result is now 6

        // It also works with variables:
        result = operand1 * operand2;  // result now equals 35

        // It works with a combination of literals and variables:
        result = 2 * operand1;  // result now equals 10

        // You can chain multiplication operators together:
        // result now equals 490
        result = 2 * operand1 * operand2 * operand3;
        
         // Finally, the *= operator is used to add a value to a
        // variable. result *= operand1 is equivalent to
        // result = result * operand1.
        // NOTE: the initial value of result is used to calculate the
        //       new value of result:
        result = 2;  // set result to 2
        result *= 4;  // result is now equal to 8 (2 * 4)
        result *= operand1; // result is now equal to 40 (8 * 5)
        
        // Division and Modulus
        //
        // Division is a binary infix operator.  It works with
        // literals:
        result = 6 / 3;  // result is now 2

        // It also works with variables:
        result = operand1 / operand2;  // result now equals 0    
        
        
        
        

        
    }
}
