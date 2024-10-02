

def main():
    menu = """ 
    1 -> Phone Book 
    2 -> Messages 
    3 -> Chat 
    4 -> Call register 
    5 -> Tone 
    6 -> Setting 
    7 -> Call divert 
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
        elif message_setting_option == 3:
            print("Message validity")

def chat_menu():
    print("Chat feature coming soon!")

def call_register_menu():
    call_register_menu = """ 
    1 -> Missed calls 
    2 -> Received calls 
    3 -> Dialled numbers 
    4 -> Erase recent call lists 
    5 -> Show call duration 
    6 -> Show call costs 
    7 -> Call cost settings 
    8 -> Prepaid credit 
    """
    while True:
        print(call_register_menu)
        call_register_option = int(input("Enter your choice (0 to go back): "))
        if call_register_option == 0:
            break
        elif call_register_option == 1:
            print("Missed calls")
        elif call_register_option == 2:
            print("Received calls")
        elif call_register_option == 3:
            print("Dialled numbers")
        elif call_register_option == 4:
            print("Erase recent call lists")
        elif call_register_option == 5:
            print("Show call duration")
        elif call_register_option == 6:
            print("Show call costs")
        elif call_register_option == 7:
            print("Call cost settings")
        elif call_register_option == 8:
            print("Prepaid credit")

def tone_menu():
    tone_menu = """ 
    1 -> Ringing tone 
    2 -> Ringing volume 
    3 -> Incoming call alert 
    4 -> Composer 
    5 -> Message alert tone 
    6 -> Keypad tones 
    7 -> Warning tones 
    8 -> Vibrating alert 
    9 -> Screen saver 
    """
    while True:
        print(tone_menu)
        tone_option = int(input("Enter your choice (0 to go back): "))
        if tone_option == 0:
            break
        elif tone_option == 1:
            print("Ringing tone")
        elif tone_option == 2:
            print("Ringing volume")
        elif tone_option == 3:
            print("Incoming call alert")
        elif tone_option == 4:
            print("Composer")
        elif tone_option == 5:
            print("Message alert tone")
        elif tone_option == 6:
            print("Keypad tones")
        elif tone_option == 7:
            print("Warning tones")
        elif tone_option == 8:
            print("Vibrating alert")
        elif tone_option == 9:
            print("Screen saver")

def setting_menu():
    setting_menu = """ 
    1 -> Call settings 
    2 -> Phone settings 
    3 -> Security settings 
    4 -> Restore factory settings 
    """
    while True:
        print(setting_menu)
        setting_option = int(input("Enter your choice (0 to go back): "))
        if setting_option == 0:
            break
        elif setting_option == 1:
            call_settings_menu()
        elif setting_option == 2:
            phone_settings_menu()
        elif setting_option == 3:
            security_settings_menu()
        elif setting_option == 4:
            print("Restore factory settings")

def call_settings_menu():
    call_settings_menu = """ 
    1 -> Automatic redial 
    2 -> Speed dialing 
    3 -> Call waiting options 
    4 -> Own number sending 
    5 -> Phone line in use 
    6 -> Automatic answer 
    """
    while True:
        print(call_settings_menu)
        call_settings_option = int(input("Enter your choice (0 to go back): "))
        if call_settings_option == 0:
            break
        elif call_settings_option == 1:
            print("Automatic redial")
        elif call_settings_option == 2:
            print("Speed dialing")
        elif call_settings_option == 3:
            print("Call waiting options")
        elif call_settings_option == 4:
            print("Own number sending")
        elif call_settings_option == 5:
            print("Phone line in use")
        elif call_settings_option == 6:
            print("Automatic answer")

def phone_settings_menu():
    phone_settings_menu = """ 
    1 -> Language 
    2 -> Cell info display 
    3 -> Welcome note 
    4 -> Network selection 
    5 -> Lights 
    6 -> Confirm SIM service actions 
    """
    while True:
        print(phone_settings_menu)
        phone_settings_option = int(input("Enter your choice (0 to go back): "))
        if phone_settings_option == 0:
            break