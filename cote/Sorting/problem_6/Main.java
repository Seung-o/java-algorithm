package Sorting.problem_6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = scanner.nextInt();
        }

        int[] result = main.solution(N, input);
        for (int x : result) {
            System.out.print(x + " ");
        }

    }

    public int[] solution(int N, int[] input) {
        int[] result = new int[2];
        int[] heights = Arrays.copyOf(input, N);
        Arrays.sort(input);

        int idx = 0;

        for (int i = 0; i < N; i++) {
            if (heights[i] != input[i]) {
                result[idx++] = i + 1;
            }
        }

        return result;
    }
}
