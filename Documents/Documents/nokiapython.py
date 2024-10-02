menu = """

	1 ->Phone Book
	2 ->Messages
	3 ->Chat
	4->Call register
	5 ->Tone
	6->Setting
	7 ->Call diver
	8->Games
	9 ->Calculator
	10->Reminder
	11 -Clock
	12->Profile
	13 ->Service

"""



option = int(input(menu))

if option == 1:

	Phone_Book_menu= """
  
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
             
click 1 to 10 for any otion OR
Select 8 for other options
 then click 1 or 2 for other options of 8

"""

PhoneBook_option = int(input(Phone_Book_menu))
if PhoneBook_option ==1:
	print("search")
elif  PhoneBook_option==2:
	print("Service Nos")
elif  PhoneBook_option==3:
	print("Add names")
elif  PhoneBook_option==4:
	print("erase")
elif  PhoneBook_option==5:
	print("Edit")
elif  PhoneBook_option==6:
	print("Assign tone")
elif  PhoneBook_option==7:
	print("Send b’card")
elif PhoneBook_option==8:
	print("you just chose Options")
elif PhoneBook_option==9:
	print("Speed dials")
elif  PhoneBook_option==10:
	print("Voice tags")



PhoneBook_options = int(input(Phone_Book_menu))
if PhoneBook_options ==1:
	print("Types of view")
if PhoneBook_options ==2:
	print("Memory status")




messages = int(input(menu))



if messages  == 2:

	messages_menu= """
  
	1 -> Write messages
	2 -> Inbox
	3 -> Outbox
	4 -> Picture messages
	5 -> Templates
	6 -> Smileys
	7 -> Message settings
	8 -> Info service
	9 -> Voice mailbox number
	10 ->Service command editor

             
click 1 to 10 for any option OR
Select 7 for other options
 then click 1, or 2, or 3, for other options of 7

"""

messages_option = int(input(messages_menu))
if messages_options ==1:
	print("Write messages")
elif  messages_option ==2:
	print("Inbox")
elif  messages_option ==3:
	print("Outbox")
elif  messages_option ==4:
	print("Picture messages")
elif  PhoneBook_option ==5:
	print(" Templates")
elif  messages_option ==6:
	print("Smileys")
elif  messages_option ==7:
	print("Message settings")
elif messages_option ==8:
	print("Info service")
elif messages_option ==9:
	print("Voice mailbox number")
elif  messages_option ==10:
	print("Service command editor")



messages_Messagesettings = int(input(messages_menu))
if messages_Messagesettings ==1:
	print("Message centre number")
if messages_Messagesettings==2:
	print("Messages sent as")
if messages_Messagesettings ==3:
	print("Message centre number")


messages_common  = int(input(messages_menu))
if messages_Messagesettings ==1:
	print("Delivery reports")
if messages_Messagesettings==2:
	print("Reply via same centre")
if messages_Messagesettings ==3:
	print("Message centre number")



