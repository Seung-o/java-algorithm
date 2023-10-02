package stack.problem_5;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int result = main.solution(input);
        System.out.println(result);
    }

    public int solution(String input) {
        char[] charArr = input.toCharArray();
        int result = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < charArr.length; i++) {

            char current = charArr[i];

            if (stack.isEmpty()) {
                stack.push(current);
                continue;
            }


            if (charArr[i - 1] == '(' && current == ')') {
                stack.pop();
                result += stack.size();
            } else if (current == ')') {
                stack.pop();
                result += 1;
            } else {
                stack.push(current);
            }

        }


        return result;
    }
}
