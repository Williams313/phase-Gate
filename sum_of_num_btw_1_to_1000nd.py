


def sum_of_digits():
    number = int(input("Enter an integer between 0 and 1000: "))
    sum = 0
    while number:
        sum += number % 10
        number //= 10
    print("Sum of digits:", sum)

sum_of_digits()



