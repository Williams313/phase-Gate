def find_even_digit_numbers(start, end):
    even_digit_numbers = []
    for num in range(start, end+1):
        if all(int(digit) % 2 == 0 for digit in str(num)):
            even_digit_numbers.append(str(num))
    return ",".join(even_digit_numbers)


print(find_even_digit_numbers(1000, 3000))



