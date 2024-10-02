import java.util.Scanner;

public class allInOneFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	System.out.println("""

   Input The Number U Wish To Perform Calculation With:

++++++++++++++++++++++++++++++++
1->: Check if number is prime or not
2->: divide 2 numbers,
3->: Check if number is even 
4->: check if number is palindrome 
5->: check for square of number
6->: check for numbers factorial
7->: subtract 2 numbers
8->: Check if number givs square multiple

++++++++++++++++++++++++++++++++++++
""");

        int number = input.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
            System.out.print("Factors of " + number + ": are 1, " + number);
        } else {
            System.out.println(number + " is not a prime number");
            System.out.print("Factors of " + number + ": are ");
            printFactors(number);
        }

        System.out.println("\nIs " + number + " even? " + isEven(number));
        System.out.println("Subtract 7 and " + number + ": " + subtract(number, 7));
        System.out.println("Divide " + number + " by 2: " + divide(number, 2));
        System.out.println("Is " + number + " a square number? " + isSquare(number));
        System.out.println("Factorial of " + number + ": " + factorialOf(number));
        System.out.println("Is " + number + " a palindrome? " + isPalindrome(number));
        System.out.println("Square of " + number + ": " + squareOf(number));
    }

    public static boolean isPrime(int number) {
        for (int count = 2; count <= number / 2; count++) {
            if (number % count == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printFactors(int number) {
        for (int count = 1; count <= number; count++) {
            if (number % count == 0) {
                System.out.print(count + " ");
            }
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int subtract(int a, int b) {
        return Math.abs(a - b);
    }

    public static float divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return (float) a / b;
    }

    public static boolean isSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static long factorialOf(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }

    public static long squareOf(int num) {
        return (long) num * num;
    }
}