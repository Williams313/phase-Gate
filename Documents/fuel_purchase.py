liter = 855

fuel_purchase = 'true'
while (fuel_purchase):
	user_total_budget = float(input("Enter total price: (or -1 to quit): "))

	if (user_total_budget != -1): 
		
		total_budget = user_total_budget / liter
		print(total_budget)
	else:
		print("Thank you")