import java.util.Scanner;

public class DiamondStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

        // Print upper half of diamond
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("1* ");
            }
            System.out.println();
        }

        // Print lower half of diamond
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("2*");
            }
            System.out.println();
        }
    }
}

/**
Example output:



Enter number of rows: 5
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 

*/

