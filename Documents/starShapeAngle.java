import java.util.Scanner;
public class starShapeAngle {

public static void main(String[] Williams) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of stars you wish : ");
        int willi = scanner.nextInt();

	scanner.close();






for (int count = 0; count < willi; count++) {

	for (int secondCount = 0; secondCount < willi -count - 1; secondCount++) {
  	System.out.print(" ");

	}

	for(int thirdcount = 0; thirdcount <= count; thirdcount++);


			System.out.print("* ");
}
			System.out.println();


	for (int count = willi -2; count >= 0; count--) {

	for (int secondCount = 0; secondCount < willi -count - 1; secondCount++) {
	System.out.print(" ");

	}
	
	for(int thirdcount = 0; thirdcount <= count; thirdcount++);

			System.out.print("* ");
}
			System.out.println();

	    }


  }





	