public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 6, 7};
        int[] result = new int[2];

	int[] numbers2 = {3, 5, 8, 9, 10};
        int[] result2 = new int[2];


int largest =  numbers[0];
int lowest = numbers [0];

int largest2 = numbers2[0];
int lowest2 =numbers2[0];


for ( int count  = 0; count < 5; count++) {
 if(largest < numbers [count]) largest = numbers [count];
   if (lowest > numbers [count]) lowest = numbers [count];

if (largest2 < numbers2 [count]) largest2 = numbers2 [count];
   if (lowest2 > numbers2 [count]) lowest2 = numbers2 [count];

}
 
result2 [0] = largest;
result2 [1] = lowest;

result [0] = largest2;
result [1] = lowest2;

System.out.println("largest is: " + java.util.Arrays.toString(result));

System.out.print("largest is: " + java.util.Arrays.toString(result2));


}
}
