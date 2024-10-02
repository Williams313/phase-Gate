import java.util.Scanner;

public class secondsCalculation {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("enter seconds ");
int seconds = scanner.nextInt();

int minutes = seconds / 60;
 int remainingSeconds = seconds % 60;
 
System.out.print(seconds + "seconds" + " is " + minutes + " munites and " + remainingSeconds + "seconds");

}
} 