

public class phaseGateReverseJavaWord {
    public static String reverseWords(String words) {
        String[] wordArray = words.split(" ");
        String reversedWords = "";

        for (int i = wordArray.length - 1; i >= 0; i--) {
            reversedWords += wordArray[i] + " ";
        }

        return reversedWords.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the ball is round"));
    }
}



