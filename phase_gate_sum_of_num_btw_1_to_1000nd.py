


def sum_of_digits():
    number = int(input("Enter an integer between 0 and 1000: "))
    sum = 0
    while number:
        sum += number % 10
        number //= 10 
    print("Sum of digits:", sum)

sum_of_digits()








def find_even_digit_numbers(start, end):
    even_digit_numbers = []
    for num in range(start, end+1):
        if all(int(digit) % 2 == 0 for digit in str(num)):
            even_digit_numbers.append(str(num))
    return ",".join(even_digit_numbers)


print(find_even_digit_numbers(1000, 3000))



 

import random
import functools


numbers = [random.randint(1, 50) for _ in range(10)]
print("List of 10 random numbers:", numbers)

def get_length(lst):
    count = 0
    for _ in lst:
        count += 1
    return count

length_of_list = get_length(numbers)
print("Length of the list:", length_of_list) 

sum_even_positions = sum(numbers[i] for i in range(0, length_of_list, 2))
print("Sum of elements at even positions:", sum_even_positions)


sum_odd_positions = sum(numbers[i] for i in range(1, length_of_list, 2))
print("Sum of elements at odd positions:", sum_odd_positions)

product_third_positions = functools.reduce(lambda x, y: x * y, numbers[2::3])
print("Product of elements at every third position:", product_third_positions)

average = sum(numbers) / length_of_list
print("Average of all elements:", average)   










def reverse(number):
    """
    Return the reversal of an integer.
    
    Args:
    number (int): The input integer.
    
    Returns:
    int: The reversed integer.
    """
    sign = -1 if number < 0 else 1
    number = abs(number)
    reversed_number = 0
    while number > 0:
        reversed_number = reversed_number * 10 + number % 10
        number //= 10
    return sign * reversed_number


def is_palindrome(number):
    """
    Return True if number is a palindrome.
    
    Args:
    number (int): The input integer.
    
    Returns:
    bool: True if the number is a palindrome, False otherwise.
    """
    return number == reverse(number)









import math

def divide_or_square(number):
    # Check if the input is a valid positive integer or zero
    if not isinstance(number, (int, float)):
        return "Input must be a number."
    if number < 0:
        return "Input should not be a negative number."

    # Check if the number is divisible by 5
    if number % 5 == 0:
        return round(math.sqrt(number), 2)  # Return the square root rounded to 2 decimal places
    else:
        return number % 5  # Return the remainder of the division by 5





