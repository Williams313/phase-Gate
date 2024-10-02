

def maximum (first_num, second_num, third_num):
	biggest = 0
	if first_num > second_num:
		biggest = first_num
	else:
		biggest = second_num
	if third_num > biggest :
		biggest = third_num
	return biggest

print(maximum(2,4,6))