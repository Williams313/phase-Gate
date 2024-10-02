💥💥💥💥💥💥

Here are five Java interview programs related to Variable Length Argument lists, Command Line Arguments, Class Arrays, Collections, Class ArrayList, Pass By Value, and Pass By Reference:


Variable Length Argument Lists (Varargs)


Varargs allows a method to accept a variable number of arguments.


Program 1: Varargs Example



public class VarargsExample {
    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5);
    }

    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}



Command Line Arguments


Command line arguments are passed to the main method as an array of strings.


Program 2: Command Line Arguments Example



public class CommandLineArgs {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}



Compile and run: java CommandLineArgs arg1 arg2 arg3


Class Arrays


Arrays are fixed-size collections of elements of the same type.


Program 3: Array Example



public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}



Collections and Class ArrayList


ArrayList is a resizable-array implementation of the List interface.


Program 4: ArrayList Example



import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}



Pass By Value vs Pass By Reference


Java is pass-by-value. Primitive types are passed by value, while objects are passed by reference.


Program 5: Pass By Value and Pass By Reference Example



public class PassByValueReference {
    public static void main(String[] args) {
        int x = 10;
        changePrimitive(x);
        System.out.println("Primitive: " + x);

        Dog dog = new Dog("Buddy");
        changeObject(dog);
        System.out.println("Object: " + dog.name);
    }

    public static void changePrimitive(int x) {
        x = 20;
    }

    public static void changeObject(Dog dog) {
        dog.name = "Max";
    }

    static class Dog {
        String name;

        public Dog(String name) {
            this.name = name;
        }
    }
}



Output:



Primitive: 10
Object: Max



Explanation:


- changePrimitive(x) changes the local copy of x, not the original.
- changeObject(dog) changes the original object's name field.


These programs demonstrate the concepts of variable length argument lists, command line arguments, class arrays, collections, class ArrayList, pass by value, and pass by reference in Java.