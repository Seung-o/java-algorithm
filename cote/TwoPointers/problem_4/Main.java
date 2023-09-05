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
        int sum = 0;
        int count = 0;
        int lt = 0;

        for (int rt = 0; rt < N; rt++) {
            sum += input[rt];
            if (sum == M) count++;
            while (sum >= M) {
                sum -= input[lt++];
                if (sum == M) count++;
            }
        }

        return count;
    }
}
