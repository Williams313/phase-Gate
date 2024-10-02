
/**
 Sort the array in ascending order (smallest to biggest)
 Sort the array in descending order (biggest to smallest)
 Find the minimum and maximum numbers
*/


import java.util.Arrays;
import java.util.Scanner;

public class testrunCode2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[10];

        System.out.println("Enter 10 scores:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        // Sort array in ascending order
        Arrays.sort(scores);

        System.out.println("Scores in ascending order:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();

        // Sort array in descending order
        int[] descendingScores = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            descendingScores[i] = scores[scores.length - i - 1];
        }

        System.out.println("Scores in descending order:");
        for (int score : descendingScores) {
            System.out.print(score + " ");
        }
        System.out.println();

        // Find minimum and maximum numbers
        int min = scores[0];
        int max = scores[scores.length - 1];

        System.out.println("Minimum score: " + min);
        System.out.println("Maximum score: " + max);
    }
}



