package array.problem_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = scanner.nextInt();
        }

        int[] result = solution(N, input);
        for (int x : result) {
            System.out.print(x + " ");
        }

    }

    public static int[] solution(int N, int[] input) {
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if (input[i] < input[j]) rank++;
                result[i] = rank;
            }
        }

        return result;
    }
}
