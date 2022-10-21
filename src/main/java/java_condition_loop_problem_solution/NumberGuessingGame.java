//2. Write a program according to the following output. Make sure you have covered all the corner cases:
//********************Welcome to the Guessing Game! ********************
// ********************A number is already generated. ********************
//*****To win, you have 5 chances to guess the generated number. *****

package java_condition_loop_problem_solution;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {

        int generatNumber;

        generatNumber = (int) (Math.random() * 99 + 1);

        System.out.println("Generated number is " + generatNumber); // to be removed later

        Scanner keyboard = new Scanner(System.in);

        int guess;

        System.out.print("Enter a guess: ");

        guess = keyboard.nextInt();

        System.out.println("Your guess is " + guess);

        if (guess == generatNumber)

            System.out.println("Your guess is correct. Congratulations!");

        else if (guess < generatNumber)

            System.out.println("Your guess is smaller than the Generated number.");

        else if (guess > generatNumber)

            System.out.println("Your guess is greater than the Generated number.");

    }

}
