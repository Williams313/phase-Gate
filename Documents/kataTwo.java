import java.util.Scanner;

public class kataTwo {
     public static void main (String[] args){
	Scanner input = new Scanner(System.in);
        System.out.println("Input the number you wish to perform calculation with:");
	int number = input.nextInt();


	  /** if (kata.isEven(number)) { 	
           System.out.println("The number" +number+ "inputed is an even number " );
 	   
      }else{
             
		System.out.println("The number :" + number + " is not an even number " );		*/

                  if (kata.isPrime(number)) { 	
           System.out.println("The number" +number+ "inputed is prime number " );
 	   
      }else{
             
		System.out.println("The number :" + number + " is not a prime number " );
	      
		}

		}
	    }   