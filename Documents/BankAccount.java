


import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double netAmount = 0;

        while (true) {
            System.out.print("Enter transaction (Deposit/Withdrawal) or 'e' to Exit: ");
            String transaction = scanner.next();

            if (transaction.equalsIgnoreCase("q")) {
                break;
            }

            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();

            if (transaction.equalsIgnoreCase("Deposit")) {
                netAmount += amount;
            } else if (transaction.equalsIgnoreCase("Withdrawal")) {
                netAmount -= amount;
            } else {
                System.out.println("Invalid transaction type. Please enter 'Deposit' or 'Withdrawal'.");
            }
        }

        scanner.close();
        System.out.println("Net Amount: " + netAmount);
    }
}

