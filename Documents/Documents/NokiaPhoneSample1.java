import java.util.Scanner;

public class NokiaPhoneSamp{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("WELCOME TO NOKIA 3310...");
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
                case 1:
           phoneBook(input);
                    break;
                case 2:
                    messages(input);
                    break;
                case 3:
                    chat();
                    break;
                case 4:
                    callRegister(input);
                    break;
                case 5:
                    tones();
                    break;
                case 6:
                    settings(input);
                    break;
                case 7:
                    callDivert();
                    break;
                case 8:
                    games();
                    break;
                case 9:
                    calculator();
                    break;
                case 10:
                    reminders();
                    break;
                case 11:
                    clock(input);
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
            }
        }
    }

    // Inner loop methods
    public static void phoneBook(Scanner input) {
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
            main(new String[0]);
        }
    }

    public static void messages(Scanner input) {
        System.out.println("Messages");
        System.out.println("1. Write messages");
        System.out.println("2. Inbox");
        System.out.println("3. Outbox");
        System.out.println("4. Picture messages");
        System.out.println("5. Templates");
        System.out.println("6. Smileys");
        System.out.println("7. Message settings");
        System.out.println("8. Info service");
        System.out.println("9. Voice mailbox number");
        System.out.println("10. Service command editor");
        System.out.println("11. Back");
        int messagesChoice = input.nextInt();

        if (messagesChoice == 2) {
            System.out.println("Inbox");
            System.out.println("1. Type of view");
            System.out.println("2. Memory status");
            System.out.println("3. Back");
            int inboxChoice = input.nextInt();

            if (inboxChoice == 1) {
                System.out.println("Type of view");
            } else if (inboxChoice == 2) {
                System.out.println("Memory status");
            } else if (inboxChoice == 3) {
                messages(input);
            }
        } else if (messagesChoice == 11) {
            main(new String[0]);
        }
    }

    // Add more inner loop methods for other options
}

