import java.util.Scanner;
public class palindrome {
public static void main(String[] arg) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter three integer  : ");
int num = scanner.nextInt();

 int reverse = 0;

 int original = num;


while(num != 0) {

reverse = reverse *  10 + num % 10;
num /= 10;
}
if(reverse == original) {
System.out.print(original + "is a palindrome");

}else {
System.out.print(original + " is not a palindrome");




   }
  }
 }

/**

//palindrome for words or String

System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

Explanation:


1. Take an integer input from the user.
2. Initialize reverse to 0 and original to the input number.
3. Use a while loop to reverse the number:
    - Multiply reverse by 10 and add the remainder of num divided by 10 (num % 10).
    - Divide num by 10 (num /= 10).
4. Compare reverse with original:
    - If equal, print that the number is a palindrome.
    - Otherwise, print that the number is not a palindrome.

*/
