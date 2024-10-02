
public class ArraySumAndMin2 {
    public static void main(String[] args) {
        int[] array = {5, 10, 2, 1, 7};
        int[] sums = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length - 1; j++) {
                sum += array[(i + j) % array.length];
            }
            sums[i] = sum;
        }

        System.out.println("Sums:");
        printArray(sums);
        System.out.println("Minimum sum: " + findMin(sums));
        System.out.println("Maximum sum: " + findMax(sums));
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}