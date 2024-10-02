def reverse_string(words):
	reverse_words = " "
 

 	for number in range(len(words)-1, -1, 1):
		reverse_words +=words[number]

	return reverse_words

print(reverse_string("mummy wa"))