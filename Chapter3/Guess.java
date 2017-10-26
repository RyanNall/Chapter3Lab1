
// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess;           //Number the user tries to guess
          int guess;                //The user's guess
 
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          //randomly generate the  number to guess
          numToGuess = generator.nextInt(11);
 
          //print message asking user to enter a guess
          System.out.println("Enter your guess from 0-10:");
 
          //read in guess
          guess = scan.nextInt();          
          while ( guess != numToGuess )  //keep going as long as the guess is wrong
            {
                  //print message saying guess is wrong
                  if (guess > numToGuess){
                      System.out.println("Your guess was too high!");
                    }
                  else{
                      System.out.println("Your guess was too low!");
                    }
                  
                  //get another guess from the user
                  System.out.println("Enter your guess:");
                  guess = scan.nextInt();
          }
          System.out.println( guess + " = " + numToGuess + " You are correct!");
 
          //print message saying guess is right
        }
}
 