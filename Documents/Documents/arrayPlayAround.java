import java.util.Arrays;

import java.util.Scanner;

public class arrayPlayAround {

    public static void main(String[] args) {
	Scanner numbers = new Scanner(System.in);
     
	System.out.print("how many scores: ");
	int score = numbers.nextInt();

	int [] number = new int[score];

          
        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter your  scores: " + (i + 1));
		number[i] = numbers.nextInt();
	}


	for (int i = 0; i < number.length; i++) {
	 System.out.print(number[i ]+ " ");
                
        }
	
	int smallestScore = score [0];
	
	for (int i = 0; i < score.length; i++) {
	
	if ( score [i] < smallest) largestScore = score[i]; {
}
	System.out.print("smallest is " +  ); 




}

}
}

