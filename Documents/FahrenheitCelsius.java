import java.util.Scanner;
public class FahrenheitCelsius {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);


System.out.print(" inpute a degree in Fahrenheit ");
double Fahrenheit = scanner.nextDouble();

double celsius = (5.0 / 9) * (Fahrenheit +32);

System.out.print("Fahrenheit" + Fahrenheit + " is " + celsius + " in celsius :" );
}
}



