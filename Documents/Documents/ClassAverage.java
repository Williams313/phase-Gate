import java.util.Scanner;
public class ClassAverage {
 public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int total = 0;
int ageCounter = 1;
while (ageCounter <=2){
 System.out.print("Enter age: "); 
 int age = input.nextInt(); 
 total = total + age; 
ageCounter = ageCounter + 1;
}
int average = total / 2;
System.out.printf("Total of all 2 grades is %d%n ", total); System.out.printf("Class average is %d%n", average);
  }
}