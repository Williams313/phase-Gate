import java.util.Scanner;

public class jeniRightAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the triangle: ");
        int rows = scanner.nextInt();
        String symbol = "1";

        for (int count = 1; count <= rows; count++) {
            for (int counter = 1; counter <= 7; counter++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
