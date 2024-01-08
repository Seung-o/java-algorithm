package problem_2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int[] dp;

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        dp = new int[N + 1];

        int[] stair = new int[N + 1];
        for (int i = 1; i <= N; i++) stair[i] = Integer.parseInt(br.readLine());

        if (N <= 1) {
            System.out.println(stair[1]);
            System.exit(0);
        }
        System.out.println(main.solution(N, stair));
    }

    public int solution(int N, int[] stair) {
        dp[0] = 0;
        dp[1] = stair[1];
        dp[2] = stair[1] + stair[2];

        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 3] + stair[i - 1], dp[i - 2]) + stair[i];
        }


        return dp[N];
    }
}
