import java.util.Scanner;


public class beautifyString{
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String beautifiedString = beautifyString(input);
        System.out.println("Beautified String: " + beautifiedString);
    }

    public static String beautifyString(String input) {
        input = addFullStop(input);
        input = capitalizeFirstLetter(input);
        return input;      
    }

    public static String addFullStop(String input) {
        if (!input.endsWith(".")) {
            input += ".";
        }
        return input;
    }

    public static String capitalizeFirstLetter(String input) {
        if (!Character.isUpperCase(input.charAt(0))) {
            input = input.substring(0, 1).toUpperCase() + input.substring(1);
        }  
        return input;
    }
}


