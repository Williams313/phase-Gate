  

import java.util.Scanner;

public class ScoreCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double score1 = getScore(scanner, 1);
        double score2 = getScore(scanner, 2);
        double score3 = getScore(scanner, 3);
        double score4 = getScore(scanner, 4);
        double score5 = getScore(scanner, 5);
        double score6 = getScore(scanner, 6);
        double score7 = getScore(scanner, 7);
        double score8 = getScore(scanner, 8);
        double score9 = getScore(scanner, 9);
        double score10 = getScore(scanner, 10);

        double sum = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10;
        double average = sum / 10;
        double sumEvenIndexes = score2 + score4 + score6 + score8 + score10;
        double sumEvenNumbers = getEvenSum(score1, score2, score3, score4, score5, score6, score7, score8, score9, score10);
        double averageEvenNumbers = sumEvenNumbers / getEvenCount(score1, score2, score3, score4, score5, score6, score7, score8, score9, score10);
        double sumValidScores = getValidSum(score1, score2, score3, score4, score5, score6, score7, score8, score9, score10);
       // double averageValidScores = sumValidScores / getValidCount(score1, score2, score3, score4, score5, score6, score7, score8, score9, score10);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Sum even indexes: " + sumEvenIndexes);
        System.out.println("Sum even numbers: " + sumEvenNumbers);
        System.out.println("Average even numbers: " + averageEvenNumbers);
        System.out.println("Sum valid scores: " + sumValidScores);
       // System.out.println("Average valid scores: " + averageValidScores);
    }

    private static double getScore(Scanner scanner, int i) {
        System.out.print("Enter score " + i + ": ");
        return scanner.nextDouble();
    }

    private static double getEvenSum(double... scores) {
        double sum = 0;
        for (double score : scores) {
            if (score % 2 == 0) {
                sum += score;
            }
        }
        return sum;
    }

    private static int getEvenCount(double... scores) {
        int count = 0;
        for (double score : scores) {
            if (score % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static double getValidSum(double... scores) {
        double sum = 0;
        for (double score : scores) {
            if (score > 0) {
                sum += score;
            }
        
        return sum;
    
        }

        int count = 0;
        for (double score : scores) {
            if (score > 0) {
                count++;return count;
            }
        
        
    }
}
}


