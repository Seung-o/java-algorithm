package stack.problem_2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String result = main.solution(input);
        System.out.println(result);
    }

    public String solution(String input) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        for (char ch : input.toCharArray()) {
            stack.push(ch);

            if (ch == ')') {
                while (true) {
                    Character removed = stack.pop();
                    if (removed == '(') break;
                }
            }
        }

        for (char ch : stack) {
            result += ch;
        }

        return result;
    }
}
