def only_floats(a , b ):




	if type(a)== float and type(b) == float :
	
		return 2
	
	elif type(a)== float or type(b)== float :

		return 1 

	else:  
		return 0




def main():

	a = input("enter first number ")

	b = input("enter second number ")


		result = only_floats(a, b)
	print("Result", result)

	
if __name__== "__main__":
	main()