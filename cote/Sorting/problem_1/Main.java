package Sorting.problem_1;

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
        for (int i = 0; i < N - 1; i++) {

            int selectedIdx = i;

            for (int j = i; j < N; j++) {
                if (input[selectedIdx] > input[j]) {
                    selectedIdx = j;
                }
            }

            int tmp = input[i];
            input[i] = input[selectedIdx];
            input[selectedIdx] = tmp;
        }

        return input;
    }
}
