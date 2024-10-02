


def main_menu():
    menu = """
    1 -> Phone Book
    2 -> Messages
    3 -> Chat
    4 -> Call register
    5 -> Tone
    6 -> Settings
    7 -> Call divert
    8 -> Games
    9 -> Calculator
    10 -> Reminder
    11 -> Clock
    12 -> Profile
    13 -> Service
    0 -> Exit
    """
    return int(input(menu))

def phone_book_menu():
    menu = """
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
    0 -> Back
    """
    return int(input(menu))

def messages_menu():
    menu = """
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
    0 -> Back
    """
    return int(input(menu))

def call_register_menu():
    menu = """
    1 -> Missed calls
    2 -> Received calls
    3 -> Dialled numbers
    4 -> Erase recent call lists
    5 -> Show call duration
    6 -> Show call costs
    7 -> Call cost settings
    8 -> Prepaid credit
    0 -> Back
    """
    return int(input(menu))

def tones_menu():
    menu = """
    1 -> Ringing tone
    2 -> Ringing volume
    3 -> Incoming call alert
    4 -> Composer
    5 -> Message alert tone
    6 -> Keypad tones
    7 -> Warning tone
    8 -> Vibrating alert
    9 -> Screen saver
    0 -> Back
    """
    return int(input(menu))

def settings_menu():
    menu = """
    1 -> Call settings
    2 -> Phone settings
    3 -> Security settings
    4 -> Restore factory settings
    0 -> Back
    """
    return int(input(menu))

def call_divert_menu():
    menu = """
    1 -> Automatic redial
    0 -> Back
    """
    return int(input(menu))

def games_menu():
    menu = """
    1 -> Games
    0 -> Back
    """
    return int(input(menu))

def calculator_menu():
    menu = """
    1 -> Calculator
    0 -> Back
    """
    return int(input(menu))

def reminder_menu():
    menu = """
    1 -> Reminder
    0 -> Back
    """
    return int(input(menu))

def clock_menu():
    menu = """
    1 -> Alarm clock
    2 -> Clock settings
    3 -> Date setting
    4 -> Stopwatch
    5 -> Countdown timer
    6 -> Auto update of date and time
    0 -> Back
    """
    return int(input(menu))

def profile_menu():
    menu = """
    1 -> Profile
    0 -> Back
    """
    return int(input(menu))

def service_menu():
    menu = """
    1 -> SIM service
    0 -> Back
    """
    return int(input(menu))

def main():
    while True:
        option = main_menu()
        if option == 1:
            while True:
                phone_book_option = phone_book_menu()
                if phone_book_option == 0:
                    break
                elif phone_book_option == 1:
                    print("Search")
                # Add other cases as needed...
        elif option == 2:
            while True:
                messages_option = messages_menu()
                if messages_option == 0:
                    break
                elif messages_option == 1:
                    print("Write messages")
                # Add other cases as needed...
        elif option == 3:
            print("Chat")
        elif option == 4:
            while True:
                call_register_option = call_register_menu()
                if call_register_option == 0:
                    break
                elif call_register_option == 1:
                    print("Missed calls")
        elif option == 5:
            while True:
                tones_option = tones_menu()
                if tones_option == 0:
                    break
                elif tones_option == 1:
                    print("Ringing tone")
                # Add other cases as needed...
        