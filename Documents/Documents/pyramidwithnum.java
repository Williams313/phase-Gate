import java.util.Scanner;

public class pyramidwithnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the triangle: ");
        int rows = scanner.nextInt();
        String symbol = "7 ";

        for (int count = 1; count <= rows; count++) {
            for (int counter = 1; counter <=count; counter++) {
                System.out.print(symbol);
            }
            System.out.println();
}
}
}