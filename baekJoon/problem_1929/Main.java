package problem_1929;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int[] che = new int[N + 1];

        che[0] = 1;
        che[1] = 1;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (che[i] == 0) {
                for (int j = i + 1; j <= N; j++) {
                    if (che[j] == 0 && j % i == 0) {
                        che[j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i <= N; i++) {
            if (che[i] == 0 && i >= M) {
                System.out.println(i);
            }
        }
    }
}
