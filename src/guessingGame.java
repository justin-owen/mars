import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
public class guessingGame {
    public guessingGame() {
        System.out.println("Welcome to the the Guessing Game! What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello, " + name);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        int tries = 0;
        System.out.println("Guess a number between 1 - 100: ");
        while (true) {

            int guess;
            try {
                guess = input.nextInt();

            } catch (InputMismatchException e) {
                String bad_input = input.next();
                System.out.println("Please enter an integer between 1-100.");
                continue;
            }
            if (guess > 100 || guess < 1) {
                System.out.println("Guess must be between 1 and 100! Try again");
                continue;
            }
            tries++;
            if (guess == number) {
                System.out.println("Congrats " + name + "! You guessed the number in " + tries + " tries.");
                break;
            } else if (guess > number) {
                System.out.println("Lower!");
            } else if (guess < number) {
                System.out.println("Higher!");
            }

        }


    }
}