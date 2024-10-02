


def calculate_investment_value(investment_amount, annual_interest_rate, years):
    monthly_interest_rate = annual_interest_rate / 12
    future_investment_value = investment_amount * (1 + monthly_interest_rate) ** (years * 12)
    return round(future_investment_value, 2)


def main():
    investment_amount = float(input("Enter investment amount: "))
    annual_interest_rate = float(input("Enter annual interest rate (in %): ")) / 100
    years = int(input("Enter number of years: "))

    future_value = calculate_investment_value(investment_amount, annual_interest_rate, years)
    print("Future investment value is:", future_value)


if __name__ == "__main__":
    main()



