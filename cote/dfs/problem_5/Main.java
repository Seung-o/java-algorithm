package dfs.problem_5;

import java.util.Scanner;

public class Main {

    public static int n, r;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        r = scanner.nextInt();
        int[][] mem = new int[n + 1][r + 1];
        int answer = main.solution(n, r, mem);
        System.out.println(answer);
    }

    public int solution(int n, int r, int[][] mem) {

        if (n == r) return 1;

        if (mem[n][r] != 0) return mem[n][r];

        if (r == 0) {
            return 1;
        } else {
            int result = solution(n - 1, r - 1, mem) + solution(n - 1, r, mem);
            mem[n][r] = result;
            return result;
        }
    }
}
