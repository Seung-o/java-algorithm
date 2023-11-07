package problem_15684;

import java.util.Scanner;


public class Main {

    public static int[][] ladder;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int H = scanner.nextInt();

        ladder = new int[H + 1][N + 1];
        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            ladder[a][b] = 1;
        }
        int answer = main.solution(N, M, H);
        System.out.println(answer);
    }

    public int solution(int N, int M, int H) {
        int answer = -1;

        return answer;
    }
}
