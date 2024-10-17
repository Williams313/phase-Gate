
def check_floats():
    A = input("Enter first value: ")
    B = input("Enter second value: ")

    try:
        float(A)
        float(B)
        return 2
    except ValueError:
        try:
            float(A)
            return 1
        except ValueError:
            try:
                float(B)
                return 1
            except ValueError:
                return 0





if __name__ == "__main__":
    result = check_floats()
    print("Result:", result)



