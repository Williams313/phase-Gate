import java.util.Scanner;

public class ReadTwoInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        int tripledNum1 = num1 * 3;
        int doubledNum2 = num2 * 2;

        if (tripledNum1 % doubledNum2 == 0) {
            System.out.println("The first number tripled is a multiple of the second number doubled");
        } else {
            System.out.println("The first number tripled is not a multiple of the second number doubled");
        }
    }
}

