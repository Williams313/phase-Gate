import java.util.Scanner;

 public class prime {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 System.out.println("Check if number are prime: ");
  int number = input.nextInt();
 boolean isPrime = true; 
for(int count=2; count <= number / 2; count++) { 
if(number % count == 0) {
System.out.println(number + ": is not a prime!");
} else {
System.out.println(number + " :is a prime number");

 isPrime = false;
break;
}
}
}
}
