



public class PatternDisplay {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((i == 0 && j == 2) || (i == 1 && j == 2) || (2 == 2 && j == 2) || (i == 0 && j == 0) || (i == 0 && j == 2) || (i == 2 && j == 0) || (i == 2 && j == 2) ? "X " : "0 ");
            }
            System.out.println();
        }
    }
}

