import java.util.Scanner;

public class myPhones {
    public static void main(String[] args) {
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
                case 1:
                    phoneBook(input);
                    break;
                case 2:
                    messages(input);
                    break;
                case 3:
                    chat(input);
                    break;
                case 4:
                    callRegister(input);
                    break;
                case 5:
                    tones(input);
                    break;
                case 6:
                    settings(input);
                    break;
                case 7:
                    callDivert(input);
                    break;
                case 8:
                    games(input);
                    break;
                case 9:
                    calculator(input);
                    break;
                case 10:
                    reminders(input);
                    break;
                case 11:
                    clock(input);
                    break;
                case 12:
                    profiles(input);
                    break;
                case 13:
                    simServices(input);
                    break;
                case 14:
                    System.out.println("Exiting...");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

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
        
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Search selected");
                break;
            case 2:
                System.out.println("Service Nos. selected");
                break;
            case 3:
                System.out.println("Add name selected");
                break;
            case 4:
                System.out.println("Erase selected");
                break;
            case 5:
                System.out.println("Edit selected");
                break;
            case 6:
                System.out.println("Assign tone selected");
                break;
            case 7:
                System.out.println("Send b’card selected");
                break;
            case 8:
                System.out.println("Options selected");
                System.out.println("1. Type of view");
                System.out.println("2. Memory status");
                System.out.println("3. Back");
                int optionChoice = input.nextInt();
                if (optionChoice == 1) {
                    System.out.println("Type of view selected");
                } else if (optionChoice == 2) {
                    System.out.println("Memory status selected");
                } else if (optionChoice == 3) {
                    phoneBook(input);
                }
                break;
            case 9:
                return;
            default:
                System.out.println("Invalid choice, returning to main menu.");
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
        
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Write messages selected");
                break;
            case 2:
                System.out.println("Inbox selected");
                break;
            case 3:
                System.out.println("Outbox selected");
                break;
            case 4:
                System.out.println("Picture messages selected");
                break;
            case 5:
                System.out.println("Templates selected");
                break;
            case 6:
                System.out.println("Smileys selected");
                break;
            case 7:
                System.out.println("Message settings selected");
                System.out.println("1. Message centre number");
                System.out.println("2. Messages sent as");
                System.out.println("3. Message validity");
                System.out.println("4. Back");
                int settingChoice = input.nextInt();
                if (settingChoice == 1) {
                    System.out.println("Message centre number selected");
                } else if (settingChoice == 2) {
                    System.out.println("Messages sent as selected");
                } else if (settingChoice == 3) {
                    System.out.println("Message validity selected");
                } else if (settingChoice == 4) {
                    messages(input);
                }
                break;
            case 11:
                return;
            default:
                System.out.println("Invalid choice, returning to main menu.");
        }
    }

    public static void chat(Scanner input) {
        System.out.println("Chat selected");
    }

    public static void callRegister(Scanner input) {
        System.out.println("Call Register");
        System.out.println("1. Missed calls");
        System.out.println("2. Received calls");
        System.out.println("3. Dialled numbers");
        System.out.println("4. Erase recent call lists");
        System.out.println("5. Show call duration");
        System.out.println("6. Call cost settings");
        System.out.println("7. Prepaid credit");
        System.out.println("8. Back");
        
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Missed calls selected");
                break;
            case 2:
                System.out.println("Received calls selected");
                break;
            case 3:
                System.out.println("Dialled numbers selected");
                break;
            case 4:
                System.out.println("Erase recent call lists selected");
                break;
            case 5:
                System.out.println("Show call duration selected");
                break;
            case 6:
                System.out.println("Call cost settings selected");
                break;
            case 7:
                System.out.println("Prepaid credit selected");
                break;
            case 8:
                return;
            default:
                System.out.println("Invalid choice, returning to main menu.");
        }
    }

    public static void tones(Scanner input) {
        System.out.println("Tones");
        System.out.println("1. Ringing tone");
        System.out.println("2. Ringing volume");
        System.out.println("3. Incoming call alert");
        System.out.println("4. Composer");
        System.out.println("5. Message alert tone");
        System.out.println("6. Keypad tones");
        System.out.println("7. Warning and game tones");
        System.out.println("8. Vibrating alert");
        System.out.println("9. Screen saver");
        System.out.println("10. Back");
        
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Ringing tone selected");
                break;
            case 2:
                System.out.println("Ringing volume selected");
                break;
            case 3:
                System.out.println("Incoming call alert selected");
                break;
            case 4:
                System.out.println("Composer selected");
                break;
            case 5:
                System.out.println("Message alert tone selected");
                break;
            case 6:
                System.out.println("Keypad tones selected");
                break;
            case 7:
                System.out.println("Warning and game tones selected");
                break;
            case 8:
                System.out.println("Vibrating alert selected");
                break;
            case 9:
                System.out.println("Screen saver selected");
                break;
            case 10:
                return;
            default:
                System.out.println("Invalid choice, returning to main menu.");
        }
    }

    public static void settings(Scanner input) {
        System.out.println("Settings");
        System.out.println("1. Call settings");
        System.out.println("2. Phone settings");
        System.out.println("3. Security settings");
        System.out.println("4. Restore factory settings");
        System.out.println("5. Back");
        
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Call settings selected");
                break;
            case 2:
                System.out.println("Phone settings selected");
                break;
            case 3:
                System.out.println("Security settings selected");
                break;
            case 4:
                System.out.println("Restore factory settings selected");
                break;
            case 5:
                return;
            default:
                System.out.println("Invalid choice, returning to main menu.");
        }
      } 
}
    
