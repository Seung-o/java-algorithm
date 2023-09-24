package Sorting.problem_7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] input = new int[N][2];
        for (int i = 0; i < N; i++) {
            input[i][0] = scanner.nextInt();
            input[i][1] = scanner.nextInt();
        }
        int[][] result = main.solution(N, input);
        for (int[] x : result) {
            System.out.println(x[0] + " " + x[1]);
        }
    }

    public int[][] solution(int N, int[][] pointers) {
        Arrays.sort(pointers, (pointer1, pointer2) -> {
            int deltaX = pointer1[0] - pointer2[0];
            if (deltaX == 0) return pointer1[1] - pointer2[1];
            return deltaX;
        });
        return pointers;
    }
}
