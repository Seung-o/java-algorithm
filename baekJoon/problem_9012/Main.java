package problem_9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String[] input = new String[T];
        for (int i = 0; i < T; i++) input[i] = scanner.next();
        String[] answer = main.solution(T, input);
        for (String s : answer) System.out.println(s);
    }

    public String[] solution(int T, String[] input) {
        String[] answer = new String[T];

        for (int i = 0; i < T; i++) {
            String cur = input[i];
            Stack<Character> stack = new Stack<>();

            for (char ch : cur.toCharArray()) {
                if (ch == '(') stack.push(ch);
                else {
                    if (stack.isEmpty()) {
                        stack.push('-');
                        break;
                    }
                    stack.pop();
                }
            }

            answer[i] = stack.isEmpty() ? "YES" : "NO";
        }

        return answer;
    }
}
