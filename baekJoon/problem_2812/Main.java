package problem_2812;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String input = scanner.next();
        String answer = main.solution(N, K, input);
        System.out.println(answer);
    }

    public String solution(int N, int K, String input) {
        Stack<Integer> stack = new Stack<>();
        int removed = 0;

        for (int i = 0; i < N; i++) {
            int num = Character.getNumericValue(input.charAt(i));

            if (stack.isEmpty() || removed == K) {
                stack.push(num);
                continue;
            }

            if (stack.peek() < num) {
                while (true) {

                    if (stack.isEmpty() || removed == K) break;

                    int cur = stack.pop();
                    if (cur >= num) {
                        stack.push(cur);
                        break;
                    }
                    removed++;
                }

                stack.push(num);
            } else {
                stack.push(num);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < N - K; i++) {
            stringBuilder.append(stack.get(i));
        }

        return stringBuilder.toString();
    }
}
