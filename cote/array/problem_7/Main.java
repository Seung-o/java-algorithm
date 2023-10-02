package array.problem_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = scanner.nextInt();
        }
        int result = solution(input);
        System.out.println(result);
    }

    public static int solution(int[] input) {
        int total = 0;
        int score = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1) {
                if (i != 0 && input[i - 1] == 0) score = 0;

                score++;
                total += score;
            }
        }

        return total;
    }
}
