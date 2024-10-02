import java.util.Random;
    import java.util.Scanner;
    public class numberGuessing {
    public static void main(String[] args) {
     Random random = new Random();

        int randomNumber = random.nextInt(100) + 1; 
        int attempts = 0;

                while (true) {
            System.out.print("Guess the number (between 1 and 100): ");
            int userGuess = random.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You found the number in " + attempts + " attempts");
                break;

            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");

            } else {
                System.out.println("Too high! Try again.");
            }
            }
//if(attempt==maxAttempts){
//System.out.println("u didnt guess the number" + maxAttempt + "attempts the number //was" + randomNumber);
//}
}
}     