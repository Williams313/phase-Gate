import java.util.Scanner;
public class Arithmetics{
	public static void main (String[] arg){
	Scanner scanner = new Scanner(System.in);

System.out.print("please enter firstNumber: ");
double Number1 = scanner.nextDouble();
scanner.nextLine();


System.out.print("please enter secondNumber: ");
double Number2 = scanner.nextDouble();
scanner.nextLine();

System.out.print("what operation do you want to perform? sum +, mul * , sub - , div /, ");
String operation = scanner.nextLine();

if(operation.equals("sum")) {
System.out.printf("%f + %f = %f",Number1,Number2,Number1 + Number2);
}
else if (operation.equals("sub")) {
System.out.printf("%f - %f = %f",Number1,Number2,Number1 - Number2);
}
else if (operation.equals("mul")) {
System.out.printf("%f * %f = %f",Number1,Number2,Number1 * Number2);
}
else if (operation.equals("div")) {
if (Number2 == 0) {
System.out.print(" system can not print number less than zero");
} else {
System.out.printf("%f / %f = %f",Number1,Number2,Number1 / Number2);
}

}


}
}