package problem_15684;

import java.util.Scanner;


public class Main {

    public static int[][] ladder;
    public static int N, M, H, answer;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        H = scanner.nextInt();

        ladder = new int[H + 2][N + 2];
        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            ladder[a][b] = 1;
        }
        main.solution();
    }

    public void solution() {

        answer = Integer.MAX_VALUE;

        for (int i = 0; i <= 3; i++) {
            DFS(0, i, 1);
        }

        System.out.println(-1);
    }

    public void DFS(int level, int maxH, int col) {
        if (level > maxH) return;

        if (isValidLadder()) {
            answer = Math.min(answer, level);
            System.out.println(answer);
            System.exit(0);
            return;
        }

        for (int i = col; i <= H; i++) {
            for (int j = 1; j <= N; j++) {
                if (ladder[i][j] == 0 && ladder[i][j - 1] == 0 && ladder[i][j + 1] == 0) {
                    ladder[i][j] = 1;
                    DFS(level + 1, maxH, i);
                    ladder[i][j] = 0;
                }
            }
        }

    }

    public boolean isValidLadder() {
        for (int i = 1; i <= N; i++) {
            int start = i;

            for (int j = 1; j <= H; j++) {
                if (start < N && ladder[j][start] == 1) {
                    start++;
                } else if (start > 1 && ladder[j][start - 1] == 1) {
                    start--;
                }
            }

            if (start != i) return false;
        }

        return true;
    }
}
