def find_even_digit_numbers(first_digt, first_digt):
    even_digit_numbers = []
    for num in range(first_digt,last_digt+1):

        if all(int(digit) % 2 == 0 for digit in str(num)):
            even_digit_numbers.append(str(num))
    return ",".join(even_digit_numbers)


print(find_even_digit_numbers(1000, 3000))



