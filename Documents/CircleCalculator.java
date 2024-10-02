public class CircleCalculator {
    public static void main(String[] args) {
        double radius = 6.5;
        double pie = 3.14159;

        double perimeter = 2 * radius * pie;
        double area = radius * radius * pie;

        System.out.println("Radius: " + radius);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}

