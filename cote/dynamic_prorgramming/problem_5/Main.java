package dynamic_prorgramming.problem_5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] dy;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] coins = new int[N];
        for (int i = 0; i < N; i++) coins[i] = scanner.nextInt();
        int M = scanner.nextInt();
        dy = new int[M + 1];
        int answer = main.solution(N, M, coins);
        System.out.println(answer);
    }

    public int solution(int N, int M, int[] coins) {

        Arrays.sort(coins);

        dy[0] = 0;
        dy[1] = 1;

        for (int i = 2; i <= M; i++) {
            dy[i] = M % coins[0] == 0 ? M / coins[0] : M / coins[0] + 1;
        }

        for (int i = 1; i < N; i++) {
            int curCoin = coins[i];
            for (int j = curCoin; j <= M; j++) {
                dy[j] = Math.min(dy[j - curCoin] + 1, dy[j]);
            }
        }

        return dy[M];
    }
}
