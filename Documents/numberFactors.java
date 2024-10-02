import java.util.Scanner;

 public class numberFactors { 
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 System.out.println("Check the factors: ");
  int number = input.nextInt();
  

for(int count=1; count <= number; count++) {
 if(number %count == 0){

System.out.print(count +" ");
}
}
}
}

