import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayMinimumAndMaximum {

public static void main(String[] args) {


    

        //Arrays sums
        long[] sum = new long[2];
         for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i+1] * i + i;
System.out.println("Factorial sums: " + java.util.Arrays.toString(sum));

        }
/**
	int largest = Integer.MINIMUM_VALUE;
        int smallest = Integer.MAXIMUM_VALUE;

        for (int count = 0; count < 5; count++) {
            System.out.print("Enter integer " + (count + 1) + ": ");
            int num = scanner.nextInt();

            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Largest integer: " + largest);
        System.out.println("Smallest integer: " + smallest);

        System.out.println("Factorial sums: " + java.util.Arrays.toString(sum));
*/

        }
}
