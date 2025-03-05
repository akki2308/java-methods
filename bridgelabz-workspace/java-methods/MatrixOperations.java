import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    // Method to generate a random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random values between 0-9
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length, colsA = A[0].length;
        int rowsB = B.length, colsB = B[0].length;
        if (colsA != rowsB) throw new IllegalArgumentException("Matrix multiplication not possible!");

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1])) -
               matrix[0][1] * ((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0])) +
               matrix[0][2] * ((matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0]));
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) throw new ArithmeticException("Matrix is singular, no inverse exists!");

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;

        return inverse;
    }

    // Method to display a 2D double matrix
    public static void displayDoubleMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double num : row) {
                System.out.printf("%.2f\t", num);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matrix Size Input
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Generating Two Matrices
        int[][] matrixA = generateMatrix(rows, cols);
        int[][] matrixB = generateMatrix(rows, cols);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        // Addition
        System.out.println("Matrix Addition:");
        displayMatrix(addMatrices(matrixA, matrixB));

        // Subtraction
        System.out.println("Matrix Subtraction:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        // Multiplication (If valid)
        if (cols == rows) {
            System.out.println("Matrix Multiplication:");
            displayMatrix(multiplyMatrices(matrixA, matrixB));
        }

        // Transpose
        System.out.println("Transpose of Matrix A:");
        displayMatrix(transposeMatrix(matrixA));

        // Determinant (2x2 and 3x3 Only)
        if (rows == 2 && cols == 2) {
            System.out.println("Determinant of Matrix A: " + determinant2x2(matrixA));

            // Inverse (Only for 2x2)
            System.out.println("Inverse of Matrix A:");
            displayDoubleMatrix(inverse2x2(matrixA));
        } else if (rows == 3 && cols == 3) {
            System.out.println("Determinant of Matrix A: " + determinant3x3(matrixA));
        } else {
            System.out.println("Determinant & Inverse calculations only for 2x2 or 3x3 matrices.");
        }

        scanner.close();
    }
}