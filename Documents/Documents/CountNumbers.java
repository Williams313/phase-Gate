

    import java.util.Scanner;
    public class CountNumbers {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);



       int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        
        while (true) {
            System.out.print("Enter a number (or -1000 to stop): ");
            int num = scanner.nextInt();

            if (num == -1000) {
                break;
            }

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        scanner.close();

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);
    }
}


