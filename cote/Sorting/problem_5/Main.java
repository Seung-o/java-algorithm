package Sorting.problem_5;

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
        String result = main.solution(N, input);
        System.out.println(result);
    }

    public String solution(int N, int[] input) {
        /**
         * I know it is better to use hashMap.
         * But in this problem, we will use sorting method.
         */
        String result = "U";
        Arrays.sort(input); // O(n) = nlogn

        for (int i = 0; i < N - 1; i++) {
            if (input[i] == input[i + 1]) {
                result = "D";
                break;
            }
        }

        return result;
    }
}
