package problem_1018;

import java.util.Scanner;

public class Main {

    public static int N, M;
    public static char[][] board;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String str = scanner.next();
            for (int j = 0; j < M; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        int answer = main.solution();
        System.out.println(answer);
    }

    public int solution() {

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int countForBlack = countChangesForBlack(i, j);
                int countForWhite = countChangesForWhite(i, j);

                answer = Math.min(answer, Math.min(countForBlack, countForWhite));
            }
        }

        return answer;
    }

    public int countChangesForBlack(int startX, int startY) {
        int count = 0;

        for (int i = startX; i < startX + 8; i++) {
            for (int j = startY; j < startY + 8; j++) {
                char expected = (i + j) % 2 == 0 ? 'B' : 'W';
                if (board[i][j] != expected) count++;
            }
        }

        return count;
    }

    public int countChangesForWhite(int startX, int startY) {
        int count = 0;

        for (int i = startX; i < startX + 8; i++) {
            for (int j = startY; j < startY + 8; j++) {
                char expected = (i + j) % 2 == 0 ? 'W' : 'B';
                if (board[i][j] != expected) count++;
            }
        }

        return count;
    }
}
