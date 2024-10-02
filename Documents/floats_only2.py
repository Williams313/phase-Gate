


def check_floats():
    A = input("Enter first value: ")
    B = input("Enter second value: ")

    is_A_float = False
    is_B_float = False

    try:
        float_A = float(A)
        is_A_float = True
    except ValueError:
        pass

    try:
        float_B = float(B)
        is_B_float = True
    except ValueError:
        pass

    if is_A_float and is_B_float:
        return 2
    elif is_A_float or is_B_float:
        return 1
    else:
        return 0


if __name__ == "__main__":
    result = check_floats()
    print("Result:", result)



