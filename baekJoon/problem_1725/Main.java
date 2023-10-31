package problem_1725;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] heights = new long[N + 2];
        for (int i = 1; i <= N; i++) heights[i] = scanner.nextLong();
        long answer = main.solution(N, heights);
        System.out.println(answer);
    }

    public long solution(int N, long[] heights) {
        long answer = 0;

        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        for (int i = 1; i < N + 2; i++) {

            while (stack.size() > 0) {
                int top = stack.peek();
                if (heights[top] <= heights[i]) break;
                stack.pop();
                long size = heights[top] * (i - stack.peek() - 1);
                answer = Math.max(answer, size);
            }

            stack.push(i);
        }


        return answer;
    }
}
