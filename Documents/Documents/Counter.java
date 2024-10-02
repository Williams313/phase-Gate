 import java.util.Scanner;
public class Counter {
	public static void main (String[] arg){
	Scanner scanner = new Scanner(System.in);


 System.out.print("Enter a number between 0 and 1000: ");
        int num = scanner.nextInt();

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
