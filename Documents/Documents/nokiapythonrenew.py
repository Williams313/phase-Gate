


def main():
    menu = """ 
    1 -> Phone Book 
    2 -> Messages 
    3 -> Chat 
    4 -> Call register 
    5 -> Tone 
    6 -> Setting 
    7 -> Call diver 
    8 -> Games 
    9 -> Calculator 
    10 -> Reminder 
    11 -> Clock 
    12 -> Profile 
    13 -> Service 
    """
    while True:
        print(menu)
        option = int(input("Enter your choice (0 to exit): "))
        if option == 0:
            break
        elif option == 1:
            phone_book_menu()
        elif option == 2:
            messages_menu()
        elif option == 3:
            chat_menu()
        elif option == 4:
            call_register_menu()
        elif option == 5:
            tone_menu()
        elif option == 6:
            setting_menu()
        elif option == 7:
            call_divert_menu()
        elif option == 8:
            game_menu()
        elif option == 9:
            calculator_menu()
        elif option == 10:
            reminder_menu()
        elif option == 11:
            clock_menu()
        elif option == 12:
            profile_menu()
        elif option == 13:
            sim_service_menu()

def phone_book_menu():
    Phone_Book_menu = """ 
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
    """
    while True:
        print(Phone_Book_menu)
        PhoneBook_option = int(input("Enter your choice (0 to go back): "))
        if PhoneBook_option == 0:
            break
        elif PhoneBook_option == 1:
            print("Search")
        elif PhoneBook_option == 2:
            print("Service Nos")
        elif PhoneBook_option == 3:
            print("Add names")
        elif PhoneBook_option == 4:
            print("Erase")
        elif PhoneBook_option == 5:
            print("Edit")
        elif PhoneBook_option == 6:
            print("Assign tone")
        elif PhoneBook_option == 7:
            print("Send b’card")
        elif PhoneBook_option == 8:
            options_menu()
        elif PhoneBook_option == 9:
            print("Speed dials")
        elif PhoneBook_option == 10:
            print("Voice tags")

def options_menu():
    options_menu = """ 
    1 -> Types of view 
    2 -> Memory status 
    """
    while True:
        print(options_menu)
        options_option = int(input("Enter your choice (0 to go back): "))
        if options_option == 0:
            break
        elif options_option == 1:
            print("Types of view")
        elif options_option == 2:
            print("Memory status")

def messages_menu():
    messages_menu = """ 
    1 -> Write messages 
    2 -> Inbox 
    3 -> Outbox 
    4 -> Picture messages 
    5 -> Templates 
    6 -> Smileys 
    7 -> Message settings 
    8 -> Info service 
    9 -> Voice mailbox number 
    10 -> Service command editor 
    """
    while True:
        print(messages_menu)
        messages_option = int(input("Enter your choice (0 to go back): "))
        if messages_option == 0:
            break
        elif messages_option == 1:
            print("Write messages")
        elif messages_option == 2:
            print("Inbox")
        elif messages_option == 3:
            print("Outbox")
        elif messages_option == 4:
            print("Picture messages")
        elif messages_option == 5:
            print("Templates")
        elif messages_option == 6:
            print("Smileys")
        elif messages_option == 7:
            message_settings_menu()
        elif messages_option == 8:
            print("Info service")
        elif messages_option == 9:
            print("Voice mailbox number")
        elif messages_option == 10:
            print("Service command editor")

def message_settings_menu():
    message_settings_menu = """ 
    1 -> Message centre number 
    2 -> Messages sent as 
    3 -> Message validity 
    """
    while True:
        print(message_settings_menu)
        message_setting_option = int(input("Enter your choice (0 to go back): "))
        if message_setting_option == 0:
            break
        elif message_setting_option == 1:
            print("Message centre number")
        elif message_setting_option == 2:
            print("Messages sent as")






