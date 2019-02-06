
/**
 * Prompts user to input a number & tells user if it is too large, 
 * too small, or correct. Tracks guesses until correct.
 * @author ashblox
 * @version 1.0
 */

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class GuessNumber
{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int guess = input.nextInt();
        Set<Integer> guesses = new HashSet<>();
        Random comp = new Random();
        int answer = comp.nextInt(10)+1;
        while (guess != answer) {
            guesses.add(guess);
            if (guess < 1 || guess > 10) {
                System.out.println("Number is outside range. Guess again.");
            } else if (guess > answer) {
                System.out.println("Too high. Guess again.");
            } else if (guess < answer) {
                System.out.println("Too low. Guess again.");
            }
            guess = input.nextInt();
        }
        if (guess == answer) {
            guesses.add(guess);
            System.out.println("You are correct! You guessed "
            + guesses.size() + " times.");
        }
    }
}