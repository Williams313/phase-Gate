
public class jeniPrimeNumberMethod {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("Number of prime numbers less than 1000: " + count);
    }
}


