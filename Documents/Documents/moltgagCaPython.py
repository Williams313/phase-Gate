def calculate_monthly_payment(principal, annual_interest_rate, years): 
   	 monthly_interest_rate = annual_interest_rate / 1200
   	 number_of_payments = years * 12

    		 monthly_payment = principal * (monthly_interest_rate * (1 + 	monthly_interest_rate) ** number_of_payments) / ((1 + monthly_interest_rate) ** number_of_payments - 1)
    		return monthly_payment

def main():
   	 principal = float(input("Enter the principal amount: "))

    	annual_interest_rate = float(input("Enter the annual interest rate (in %): ")) / 100

   	 years = int(input("Enter the duration in years: "))

    monthly_payment = calculate_monthly_payment(principal, annual_interest_rate, years)

    	print("Monthly payment: ", round(monthly_payment, 2))

