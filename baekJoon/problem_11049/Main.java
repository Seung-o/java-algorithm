package problem_11049;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int min = Integer.MAX_VALUE;

        int[] matrix = new int[N + 1];
        for (int i = 0; i < N; i++) {
            matrix[i] = scanner.nextInt();
            int temp = scanner.nextInt();
            if (i == N - 1) {
                matrix[i + 1] = temp;
            }
        }

        min = calcMatrix(matrix, min);
        System.out.println(min);

    }

    private static int calcMatrix(int[] matrix, int result) {

        if (matrix.length == 3) {
            return matrix[0] * matrix[1] * matrix[2];
        }

        for (int i = 0; i < matrix.length - 2; i++) {
            int[] tempMatrix = new int[matrix.length - 1];
            System.arraycopy(matrix, 0, tempMatrix, 0, i);
            tempMatrix[i] = matrix[i] * matrix[i + 1] * matrix[i + 2];
            System.arraycopy(matrix, i + 3, tempMatrix, i + 1, matrix.length - i - 3);
            int tempResult = matrix[i] * matrix[i + 1] * matrix[i + 2] + calcMatrix(tempMatrix, result);
            System.out.println("tempResult: " + tempResult);
            if (result > tempResult) {
                result = tempResult;
            }
        }

        return result;
    }

    private static void printMatrix(int[] matrix) {
        for (int j : matrix) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
