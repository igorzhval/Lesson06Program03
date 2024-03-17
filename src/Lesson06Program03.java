import java.util.Scanner;

public class Lesson06Program03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість рядків (M): ");
        int M = scanner.nextInt();
        System.out.print("Введіть кількість стовпців (N): ");
        int N = scanner.nextInt();
        int[][] matrix = new int[M][N];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int[][] secondMatrix = new int[N][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                secondMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Транспонована матриця (перший масив):");
        printMatrix(matrix);
        System.out.println("Транспонована матриця (другий масив):");
        printMatrix(secondMatrix);
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}