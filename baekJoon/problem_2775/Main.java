package problem_2775;

import java.util.Scanner;

public class Main {

    public static int[][] mem = new int[15][15];

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(main.solution(k, n));
        }
    }

    public int solution(int k, int n) {

        if (mem[n][k] != 0) return mem[n][k];

        if (k == 0) {
            return n;
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += solution(k - 1, i);
            }
            mem[n][k] = sum;
            return sum;
        }
    }
}
