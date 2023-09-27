package DFS.problem_4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int N, M;
    public static int answer = Integer.MAX_VALUE;

    public static int[] coins, check;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        check = new int[N];
        coins = new int[N];
        for (int i = 0; i < N; i++) coins[i] = scanner.nextInt();
        Arrays.sort(coins);
        M = scanner.nextInt();
        main.solution(0);
        System.out.println(answer);
    }

    public void solution(int sum) {

        int usedCount = Arrays.stream(check).sum();

        if (usedCount >= answer) return;

        if (sum == M) {
            answer = Math.min(answer, usedCount);
        } else {
            for (int i = N - 1; i >= 0; i--) {
                if (sum + coins[i] <= M) {
                    check[i] += 1;
                    solution(sum + coins[i]);
                    check[i] -= 1;
                }
            }
        }
    }
}
