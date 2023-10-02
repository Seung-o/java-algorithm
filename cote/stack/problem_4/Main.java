package stack.problem_4;

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

        Stack<String> stack = new Stack<>();

        for (char ch : input.toCharArray()) {


            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                int calculated = 0;

                if (ch == '+') calculated = num1 + num2;
                else if (ch == '-') calculated = num2 - num1;
                else if (ch == '*') calculated = num1 * num2;
                else calculated = num2 / num1;

                stack.push(String.valueOf(calculated));
            } else stack.push(String.valueOf(ch));

        }


        return Integer.parseInt(stack.peek());
    }
}
