public class phaseGateSquareWithoutFunction {
    public static int[] squareArray (int [] arr) {

	int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 9};
        int[] squaredArray = squareArray(array);
        for (int i : squaredArray) {
            System.out.print(i + " ");
        }
    }
}


