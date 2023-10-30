package problem_1725;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] heights = new long[N];
        for (int i = 0; i < N; i++) heights[i] = scanner.nextLong();
        long answer = main.solution(N, heights);
        System.out.println(answer);
    }

    public long solution(int N, long[] heights) {
        long answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {

            if (stack.isEmpty() || heights[stack.peek()] <= heights[i]) {
                stack.push(i);
            } else {
                int j = 0;

                while (stack.size() > 0 && heights[i] < heights[stack.peek()]) {
                    int idx = stack.pop();
                    long size = heights[idx] * (j + 1);
                    answer = Math.max(answer, size);
                    j++;
                }

                stack.push(i);
            }
        }


        return answer;
    }
}
