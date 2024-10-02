import java.util.Scanner;
    public class NokiaPhone {
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
                    phoneBook();
                    break;
               case 2:
                    messages();
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
}
}
}
public void phoneBook(){
	


