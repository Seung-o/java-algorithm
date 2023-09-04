package TwoPointers.problem_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = scanner.nextInt();
        }
        int result = main.solution(N, M, input);
        System.out.println(result);
    }

    public int solution(int N, int M, int[] input) {
        int count = 0;
        int lt = 0, rt = 1;
        int sum = input[lt] + input[rt];

        while (lt < N - 1 && rt < N - 1) {
            if (sum == M) {
                count++;
                sum -= input[lt++];
            } else if (sum > M) {
                sum -= input[lt++];
            } else {
                sum += input[++rt];
            }
        }

        return count;
    }
}
