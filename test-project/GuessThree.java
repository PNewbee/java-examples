
/**
 * Write a description of class GuessThree here.
 *
 * @author (Stoll)
 * @version (2017-18)
 */

/*
GAME RULES
This program:
    - Generates a three digit number at random (called the secret number).
        - Each digit in the secret number must be unique (880 is invalid since the 8 is repeated).
    - Asks the player to guess the secret number.
    - After each guess, the computer tells the player:
        - If they they win (guessed the secret number)
        - If they don't win, it tells them:
            - how many digits from their guess are in the secret number.
            - How many of the digits from their guess are in the correct position.
    - The player gets 10 guesses.
    - They win if they guess all three digits in the correct sequence.
    - Win or lose, the player is asked whether or not they want to play again.
    - The number of guesses and the number of digits in the secret number are flexible:
        - Set in the MAXGUESSES and NUMDIGITS constants. 
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class GuessThree
{

    public static final int NUM_DIGITS = 3;
    public static final int MAX_GUESSES = 10;

    public static String getSecretNum(int numDigits) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i <= 9; i++) {
             list.add( String.valueOf(i));
        }
        
        Random randomNumber = new Random();
        String secretNbr = "";
        int randomNbr = 0;
        
        for (int i = 0; i < NUM_DIGITS; i++)  {
            randomNbr = 0 + randomNumber.nextInt(list.size() - 1);
            secretNbr += list.get(randomNbr);
            list.remove(randomNbr);
        }
        System.out.println("The secret number is" + secretNbr); //Test data, delete this
        return secretNbr;
    }
    
    public static String getClues(String guess, String secretNum)  {
        // Retrieves the guess and secretNum
        
        int numInTheList = 0;
        int numInCorrectPosition = 0;
        
        for (int guessId = 0; guessId <= guess.length()-1; guessId++) {
            for (int secretId = 0; secretId <= secretNum.length()-1; secretId++) {
                if (guess.charAt(guessId) == secretNum.charAt(secretId)) {
                    numInTheList++;
                    if (guessId == secretId) {
                        numInCorrectPosition += 1;
                    }
                }
            }
        }
        
        //
        return String.valueOf(numInTheList) + String.valueOf(numInCorrectPosition);
        
    }
    
    public static boolean playAgain()  {
        // Asks the player to play again
        System.out.println("Do you want to play again? (  y / n  )");

        Scanner keyboard = new Scanner(System.in);
        String answer = keyboard.nextLine();
        
        return answer.toLowerCase() == "y";
     

    }
    
    
    
    public static void main(String[] args) {
        // Game Loop
        while(true) {
            System.out.println("Just inside the while loop.");
            String secretNum = getSecretNum(3);
            int numGuesses = 1;
            String clue = "";
            
            while(numGuesses <= MAX_GUESSES) {
                System.out.println("Before Guessing.");                
                String guess = "";
                Scanner keyboard = new Scanner(System.in);
                guess = keyboard.next();
                System.out.println("After Guessing");
                
                // Validation needs to be added here (three numeric digits)
                clue = getClues(guess, secretNum);
                if (guess == secretNum) {
                    System.out.println("You won!!!");
                    break;
                }
                
                // Didn't guess correctly (would have broken out on the previous line)
                System.out.println("Your guess was: " + guess + ". You got " +
                                clue.substring(0, 1) + " correct and " + 
                                clue.substring(1, 2) + " is/are in the right place.");
                                
                if (numGuesses > MAX_GUESSES) {
                    System.out.println("You ran out of guesses. The answer was: " + secretNum);

                    if (!playAgain()) {
                        break;
                    }
                
                }
                
            }
        }
    }

}
