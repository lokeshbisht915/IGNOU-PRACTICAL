import java.util.Scanner;
import java.util.InputMismatchException;

class Matrix {
    private int[][] matrix;
    private int rows;
    private int cols;

    // Constructor to initialize matrix with rows and columns
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    // Method to take input from user
    public void inputMatrix(Scanner sc) {
        System.out.println("Enter elements for a " + rows + "x" + cols + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                try {
                    matrix[i][j] = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter integers only.");
                    sc.next(); // Clear invalid input
                    j--; // Retry this position
                }
            }
        }
    }

    // Getter for matrix
    public int[][] getMatrix() {
        return matrix;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    // Static method to multiply two matrices
    public static Matrix multiply(Matrix a, Matrix b) throws Exception {
        if (a.getCols() != b.getRows()) {
            throw new Exception("Matrix multiplication not possible. Column of A must equal row of B.");
        }

        Matrix result = new Matrix(a.getRows(), b.getCols());

        int[][] matA = a.getMatrix();
        int[][] matB = b.getMatrix();
        int[][] matR = result.getMatrix();

        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < b.getCols(); j++) {
                matR[i][j] = 0;
                for (int k = 0; k < a.getCols(); k++) {
                    matR[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }

        return result;
    }

    // Method to print matrix
    public void printMatrix() {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input for first matrix
            System.out.print("Enter rows and columns for Matrix A: ");
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            Matrix A = new Matrix(r1, c1);
            A.inputMatrix(sc);

            // Input for second matrix
            System.out.print("Enter rows and columns for Matrix B: ");
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            Matrix B = new Matrix(r2, c2);
            B.inputMatrix(sc);

            // Multiply matrices
            Matrix result = Matrix.multiply(A, B);

            // Print result
            System.out.println("Result of Matrix Multiplication:");
            result.printMatrix();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();  // Close scanner
        }
    }
}
