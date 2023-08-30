package Array.problem_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] input = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                input[i][j] = scanner.nextInt();
            }
        }
        int result = main.solution(M, N, input);
        System.out.println(result);
    }

    public int solution(int M, int N, int[][] input) {
        int result = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) continue;
                boolean flag = true;
                for (int k = 0; k < M; k++) {
                    int myRank = findRank(input[k], i);
                    int otherRank = findRank(input[k], j);
                    if (otherRank <= myRank) {
                        flag = false;
                        break;
                    }
                }

                if (flag) result++;
            }
        }

        return result;
    }

    private int findRank(int[] input, int studentNumber) {
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == studentNumber) index = i;
        }
        return index;
    }
}
