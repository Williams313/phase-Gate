public class Swap {
public static void main(String[] args) {

int [] number = {1, 2, 3, 4, 5, 6};


	int [] result = numberSort(numbers);
System.out.println("output :" + Arrays.toString(result));
 	     
}

public static int [] numberSort(int[] numbers) {

 	for(index = 0; index < number.length - 1; index += 2) {
	int temp = numbers[index];
	numbers[index] = numbers[index + 1];
	numbers[index + 1] = temp;
	}
return numbers;
}
