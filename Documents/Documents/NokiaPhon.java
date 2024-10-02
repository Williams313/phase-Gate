import java.util.Scanner;

public class NokiaPhon {
    public static void main(String[] lambert) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("WELCOME TO NOKIA 3310 your first choice...");
            System.out.println("1. Phone book");
            System.out.println("2. Messages");
            System.out.println("3. Chat");
            System.out.println("4. Call register");
            System.out.println("5. Tones");
            System.out.println("6. Settings");
            System.out.println("7. Call divert");
            System.out.println("8. Games");
            System.out.println("9. Calculator");
            System.out.println("10. Reminders");
            System.out.println("11. Clock");
            System.out.println("12. Profiles");
            System.out.println("13. SIM services");
            System.out.println("14. Exit");
            int choice = input.nextInt();

            switch (choice) {
                case 1->:
                    phoneBook(input);
                    break;
                case 2->:
                    messages(input);
                    break;
                case 3->:
                    chat();
                    break;
                case 4->:
                    callRegister();
                    break;
                case 5:
                    tones();
                    break;
                case 6:
                    settings();
                    break;
                case 7:
                    callDivert();
                    break;
                case 8:
                    games(input);
                    break;
                case 9:
                    calculator();
                    break;
                case 10:
                    reminders();
                    break;
                case 11:
                    clock();
                    break;
                case 12:
                    profiles();
                    break;
                case 13:
                    simServices();
                    break;
                case 14:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void phoneBookMenu(Scanner input) {
        System.out.println("Phone Book");
        System.out.println("1. Search");
        System.out.println("2. Service Nos.");
        System.out.println("3. Add name");
        System.out.println("4. Erase");
        System.out.println("5. Edit");
        System.out.println("6. Assign tone");
        System.out.println("7. Send b’card");
        System.out.println("8. Options");
        System.out.println("9. Back");
        int phoneBookChoice = input.nextInt();

        if (phoneBookChoice == 8) {
            System.out.println("Options");
            System.out.println("1. Type of view");
            System.out.println("2. Memory status");
            System.out.println("3. Back");
            int optionsChoice = input.nextInt();

            if (optionsChoice == 1) {
                System.out.println("Type of view");
            } else if (optionsChoice == 2) {
                System.out.println("Memory status");
            } else if (optionsChoice == 3) {
                phoneBook(input);
            }
        } else if (phoneBookChoice == 9) {
            return;
        } else {
            // handle other phone book options here
        }
    }

   