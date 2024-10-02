import java.util.Arrays;
import java.util.Scanner;
public class testrunCode {
public static void main(String[] arg) {
Scanner scanner = new Scanner(System.in);

       

        int[] scores = collectScores(scanner);
        printScores(scores);
        printAverage(scores);
        printSum(scores);
        printSumOfEvenIndexes(scores);
        printEvenNumbers(scores);
        printSumOfEvenNumbers(scores);
        printAverageOfEvenNumbers(scores);
        printOddNumbers(scores);
        printPrimeNumbers(scores);
        printAverageOfPrimeNumbers(scores);
        printSumOfPrimeNumbers(scores);
    }

    // Collect 10 valid scores between 0 and 100
    public static int[] collectScores(Scanner scanner) {
        int[] scores = new int[10];
        System.out.println("Enter 10 scores (0-100):");
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Score " + (i + 1) + ": ");
                scores[i] = scanner.nextInt();
                if (scores[i] >= 0 && scores[i] <= 100) {
                    break;
                }
                System.out.println("Invalid score. Please enter a score between 0 and 100.");
            }
        }
        return scores;
    }

    // Print scores
    public static void printScores(int[] scores) {
        System.out.println("Scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }

    // Print average
    public static void printAverage(int[] scores) {
        double average = calculateAverage(scores);
        System.out.println("Average: " + average);
    }

    // Calculate average
    public static double calculateAverage(int[] scores) {
        return (double) calculateSum(scores) / scores.length;
    }

    // Print sum
    public static void printSum(int[] scores) {
        int sum = calculateSum(scores);
        System.out.println("Sum: " + sum);
    }

    // Calculate sum
    public static int calculateSum(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum;
    }

    // Print sum of even indexes
    public static void printSumOfEvenIndexes(int[] scores) {
        int sum = calculateSumOfEvenIndexes(scores);
        System.out.println("Sum of even indexes: " + sum);
    }

    // Calculate sum of even indexes
    public static int calculateSumOfEvenIndexes(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i += 2) {
            sum += scores[i];
        }
        return sum;
    }

    // Print even numbers
    public static void printEvenNumbers(int[] scores) {
        System.out.println("Even numbers:");
        for (int score : scores) {
            if (score % 2 == 0) {
                System.out.print(score + " ");
            }
        }
        System.out.println();
    }

    // Print sum of even numbers
    public static void printSumOfEvenNumbers(int[] scores) {
        int sum = calculateSumOfEvenNumbers(scores);
        System.out.println("Sum of even numbers: " + sum);
    }

    // Calculate sum of even numbers
    public static int calculateSumOfEvenNumbers(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            if (score % 2 == 0) {
                sum += score;
            }
        }
        return sum;
    }

    // Print average of even numbers
    public static void printAverageOfEvenNumbers(int[] scores) {
        double average = calculateAverageOfEvenNumbers(scores);
        System.out.println("Average of even numbers: " + average);
    }

    // Calculate average of even numbers
    public static double calculateAverageOfEvenNumbers(int[] scores) {
        int sum = calculateSumOfEvenNumbers(scores);
        int count = countEvenNumbers(scores);
        return count > 0 ? (double) sum / count : 0;
    }

    // Count even numbers
    public static int countEvenNumbers(int[] scores) {
        int count = 0;
        for (int score : scores) {
            if (score % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Print odd numbers
    public static void printOddNumbers(int[] scores) {
	System.out.println("odd numbers:");
	 boolean foundOdd = false;

               for (int score : scores) {
            if (score % 2 != 0) {
                System.out.print(score + " ");
            }
        }
         if (!foundOdd) {
            System.out.println("No odd numbers.");
        }
        System.out.println();

    }

    // Print prime numbers
    
       public static void printPrimeNumbers(int[] scores) {
        System.out.println("Prime numbers:");
        boolean foundPrime = false;
        for (int score : scores) {
            if (isPrime(score)) {
                System.out.print(score + " ");
                foundPrime = true;
            }
        }
        if (!foundPrime) {
            System.out.println("No prime numbers.");
        }
        System.out.println();
    }

    // Check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Print average of prime numbers
    public static void printAverageOfPrimeNumbers(int[] scores) {
        double average = calculateAverageOfPrimeNumbers(scores);
        System.out.println("Average of prime numbers: " + average);
    }

    // Calculate average of prime numbers
    public static double calculateAverageOfPrimeNumbers(int[] scores) {
        int sum = calculateSumOfPrimeNumbers(scores);
        int count = countPrimeNumbers(scores);
        return count > 0 ? (double) sum / count : 0;
    }

    // Calculate sum of prime numbers
    public static int calculateSumOfPrimeNumbers(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            if (isPrime(score)) {
                sum += score;
            }
        }
        return sum;
    }

    // Count prime numbers
    public static int countPrimeNumbers(int[] scores) {
        int count = 0;
        for (int score : scores) {
            if (isPrime(score)) {
                count++;
            }
        }
        return count;
    }

    // Print sum of prime numbers
    public static void printSumOfPrimeNumbers(int[] scores) {
        int sum = calculateSumOfPrimeNumbers(scores);
        System.out.println("Sum of prime numbers: " + sum);
    }
}


/**
Example output:



Enter 10 scores (0-100):
Score 1: 23
Score 2: 11
Score 3: 4
Score 4: 37
Score 5: 48
Score 6: 53
Score 7: 13
Score 8: 17
Score 9: 29
Score 10: 31
Scores:
23 11 4 37 48 53 13 17 29 31 
Average: 26.5
Sum: 265
Sum of even indexes: 102
Even numbers:
4 48 
Sum of even numbers: 52
Average of even numbers: 26.0
Odd numbers:
23 11 37 53 13 17 29 31 
Prime numbers:
23 11 37 53 13 17 29 31 
Average of prime numbers: 26.5
Sum of prime numbers: 213


*/














