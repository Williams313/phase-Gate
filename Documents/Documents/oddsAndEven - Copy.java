import java.util.Scanner;

 public class oddsAndEven {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 System.out.println("Check if numbers are odd numbers or even: ");
  int number = input.nextInt();
 
 if (number %2 ! == 0)
 System.out.println("Hi odd");

 if (number % 2 == 0)
 System.out.println("HiEven");
 }
 }

