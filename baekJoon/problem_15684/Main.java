package problem_15684;

import java.util.Scanner;


public class Main {

    public static int[][] ladder;
    public static int N, M, H

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        H = scanner.nextInt();

        ladder = new int[H + 1][N + 1];
        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            ladder[a][b] = 1;
        }
        int answer = main.solution();
        System.out.println(answer);
    }

    public int solution() {
        int answer = -1;

        return answer;
    }
}
