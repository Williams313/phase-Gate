import java.util.Scanner;
    public class NokiaPhoSa {
    public static void main(String[] lambert) {
Scanner input = new Scanner(System.in);



System.out.println( """

WELCOME TO NOKIA 3310...

please enter your prfered choice..

***************************

1 ->Phone Book
2 ->Messages
3 ->Chat
4->Call register
5 ->Tone
6->Setting
7 ->Call diver
8->Games
9 ->Calculator
10-Reminder
11 -Clock
12->Profile
13 ->Sim Service

""");

 int mainMenu = input.nextInt();

              switch (mainMenu) {
                case 1: 
                    phoneBook(input);
                    break;
               case 2:
                    messages(input);
                    break;
                case 3:
                    chat();
                    break;
                 case 14:
            System.out.println("Exiting...");
                return;
 System.out.println("Invalid option. Please try again.");
                mainMenu(input);
               mainMenu(input);


    
}
}

int mainMenu = input.nextInt();
switch (mainMenu) {
case 1: {
     
System.out.println( """

     PhoneBook
  
1 -> Search
2 -> Service Nos
3 -> Add names
4 -> Erase
5 -> Edit
6 -> Assign tone
7 -> Send b’card
8 -> Options
9 -> Speed dials
10 -> Voice tags

Sellect other options in 8
 
""");

int optionsEightInPhonBook = input.nextInt();

switch (optionsEightInPhonBook) {
case 8: {
System.out.print("""

1-> Type of view
2-> Memory status
""");

int MainMessages = input.nextInt();

switch (MainMessages) {
 case 2: 

System.out.println( """
     Messages 
1-> Write messages
2-> Inbox
3-> Outbox
4-> Picture messages
5-> Templates
6-> Smileys
7-> Message settings
8-> Info service
9-> Voice mailbox number
10-> Service command editor

Sellect other options in 
 
""" );
}
}
}
}
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

        if (messagesChoice == 7) {
            System.out.println("Message settings");
            System.out.println("1. Message center number");
            System.out.println("2. Messages sent as");
            System.out.println("3. Message validity");
            System.out.println("4. Back");
            int messageSettingChoice = input.nextInt();

            if (messageSettingChoice == 1) {
                System.out.println("Message center number");
            } else if (messageSettingChoice == 2) {
                System.out.println("Messages sent as");
            } else if (messageSettingChoice == 3) {
                System.out.println("Message validity");
            } else if (messageSettingChoice == 4) {
                messages(input);
            }
        } else if (messagesChoice == 11) {
            return;
        } else {
            // handle other messages options here
        }
    }

    public static void callRegister(Scanner input) {
        System.out.println("Call register");
        System.out.println("1. Missed calls");
        System.out.println("2. Received calls");
        System.out.println("3. Dialled numbers");
        System.out.println("4. Erase recent call lists");
        System.out.println("5. Show call duration");
        System.out.println("6. Last call duration");
        System.out.println("7. Call cost settings");
        System.out.println("8. Prepaid credit");
        System.out.println("9. Back");
        int callRegisterChoice = input.nextInt();

        if (callRegisterChoice == 5) {
            System.out.println("Show call duration");
            System.out.println("1. Last call duration");
            System.out.println("2. All calls’ duration");
            System.out.println("3. Received calls’ duration");
            System.out.println("4. Dialled calls’ duration");
            System.out.println("5. Clear timers");
            System.out.println("6. Back");
            int showCallDurationChoice = input.nextInt();

            if (showCallDurationChoice == 1) {
                System.out.println("Last call duration");
            } else if (showCallDurationChoice == 6) {
                callRegister(input);
            }
        } else if (callRegisterChoice == 9) {
            return;
        } else {
            // handle other call register options here
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
        int tonesChoice = input.nextInt();

        if (tonesChoice == 10) {
            return;
        } else {
            // handle other tones options here
        }
    }

    public static void settings(Scanner input) {
        System.out.println("Settings");
        System.out.println("1. Call settings");
        System.out.println("2. Phone settings");
        System.out.println("3. Security settings");
        System.out.println("4. Restore factory settings");
        System.out.println("5. Back");
        int settingsChoice = input.nextInt();

        if (settingsChoice == 5) {
            return;
        } else {
            // handle other settings options here
        }
    }

    public static void callDivert() {
        System.out.println("Call divert");
        // Add logic for Call Divert
    }

    public static void games(Scanner input) {
        System.out.println("Games");
        // Add logic for Games
    }

    public static void calculator() {
        System.out.println("Calculator");
        // Add logic for Calculator
    }

    public static void reminders(Scanner input) {
        System.out.println("Reminders");
        // Add logic for Reminders
    }

    public static void clock(Scanner input) {
        System.out.println("Clock");
        System.out.println("1. Alarm Clock");
        System.out.println("2. Clock setting");
        System.out.println("3. Date setting");
        System.out.println("4. Stopwatch");
        System.out.println("5. Countdown timer");
        System.out.println("6. Auto update of date and time");
        System.out.println("7. Back");
        int clockChoice = input.nextInt();

        if (clockChoice == 7) {
            return;
        } else {
            // handle other clock options here
        }
    }

    public static void profiles(Scanner input) {
        System.out.println("Profiles");
        // Add logic for Profiles
    }

    public static void simServices(Scanner input) {
        System.out.println("SIM Services");
        // Add logic for SIM Services
    }
}

