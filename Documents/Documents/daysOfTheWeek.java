

import java.util.Scanner;

public class daysOfTheWeek{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter today's day of the week (0-6):when 0 = Sunday, 1 = Monday, and, 6 = Saturday :");
 
        int today = scanner.nextInt();

        // Prompt user for number of days after today
        System.out.print("Enter number of days after today: ");
        int daysAfter = scanner.nextInt();
        scanner.close();

        // Calculate future day of the week
        int futureDay = (today + daysAfter) % 7;

        // Display future day of the week
        System.out.println("Future day of the week: " + getDayOfWeek(futureDay));
    }

    // Method to convert day number to day name
    public static String getDayOfWeek(int day) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return days[day];
    }
}



