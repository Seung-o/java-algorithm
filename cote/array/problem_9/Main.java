package array.problem_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] input = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        int result = solution(N, input);
        System.out.println(result);

    }

    public static int solution(int N, int[][] input) {
        int max = 0;

        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += input[i][j];
                if (sum > max) max = sum;
            }
        }

        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += input[j][i];
                if (sum > max) max = sum;
            }
        }

        int diagonalSum = calcDiagonalSum(input);
        if (diagonalSum > max) max = diagonalSum;


        int reverseDiagonalSum = calcReverseDiagonalSum(input);
        if (reverseDiagonalSum > max) max = reverseDiagonalSum;

        return max;
    }

    private static int calcDiagonalSum(int[][] input) {
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            sum += input[i][i];
        }

        return sum;
    }

    private static int calcReverseDiagonalSum(int[][] input) {
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            sum += input[i][input.length - i - 1];
        }

        return sum;
    }
}
