import java.util.Scanner;

 public class oddsAndEven {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 System.out.println("Check if number are prime: ");
  int number = input.nextInt();
  
for(int count=1; count < number; count++) { 
if(number % count == 0) {
System.out.println("Number is not a prime!");

}
}
}
}
 