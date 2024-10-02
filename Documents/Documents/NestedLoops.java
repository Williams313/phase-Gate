public class NestedLoops{

    public static void main(String[] args) {



String userInput = "*";

for (int count =1; count <= 5; count++ ) {
                 
	for (int counter =1; counter <= count; counter++ ) {

	System.out.print(userInput + " ");

	}System.out.println();
}


for (int count = 1; count< 5; count++ ) {
              
	for (int counter = 4; counter >= count; counter-- ){
System.out.print(userInput + " ");
	

} System.out.println();  
}
}
}


