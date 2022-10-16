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
public class RockPaperScissors {
    public static void main(String[] args) {
        
        playAgain(); //calling the method to play again
        
    }
       
    //METHOD for playing the game. Useful if the user decides to play again
    public static void playAgain() {
        
        int tie = 0;
        int userWin = 0;
        int computerWin = 0;
        int i; //index to keep track of the game in loop
        String result;
        String userInputForPlayingAgain;
        
        Scanner myScanner = new Scanner(System.in); //initializing the Scanner for user input
        
         //asking the user how many rounds what's to play
        System.out.println("Hi user, how many times you want to play?");
        
       //get user input for number of rounds and write a condition
       String userInput = myScanner.nextLine();
       int numberOfRounds = Integer.parseInt(userInput);
        
        if ( numberOfRounds > 10 || numberOfRounds < 1) {
            System.out.println("Error, chose the number between 1 and 10!");
        } else {
           for (i = 1; i <= numberOfRounds; i++) {  
            
           result = playingTheGame();   //calling the method for playing the game which returns the result
           System.out.println(result); 
           
           //keep track of the results
            switch (result) {  
                case "Tie" -> 
                    tie = tie + 1;
                case "user wins" -> userWin = userWin + 1;
                default -> computerWin = computerWin + 1;
            }
        }
         // displaying the results of the game
        System.out.println("The final results of the game are: Computer:" + " " + computerWin + " " + ",ties: " + tie + " " + ", user wins: " + userWin);
        
        // declaring the winer of the game
        if (userWin > computerWin) {
            System.out.println("Congratulations! You won");
        } else if (computerWin == userWin) {
            System.out.println("You have tied!");
        } else {
            System.out.println("The computer wins!");
        }
         
        
        //ask user if he/she wants to play again
        System.out.println("Would you like to play another round? Please type yes or no.");
        userInputForPlayingAgain = myScanner.nextLine(); //users input
        
        if (userInputForPlayingAgain.equals("yes")) {
            playAgain(); //method for playing the game from the start
        } else {
            System.out.println("Thank you for playing the game.");  //the end of the game
        }
        
       } 
        
    }
        
    
    //METHOD for tracking how many rounds are ties, user wins or computer wins and printing out the number of them as well as the winner
            public static String playingTheGame(){
        
        String gameResult;
        
        //prompt user to choose the game
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Choose a game: Rock, Paper, or Scissors ?");

       String userChoice = myScanner.nextLine(); //users choice for the game


        // computer's random choice for the game
        Random random = new Random();
        String[] games = new String[] {"Rock", "Paper", "Scissors"};
        int randomIndex = random.nextInt(games.length);
        String computerChoice = games[randomIndex];
        
                System.out.println("Computer chose" + " " + computerChoice);



//displaying the result of the round based on the condition

if (userChoice.equals(computerChoice)) {
     gameResult = "Tie";
} else if (userChoice.equals("Paper") && computerChoice.equals("Rock")) {
     gameResult = "user wins";
} else if (userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
    gameResult = "user wins";
} else if (userChoice.equals("Rock") && computerChoice.equals("Scissors")) {
    gameResult = "user wins";
} else {
     gameResult = "computer wins";
}

   return gameResult;  //in method we must return the result (of the game)
  }
}





















