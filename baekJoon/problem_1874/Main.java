package problem_1874;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static int[] check;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) input[i] = scanner.nextInt();
        System.out.print(main.solution(N, input));

    }

    public String solution(int N, int[] input) {

        StringBuilder answer = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        answer.append("+").append("\n");

        int idx = 0, num = 2;

        while (idx < N && num <= N + 1) {
            int top = stack.peek();

            while (top == input[idx]) {
                stack.pop();
                answer.append("-").append("\n");
                idx++;

                if (idx >= N || stack.isEmpty()) break;
                else top = stack.peek();
            }

            if (idx < N) {
                stack.push(num);
                answer.append("+").append("\n");
                num++;
            }
        }

        if (stack.isEmpty()) {
            return answer.toString();
        } else {
            return "NO";
        }

    }
}
