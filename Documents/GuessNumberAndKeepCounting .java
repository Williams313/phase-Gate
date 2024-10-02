import java.util.Random;
import java.util.Scanner;

public class GuessNumberAndKeepCounting {
    public static void main(String[] args) {
        Random random = new Random();
        int numberOfTrials = 0;
        int maxTrials = 3;
        int numberToGuess = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Guess the number (between 1 and 10): ");
            int userGuess = scanner.nextInt();
            numberOfTrials++;

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number in " + numberOfTrials + " trials.");
                break;
            } else if (numberOfTrials == maxTrials) {
                System.out.println("Sorry, you didn't guess the number. The number was " + numberToGuess + ".");
                numberToGuess = random.nextInt(10) + 1;
                maxTrials += 3;
                System.out.println("You have 3 more trials.");
                numberOfTrials = 0;
            } else {
                System.out.println("Try again!");
            }
        }

        scanner.close();
    }
}