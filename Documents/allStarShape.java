


import java.util.Scanner;

public class allStarShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int willi = scanner.nextInt();
        scanner.close();

        //  right half of diamond
        for (int count = 0; count < willi; count++) {
            for (int counter = 0; counter < willi - counter - 1; counter++) {
                System.out.print("  ");
            }
            for (int counted = 0; counted <= count; counted++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print lower half of diamond
        for (int count = willi- 2; count >= 0; count--) {
            for (int counter = 0; counter < willi - counter - 1; counter++) {
                System.out.print("  ");
            }
            for (int counted = 0; counted <= count; counted++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
}

/**
Example Output:


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
when I input letters such as i,j,and k this same code should give me the left side of the star angle side


*/