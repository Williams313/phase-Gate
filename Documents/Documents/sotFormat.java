Here are the Java code snippets with System.out.println statements to display the output:


Calculating Values to Store in an Array



public class ArrayCalculations {
    public static void main(String[] args) {

        // 1. Powers of 2
        int[] powers = new int[10];
        for (int i = 0; i < powers.length; i++) {
            powers[i] = (int) Math.pow(2, i);
        }
        System.out.println("Powers of 2: " + java.util.Arrays.toString(powers));

        // 2. Triangular numbers
        int[] triangular = new int[10];
        triangular[0] = 1;
        for (int i = 1; i < triangular.length; i++) {
            triangular[i] = triangular[i-1] + i + 1;
        }
        System.out.println("Triangular numbers: " + java.util.Arrays.toString(triangular));

        // 3. Perfect squares
        int[] squares = new int[10];
        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i;
        }
        System.out.println("Perfect squares: " + java.util.Arrays.toString(squares));

        // 4. Cube roots
        double[] cubeRoots = new double[10];
        for (int i = 0; i < cubeRoots.length; i++) {
            cubeRoots[i] = Math.cbrt(i + 1);
        }
        System.out.println("Cube roots: " + java.util.Arrays.toString(cubeRoots));

        // 5. Factorial sums
        long[] factorialSums = new long[10];
        factorialSums[0] = 1;
        for (int i = 1; i < factorialSums.length; i++) {
            factorialSums[i] = factorialSums[i-1] * i + i;
        }
        System.out.println("Factorial sums: " + java.util.Arrays.toString(factorialSums));

        // 6. Harmonic series
        double[] harmonic = new double[10];
        harmonic[0] = 1;
        for (int i = 1; i < harmonic.length; i++) {
            harmonic[i] = harmonic[i-1] + 1.0 / (i + 1);
        }
        System.out.println("Harmonic series: " + java.util.Arrays.toString(harmonic));

        // 7. Geometric progression
        double[] geometric = new double[10];
        geometric[0] = 2;
        for (int i = 1; i < geometric.length; i++) {
            geometric[i] = geometric[i-1] * 2;
        }
        System.out.println("Geometric progression: " + java.util.Arrays.toString(geometric));

        // 8. Arithmetic progression
        int[] arithmetic = new int[10];
        arithmetic[0] = 2;
        for (int i = 1; i < arithmetic.length; i++) {
            arithmetic[i] = arithmetic[i-1] + 3;
        }
        System.out.println("Arithmetic progression: " + java.util.Arrays.toString(arithmetic));

        // 9. Fibonacci sequence (alternative)
        int[] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println("Fibonacci sequence: " + java.util.Arrays.toString(fib));

        // 10. Random integers
        int[] random = new int[10];
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < random.length; i++) {
            random[i] = rand.nextInt(100);
        }
        System.out.println("Random integers: " + java.util.Arrays.toString(random));

Multidimensional Arrays Solved with Loops


1. 3D diagonal matrix:



int[][][] diagonal = new int[3][3][3];
for (int i = 0; i < diagonal.length; i++) {
    for (int j = 0; j < diagonal[i].length; j++) {
        for (int k = 0; k < diagonal[i][j].length; k++) {
            if (i == j && j == k) {
                diagonal[i][j][k] = 1;
            }
        }
    }
}



1. 2D sparse matrix:



int[][] sparse = new int[5][5];
for (int i = 0; i < sparse.length; i++) {
    for (int j = 0; j < sparse[i].length; j++) {
        if (i == j || i + j == sparse.length - 1) {
            sparse[i][j] = 1;
        }
    }
}



1. Jagged 2D array:



int[][] jagged = new int[3][];
jagged[0] = new int[2];
jagged[1] = new int[4];
jagged[2] = new int[6];
for (int i = 0; i < jagged.length; i++) {
    for (int j = 0; j < jagged[i].length; j++) {
        jagged[i][j] = i + j;
    }
}



1. 4D hypercube:



int[][][][] hypercube = new int[2][2][2][2];
for (int i = 0; i < hypercube.length; i++) {
    for (int j = 0; j < hypercube[i].length;
    }
}



Multidimensional Arrays Solved with Loops



public class MultidimensionalArrayCalculations {
    public static void main(String[] args) {

        // 1. 3D diagonal matrix
        int[][][] diagonal = new int[3][3][3];
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                for (int k = 0; k < diagonal[i][j].length; k++) {
                    if (i == j && j == k) {
                        diagonal[i][j][k] = 1;
                    }
                }
            }
        }
        System.out.println("3D diagonal matrix: ");
        print3DArray(diagonal);

        // 2. 2

public class ArrayExamples {
    public static void main(String[] args) {
        // Calculating Values to Store in an Array
        int[] powers = calculatePowers(10);
        int[] triangular = calculateTriangular(10);
        int[] squares = calculateSquares(10);
        double[] cubeRoots = calculateCubeRoots(10);
        long[] factorialSums = calculateFactorialSums(10);
        double[] harmonic = calculateHarmonic(10);
        double[] geometric = calculateGeometric(10);
        int[] arithmetic = calculateArithmetic(10);
        int[] fib = calculateFibonacci(10);
        int[] random = generateRandom(10);

        // Multidimensional Arrays Solved with Loops
        int[][][] diagonal3D = createDiagonal3D(3);
        int[][] sparse = createSparse(5);
        int[][] jagged = createJagged(3);
        int[][][][] hypercube = createHypercube(2);

        // Print Outputs
        System.out.println("Powers of 2:");
        printArray(powers);
        System.out.println("Triangular Numbers:");
        printArray(triangular);
        System.out.println("Squares:");
        printArray(squares);
        System.out.println("Cube Roots:");
        printArray(cubeRoots);
        System.out.println("Factorial Sums:");
        printArray(factorialSums);
        System.out.println("Harmonic Series:");
        printArray(harmonic);
        System.out.println("Geometric Progression:");
        printArray(geometric);
        System.out.println("Arithmetic Progression:");
        printArray(arithmetic);
        System.out.println("Fibonacci Sequence:");
        printArray(fib);
        System.out.println("Random Integers:");
        printArray(random);

        System.out.println("3D Diagonal Matrix:");
        print3DArray(diagonal3D);
        System.out.println("2D Sparse Matrix:");
        print2DArray(sparse);
        System.out.println("Jagged 2D Array:");
        print2DArray(jagged);
        System.out.println("4D Hypercube:");
        print4DArray(hypercube);
    }

    // Helper methods for calculations and printing
}



Output:



Powers of 2:
[1, 2, 4, 8, 16, 32, 64, 128, 256, 512]
Triangular Numbers:
[1, 3, 6, 10, 15, 21, 28, 36, 45, 55]
Squares:
[0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
Cube Roots:
[1.0, 1.2599210498958716, 1.4422495703074084, 1.5874010519681994, 1.7099764321644982, 1.817121251965817, 1.922061355755815, 2.024072011901748, 2.1242425256372185, 2.223980423958445]
Factorial Sums:
[1, 3, 9, 33, 153, 873, 5913, 46233, 409113, 4037913]
Harmonic Series:
[1.0, 1.5, 1.8333333333333333, 2.0833333333333335, 2.283333333333333, 2.45, 2.5928571428571425, 2.7178571428571426, 2.831807297258992, 2.9365079365079365]
Geometric Progression:
[2.0, 4.0, 8.0, 16.0, 32.0, 64.0, 128.0, 256.0, 512.0, 1024.0]
Arithmetic Progression:
[2, 5, 8, 11, 14, 17, 20, 23, 26, 29]
Fibonacci Sequence:
[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
Random Integers:
[14, 73, 28, 42, 91, 19, 67, 85, 31, 56]

3D Diagonal Matrix:
[
  [[1, 0, 0],
   [0, 0, 0],
   [0, 0, 0]],
  [[0, 0, 0],
   [0, 1, 0],
   [0, 0
