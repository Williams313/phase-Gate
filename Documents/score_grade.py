def collct_scores():

	score = 0

	score_grade = 0

	score_input = float(input("Enter score of students"))


	while score_input != -1:
	
		score_input = float(input("Enter -1 to quit"))
		if score_input >= 0 and score_input <= 100: 
			score =+ score_grade
			score_grade+=1
		
		else:

			average_score = score / score_grade
			print("average_score is", average_score)

collct_scores()