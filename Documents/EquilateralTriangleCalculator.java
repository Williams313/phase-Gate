import java.util.Scanner;

public class EquilateralTriangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the side and height of the equilateral triangle: ");
        double sideLength = scanner.nextDouble();

        double area = (3 * 0.5773502691896258) / 4 * Math.pow(sideLength, 2);
        double volume = area * sideLength;

        System.out.println("area: " + area);
        System.out.println("Volume of the triangular prims is: " + volume);
    }
}


