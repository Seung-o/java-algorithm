package Searching.problem_1;

import java.util.Arrays;
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
        int result = -1;
        Arrays.sort(input);

        int lt = 0;
        int rt = N - 1;

        while (rt >= lt) {
            int mid = (rt + lt) / 2;

            if (input[mid] == M) {
                result = mid + 1;
                break;
            }

            if (input[mid] > M) rt = mid - 1;
            else lt = mid + 1;

        }

        return result;
    }
}
