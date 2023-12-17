package problem_4949;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        StringBuilder answer = new StringBuilder();
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if (str.length() == 1 && str.charAt(0) == '.') {
                break;
            }
            answer.append(main.isBalanced(str)).append("\n");
        }
        System.out.println(answer);
    }

    public String isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']') {
                if (stack.isEmpty()) {
                    return "no";
                }

                char popped = stack.pop();

                if (ch == ')' && popped != '(') return "no";
                else if (ch == ']' && popped != '[') return "no";

            }
        }

        return stack.size() == 0 ? "yes" : "no";
    }
}
