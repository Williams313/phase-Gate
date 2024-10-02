import java.math.BigInteger;

import java.util.Iterator;

import java.util.Arrays;
import java.util.Random;

 public class practice {
    public static void main(String[] args) {
    System.out.println("Calculating Values to Store in an Array");

/**
int[] squares = new int[12];
for (int i = 0; i < squares.length; i++) {
    squares[i] = (i + 1) * (i + 1);


 }
        System.out.println("Perfect squares: " + java.util.Arrays.toString(squares));



  
int[] random = new int[12];
java.util.Random rand = new java.util.Random();
for (int i = 0; i < random.length; i++) {
    random[i] = rand.nextInt(50);
}
System.out.println("Random numbers are " + java.util.Arrays.toString(random));





//Write a Java function to check if a given number is a Fibonacci number.

//public class Fibonacci {
    //public static void main(String[] args) {
        int n = 12;
        long[] fib = new long[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println("Fibonacci num is :" + java.util.Arrays.toString(fib));

 //Factorials:
 

	int num = 12;

	long[] factorials = new long[12];
	factorials[0] = 1;
	for (int i = 1; i < factorials.length; i++) {
    	factorials[i] = factorials[i-1] * i;
}
System.out.println("Factorial of " + num + " is " +java.util.Arrays.toString(factorials));




//Write a Java program to calculate the factorial of a given number.

//public class Factorial {
    public static void main(String[] args) {
        int number = 45;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
 System.out.println("Factorial of " + number + ":is" + java.util.Arrays.toString(factorials));

*/


//Write a Java function to calculate the factorial of a large number (e.g., 100).

//for the below solution... import java.math.BigInteger;


//import java.math.BigInteger;

//public class practice3 {
    //public static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        
          }
            System.out.println(factorial(100));




//Advanced Question

//Design a Java class to calculate factorials using an iterator.

/**
//import java.util.Iterator;
//import java.util.NoSuchElementException;

public class FactorialIterator implements Iterator<BigInteger> {
    private int current = 1;
    private BigInteger factorial = BigInteger.ONE;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public BigInteger next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        BigInteger result = factorial;
        factorial = factorial.multiply(BigInteger.valueOf(current));
        current++;
        return result;
    }
    public static void main(String[] args) {
        FactorialIterator iterator = new FactorialIterator();
        for (int i = 0; i < 10; i++) {
            System.out.println(iterator.next());
*/



    }
}





