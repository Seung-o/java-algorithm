package Array.problem_10;

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
        int count = 0;

        for (int i = 0; i < N; i++) {
            int top, bottom, left, right;
            for (int j = 0; j < N; j++) {
                int me = input[i][j];


                top = i == 0 ? 0 : input[i - 1][j];
                bottom = i == N - 1 ? 0 : input[i + 1][j];
                left = j == 0 ? 0 : input[i][j - 1];
                right = j == N - 1 ? 0 : input[i][j + 1];

                if ((me > top) && (me > bottom) && (me > left) && (me > right)) count++;
            }
        }

        return count;
    }
}
