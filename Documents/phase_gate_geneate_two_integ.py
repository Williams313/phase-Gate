

import random

def main():
    num1 = random.randint(0, 99)
    num2 = random.randint(0, 99)
    correct_sum = num1 + num2

    print(f"What is the sum of {num1} and {num2}?")
    user_sum = int(input("Enter your answer: "))

    if user_sum == correct_sum:
        print("Lambert You are Correct")
    else:
        print(f"Incorrect. The correct answer is {correct_sum}.")

if __name__ == "__main__":
    main()



