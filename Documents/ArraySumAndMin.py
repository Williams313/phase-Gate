

    
array = [5, 10, 2, 1, 7]

sums = [
    sum([10, 2, 1, 7]),
    sum([2, 1, 7, 5]),
    sum([1, 7, 5, 10]),
    sum([5, 10, 2, 1]),

]

print("Sums:")
for s in sums:
 	print(s)

min_sum = min(sums)
max_sum = max(sums)

print(f"Minimum sum: {min_sum}")
print(f"Maximum sum: {max_sum}")

