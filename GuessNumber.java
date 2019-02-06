
/**
 * Prompts user to input a number & tells user if it is too large, 
 * too small, or correct. Tracks guesses until correct.
 * @author ashblox
 * @version 1.0
 */

import java.util.Scanner;
import java.util.Random;

public class GuessNumber
{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 10");
        Random comp = new Random();
        int answer = comp.nextInt(10)+1;
        int guess1 = input.nextInt();
        int guesses = 1;
        if (guess1 == answer) {
            System.out.println("Correct!");
            System.out.println("You guessed one time.");
        } 
        while (guess1 != answer) {
            if (guess1 > 10 || guess1 < 0) {
            System.out.println("Invalid number. Guess again.");
        } else if (guess1 < answer) {
            System.out.println("Too small. Guess again.");
        } else if (guess1 > answer) {
            System.out.println("Too large. Guess again.");
        } 
            guess1 = input.nextInt();
            guesses ++;
        if (guess1 == answer) {
            System.out.println("Correct!");
            System.out.println("You guessed " + guesses + " times.");
        }
        }
       
        
    }
}
