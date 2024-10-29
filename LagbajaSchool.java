import java.util.Scanner;
import java.util.Arrays;


public class LagbajaSchool {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.print("hi Teacher pls enter the number of your Students: ");
        int numStudents = scanner.nextInt();
        System.out.print("Good also enter number of subjects: ");
        int numSubjects = scanner.nextInt();
	scanner.nextLine();
System.out.println(" ****************************************************");
System.out.println(" YOUR STUDENTS NUM AND SUBJECTS ARE SAVED Successfully**");
System.out.println(" ****************************************************");
   
  String[] subjectNames = new String[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
System.out.print("Enter name for subject " + (i + 1) + ": ");
            subjectNames[i] = scanner.nextLine();
        }

      
        Student[] students = new Student[numStudents];
        for (int i = 0; i < numStudents; i++) {
System.out.print("Enter Student " + (i + 1) + " name: ");
            String studentName = scanner.next();

            double[] scores = new double[numSubjects];
            for (int j = 0; j < numSubjects; j++) {
                while (true) {
System.out.print("Enter score for " + subjectNames[j] + " (0-100): ");
                    scores[j] = scanner.nextDouble();
                    if (scores[j] >= 0 && scores[j] <= 100) {
                        break;
                    }
System.out.println("Invalid score. Please enter a score between 0 and 100.");
                }
            }

            students[i] = new Student(studentName, scores);
        }

        
        Arrays.sort(students, (a, b) -> Double.compare(b.average, a.average));

        
        displaySummary(students, subjectNames);
        scanner.close();
    }

    static class Student {
      String name;
      double[] scores;
        double total;
        double average;

        Student(String name, double[] scores) {
          this.name = name;
           this.scores = scores;
          this.total = Arrays.stream(scores).sum();
            this.average = total / scores.length;
    }
    }

    static void displaySummary(Student[] students, String[] subjectNames) {
        System.out.println("*******************************************************");
        System.out.printf("%-10s", "STUDENT");
        for (String subject : subjectNames) {
         System.out.printf("%-10s", subject);
  }
       System.out.println(" Total    Average    Position ");        
       System.out.println("********************************************************");
	
	 //for (int i = 0; i < students.length; i++) {
            System.out.printf("%-15s", students[i].name);
            //for (double score : students[i].scores) {
                System.out.printf("%-10.0f", score);
            }
            System.out.printf("%-10.0f %-10.2f %-10d%n", students[i].total, students[i].average, i + 1);
        }

        System.out.println("====================================================");
    }
}


