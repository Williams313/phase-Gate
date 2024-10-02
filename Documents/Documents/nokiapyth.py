 

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

option = int(input(menu))

# Phone Book Menu
if option == 1:
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

Click 1 to 10 for any option OR
Select 8 for other options
then click 1 or 2 for other options of 8
"""
    PhoneBook_option = int(input(Phone_Book_menu))

    if PhoneBook_option == 1:
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
        print("You just chose Options")
        # Adding nested options for the "Options" menu
        sub_option = int(input("Select 1 for 'Types of view' or 2 for 'Memory status': "))
        if sub_option == 1:
            print("Types of view")
        elif sub_option == 2:
            print("Memory status")
    elif PhoneBook_option == 9:
        print("Speed dials")
    elif PhoneBook_option == 10:
        print("Voice tags")

# Messages Menu
elif option == 2:
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

Click 1 to 10 for any option OR
Select 7 for other options
then click 1, 2, or 3, for other options of 7
"""
    messages_option = int(input(messages_menu))

    if messages_option == 1:
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
        print("Message settings")
        message_setting_option = int(input("Select 1 for 'Message centre number', 2 for 'Messages sent as', or 3 for 'Message validity': "))
        if message_setting_option == 1:
            print("Message centre number")
        elif message_setting_option == 2:
            print("Messages sent as")
        elif message_setting_option == 3:
            print("Message validity")
    elif messages_option == 8:
        print("Info service")
    elif messages_option == 9:
        print("Voice mailbox number")
    elif messages_option == 10:
        print("Service command editor")


# chat Menu
if option == 3:
    chat_menu = """
    1 -> chat

"""

#  call_register_Menu
elif option == 4:
    call_register_menu = """
    1 -> Missed calls
    2 -> Received calls
    3 -> Dialled numbers
    4 -> Erase recent call lists
    5 ->  Show call duration
    6 -> Show call costs
    7 -> Call cost settings
    8 -> Prepaid credit
   
Click 1 to 10 for any option OR
Select (5:,6:,7,): for other options
then click 1, 2, or 3, sub options
"""
call_register_option = int(input(call_register_menu))

if call_register_option == 1:
        print(" Missed calls")
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
        show_call_costs_option = int(input("""
	Select  1 :'last call cost',
	 	2:'All cost cost', 
	 	3: Clear counters """))
if show_call_costs_option == 1:
         print("Last call duration")
elif call_register_option == 2:
         print("All calls’ duration as")
elif call_register_option == 3:
         print("Received calls’ duration")
elif call_register_option == 7:
        print("Call cost settings")
        call_cost_setting_option = int(input("""
	Select 1'call cost limit',
 	2'Show call costs',: """))
if call_cost_setting_option == 1:
         print("Call cost limit")  
elif call_cost_setting_option == 2:
         print("Show call costs")






# Tone Menu
if option == 5:
  	Tones_menu = """
    	1 -> Ringing tone
   	2 -> Ringing volume
    	3 -> Incoming call alert
	4 -> Composer
	5 -> Message alert tone
 	6 -> Keypad tones
	7 -> Keypad tones
	8 -> Keypad tones
	9 -> Keypad tones




Click 1 to 10 for any option OR
Select 7 for other options
then enter  1, 2, or 3, for other options of 7
"""
tone_option = int(input(tone_menu))






if tone_option == 1:
        print("Ringing tone")                                                                       elif tone_option == 2:
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
        print("warning tone")
elif tone_option == 8:
        print("vibrating alert")
elif tone_option == 9:
        print("screen saver")
   

# settings Menu
elif settings_options == 6:
    call_settings_menu = """
    1 -> Authomatic redial
    2 -> speed dialing
    3 -> Call waiting options
    4 -> Own number sending
    5 -> Phone line in use
    6 -> Automatic answer 1
    

Click 1 to 10 for any option OR
Select 7 for other options
then click 1, 2, or 3, for other options of 7
"""
    settings_option = int(input(settings_menu))

    if settings_option == 1:
        print("Call settings")
if Call settings_option == 1:
	print("Phone line in use")
    elif Call settings_option == 2:
        print("Automatic redial")
    elif Call settings_option == 3:
        print("Call waiting options")
    elif Call settings_option == 4:
        print("Own number sending")
    elif Call settings_option == 5:
        print("Phone line in use")
    elif Call settings_option == 6:
        print("Automatic answer 1")                                  if setting_option == 2:
           print("Phone setting")
    elif message_setting_option == 1:
	   print(" Language")	                                                
    elif message_setting_option == 2:
            print("Cell info display")
    elif message_setting_option == 3:
            print("3. Welcome note")
    elif messages_option == 4:
        print(". Network selection")
    elif messages_option == 5:
        print(" Lights2")
    elif messages_option == 6:
        print(" Confirm SIM service actions")

if setting_option == 3:
          print("Security settings")
    elif Security_setting_option == 1:
	  print(" PIN code request")	                                                
    elif Security_setting_option == 2:
          print("Call barring service")
    elif Security_setting_option == 3:
          print("Fixed dialling")
    elif Security_option == 4:
          print("Closed user group")
    elif Security_option == 5:
          print("Phone security")
    elif Security_option == 6:
          print("Change access codes")

if setting_option == 4:
           print(" Restore factory settings")

# call divert_Menu
if options == 7:
    call_settings_menu = """
    1 -> Authomatic redial
""";
options_option = int(input(call_menu))

if call_divert_option == 6:
        print("Call divert")



# Game_Menu
if options == 8:
    game_menu = """
    1 -> games
""";
game_option = int(input(game_menu))


if game_Caculator_options == 1:
        print("Call divert")


# Caculator_Menu
if options == 9:
    calculator_menu = """
    1 -> Calculator
""";
calculator_option = int(input(calculator_menu))


if calculator_option == 1:
        print("Caculator")


# Reminder_Menu
if options == 10:
    reminder_menu = """
    1 -> reminder
""";
reminder_option = int(input(reminder_menu))

if reminder_option == 1:
       print("reminder")


# clock Menu
if option == 1:
    clock_menu = """
    1 ->  Alarm clock
    2 -> Clock settings
    3 -> Date setting
    4 -> Stopwatch
    5 ->  Countdown timer
    6 -> Auto update of date and time
    

 clock_option = int(input(clock_menu))

    if clock_option == 1:
        print("Alarm clock")
    elif clock_option == 2:
        print(" Clock settings")
    elif clock_option == 3:
        print("Date setting")
    elif clock_option == 4:
        print("Stopwatch")
    elif clock_option == 5:
        print("Stopwatch")
    elif clock_option == 6:
	print("Stopwatch")









# Profile_Menu
if option == 12:
    profile_menu = """
    1 -> profile
""";
if profile_option ==1:
        print("profile")




# Sim service_Menu
if option == 12:
    sim_service_menu = """
    1 -> Sim service
""";
if sim_service_option ==1:
        print("Sim service")











