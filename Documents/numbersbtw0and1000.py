def process_number(num):
    if num < 1 or num > 999:
        return "Invalid input"
    digits = [int(d) for d in str(num)]
    if all(d % 2 == 0 for d in digits):
        return "Even: " + str(sum(digits))
    elif all(d % 2 != 0 for d in digits):
        return "Odd: " + str(digits[0] - sum(digits[1:]))
    else:
        return "Mixed"

print(process_number(int(input("Enter a number: "))))


