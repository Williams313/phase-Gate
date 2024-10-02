import java.util.Scanner;
public class numberOneToTen {
  public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print(" Enter a number from 1 to 10 :");
int number = input.nextInt();

String[] words ={"Zero", "One", "Two", "Three", "Four", "Five","Six", "Seven","Eight", "Nine", "Ten"};
if(number >= 1 && number <= 10) {  
System.out.println(words [number]);
} else {
System.out.print("invalid input. pls enter numb from 1 to 1o");
}
}
}