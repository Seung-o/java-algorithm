package problem_10818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int input = scanner.nextInt();
            if (input < min) min = input;
            if (input > max) max = input;
        }

        System.out.println(min + " " + max);
    }
}
