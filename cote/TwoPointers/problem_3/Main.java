package TwoPointers.problem_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = scanner.nextInt();
        }
        int result = main.solution(N, K, input);
        System.out.println(result);
    }

    public int solution(int N, int K, int[] input) {
        int sum = 0;

        for (int i = 0; i < K; i++) sum += input[i];

        int result = sum;

        for (int i = K; i < N; i++) {
            sum = sum + input[i] - input[i - K];
            if (sum > result) result = sum;
        }

        return result;
    }
}
