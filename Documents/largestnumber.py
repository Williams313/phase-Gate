largest = 0
def maximum (first_num, second_num, third_num):
	
	if first_num > second_num:
		largest = first_num

else: 	
	largest = second_num

if third_num > largest:
	 
	largest = third_num
	return largest

print(maximum(2,5,6))