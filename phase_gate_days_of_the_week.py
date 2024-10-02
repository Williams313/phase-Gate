



def get_day_of_week(day):

    days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]
    return days[day]


def main():
    # Prompt tonEnter todays day of the week when (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    today = int(input("Enter today's day of the week (0-6) when Sunday is (0) and monday is [6]: "))

    # Prompt user for number of days after today
    days_after = int(input("Enter number of days after today: "))

    # Calculate future day of the week
    future_day = (today + days_after) % 7

    # Display future day of the week
    print("Future day of the week:", get_day_of_week(future_day))


if __name__ == "__main__":
    main()



