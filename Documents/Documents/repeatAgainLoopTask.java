import java.util.Scanner;

public class repeatAgainLoopTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        do {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            System.out.println("Sum: " + (num1 + num2));

            System.out.print("Repeat? (y/n): ");
            repeat = scanner.next().equalsIgnoreCase("y");
        } while (repeat);

        scanner.close();
    }
}
