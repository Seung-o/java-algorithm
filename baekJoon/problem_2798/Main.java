package problem_2798;

import java.util.Scanner;

public class Main {

    public static int N, M, answer = Integer.MAX_VALUE;
    public static int[] cards, check;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        cards = new int[N];
        check = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = scanner.nextInt();
        }

        main.DFS(-1, 0);
        System.out.println(answer);

    }

    public void DFS(int L, int sum) {
        if (L == 2) {
            if (sum <= M && Math.abs(M - answer) > Math.abs(M - sum)) {
                answer = sum;
            }
            if (answer == M) {
                System.out.println(answer);
                System.exit(0);
            }
        } else {
            for (int i = 0; i < N; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    DFS(L + 1, sum + cards[i]);
                    check[i] = 0;
                }
            }
        }
    }
}
