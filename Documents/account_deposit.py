account_balance = 0

deposit_amount = 0



user_input = input("""
Enter option 1 to deposit
2 to Withdraw   
0 to end  :
 """)

while user_input !='0':

	if user_input == '1':

		Deposit_amount = float(input(" deposit an amount :"))

		account_balance += Deposit_amount 
		print("Balance = ", account_balance)

	

	elif user_input == '2':
		Deposit_amount = float(input(" withdraw an amount: "))

		if account_balance < Deposit_amount:
			print("insufficient fund")

 
		else:
			account_balance -= Deposit_amount
	elif user_input == '3':	
		print("account_balance is", account_balance)

  		
	user_input=input("enter option 1 to deposit or 2 to withdraw or 0 to end")











