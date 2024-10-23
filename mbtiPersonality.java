
import java.util.Scanner;

public class mbtiSureTest {
    private static Scanner input = new Scanner(System.in);
    private static String name;
    private static int[] scores = new int[4];

    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        name = input.nextLine();
        displayQuestionAndResult();
    }

    public static void displayQuestionAndResult() {
        String[][] questions = {
            {"A. Expend energy, enjoy groups", "B. Conserve energy, enjoy one-on-one"},
            {"A. Interpret literally", "B. Look for meaning and possibilities"},
            {"A. Logical, thinking, questioning", "B. Empathetic, feeling, accommodating"},
            {"A. Organized, orderly", "B. Flexible, adaptable"},
            {"A. More outgoing, think out loud", "B. More reserved, think to yourself"},
            {"A. Practical, realistic, experiential", "B. Imaginative, innovative, theoretical"},
            {"A. Candid, straight-forward, frank", "B. Tactful, kind, encouraging"},
            {"A. Plan, schedule", "B. Unplanned, spontaneous"},
            {"A. Seek many tasks, public activities, interaction with others", "B. Seek private, solitary activities with quiet to concentrate"},
            {"A. Standard, usual, conventional", "B. Different, novel, unique"},
            {"A. Firm, tend to criticize, hold the line", "B. Gentle, tend to appreciate, conciliate"},
            {"A. Regulated, structured", "B. Easy-going, live and let live"},
            {"A. External, communicative, express yourself", "B. Internal, reticent, keep to yourself"},
            {"A. Focus on here-and-now", "B. Look to the future, global perspective, big picture"},
            {"A. Tough-minded, just", "B. Tender-hearted, merciful"},
            {"A. Preparation, plan ahead", "B. Go with the flow, adapt as you go"},
            {"A. Active, initiate", "B. Reflective, deliberate"},
            {"A. Facts, things, what is", "B. Ideas, dreams, \"what could be\", philosophical"},
            {"A. Matter of fact, issue-oriented", "B. Sensitive, people-oriented, compassionate"},
            {"A. Control, govern", "B. Latitude, freedom"}
        };

        int[] extrovertIntrovert = new int[2];
        int[] sensingIntuitive = new int[2];
        int[] thinkingFeeling = new int[2];
        int[] judgingPerceptive = new int[2];

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i][0] + "\t\t" + questions[i][1]);
            String answer = input.next().toUpperCase();
            while (!answer.equals("A") && !answer.equals("B")) {
                System.out.println("Invalid input. Please enter A or B.");
                answer = input.next().toUpperCase();
            }

            // Update scores based on answer
            if (i % 4 == 0) {
                if (answer.equals("A")) {
                    extrovertIntrovert[0]++;
                } else {
                    extrovertIntrovert[1]++;
                }
            } else if (i % 4 == 1) {
                if (answer.equals("A")) {
                    sensingIntuitive[0]++;
                } else {
                    sensingIntuitive[1]++;
                }
            } else if (i % 4 == 2) {
                if (answer.equals("A")) {
                    thinkingFeeling[0]++;
                } else {
                    thinkingFeeling[1]++;
                }
            } else {
                if (answer.equals("A")) {
                    judgingPerceptive[0]++;
                } else {
                    judgingPerceptive[1]++;
                }
            }
        }

        // Determine MBTI type based on scores
        String mbtiType = "";
        mbtiType += extrovertIntrovert[0] > extrovertIntrovert[1] ? "E" : "I";
        mbtiType += sensingIntuitive[0] > sensingIntuitive[1] ? "S" : "N";
        mbtiType += thinkingFeeling[0] > thinkingFeeling[1] ? "T" : "F";
        mbtiType += judgingPerceptive[0] > judgingPerceptive[1] ? "J" : "P";

        System.out.println("Hello " + name + ", your MBTI type is: " + mbtiType);

        // Display MBTI type description
        switch (mbtiType) {
                           

            case "ISTJ":
                System.out.println("You are an Independent and Practical Individualist.");
                break;
            case "ISFJ":
                System.out.println("You are a Supportive and Loyal Partner.");
                break;
            case "INFJ":
                System.out.println("You are an Innovative and Charismatic Leader.");
                break;
            case "INTJ":
                System.out.println("You are a Strategic and Independent Thinker.");
                break;
            case "ISTP":
                System.out.println("You are a Resourceful and Flexible Problem-Solver.");
                break;
            case "ISFP":
                System.out.println("You are an Artistic and Compassionate Individual.");
                break;
            case "INFP":
                System.out.println("You are an Idealistic and Creative Visionary.");
                break;
            case "INTP":
                System.out.println("You are a Logical and Innovative Theorist.");
                break;
            case "ESTP":
                System.out.println("You are an Adventurous and Action-Oriented Entrepreneur.");
                break;
            case "ESFP":
                System.out.println("You are a Spontaneous and Entertaining Performer.");
                break;
            case "ENFP":
                System.out.println("You are a Charismatic and Imaginative Communicator.");
                break;
            case "ENTP":
                System.out.println("You are an Innovative and Strategic Thinker.");
                break;
            case "ESTJ":
                System.out.println("You are a Practical and Decisive Leader.");
                break;
            case "ESFJ":
                System.out.println("You are a Supportive and Organized Partner.");
                break;
            case "ENFJ":
                System.out.println("You are a Charismatic and Empathetic Leader.");
                break;
            case "ENTJ":
                System.out.println("You are a Confident and Strategic Leader.");
                break;
            default:
                System.out.println("Your MBTI type is not recognized.");
        }
    }
}


