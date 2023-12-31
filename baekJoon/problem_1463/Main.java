package problem_1463;

import java.util.Scanner;

public class Main {
    static int[] dp;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        dp = new int[N + 1];
        int answer = main.solution(N);
        System.out.println(answer);
    }

    public int solution(int N) {

        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            if (i % 6 == 0) {
                dp[i] = Math.min(dp[i - 1], Math.min(dp[i / 3], dp[i / 2])) + 1;
            } else if (i % 3 == 0) {
                dp[i] = Math.min(dp[i - 1], dp[i / 3]) + 1;
            } else if (i % 2 == 0) {
                dp[i] = Math.min(dp[i - 1], dp[i / 2]) + 1;
            } else {
                dp[i] = dp[i - 1] + 1;
            }
        }

        return dp[N];
    }
}
