package problem_10093;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        solution(A, B);
    }

    public static void solution(long A, long B) {
        long min = Math.min(A, B);
        long max = Math.max(A, B);

        if (min == max) {
            System.out.println(0);
            return;
        }

        long N = max - min - 1;

        System.out.println(N);

        for (long i = min + 1; i < max; i++) {
            System.out.print(i + " ");
        }
    }
}
