import math

def divide_or_square(number):
     
    if not isinstance(number, (int, float)):
        return "Input must be a number."
    if number < 0:
        return "Input should not be a negative number."

    
    if number % 5 == 0:
        return round(math.sqrt(number), 2) 

    else:
        return number % 5 

print(divide_or_square(50))
