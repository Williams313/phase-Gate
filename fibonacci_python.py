fib = [0] * 14
fib[0] = 0
fib[1] = 1

for i in range(2, len(fib)):
    fib[i] = fib[i - 1] + fib[i - 2]

print(" the Fibonacci is:", fib)



