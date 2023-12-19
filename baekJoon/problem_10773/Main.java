package problem_10773;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        Stack<Long> stack = new Stack<>();

        for (int i = 0; i < K; i++) {
            long n = scanner.nextLong();
            if (n == 0) stack.pop();
            else stack.push(n);
        }

        if (stack.isEmpty()) {
            System.out.println(0);
            System.exit(0);
        }

        long sum = 0;
        for (long x : stack) sum += x;

        System.out.println(sum);
    }
}
