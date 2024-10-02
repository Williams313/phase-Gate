
     
         import java.util.Scanner;

public class mortgageCalculatorFunction { 
               
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.print("""

using the following formular.:

 M = P[r(1+r)^n]/[(1+r)^n – 1]:

Where:
M = monthly payment
P = principal loan amount
r = monthly interest rate
n = number of payments  

I programed the calculator below.:
""");      

        System.out.println("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.println("Enter the annual interest rate (in %): ");
        double annualInterestRate = input.nextDouble() / 100  ;

        System.out.println("Enter the duration in years: ");
        int years = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 12;
        int numberOfPayments = years * 12;

        double monthlyPayment = calculateMonthlyPayment(principal, monthlyInterestRate, numberOfPayments);

        System.out.println("Monthly payment: " + monthlyPayment);
    }

    public static double calculateMonthlyPayment(double principal, double monthlyInterestRate, int numberOfPayments) {
  
        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }
}


 