package problem_9935;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String bomb = scanner.next();
        String answer = main.solution(str, bomb);
        System.out.println(answer);
    }

    public String solution(String str, String bomb) {
        Stack<Character> stack = new Stack<>();
        int explodeLength = bomb.length();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));

            if (stack.size() >= explodeLength) {

                boolean isBomb = true;

                for (int index = 0; index < bomb.length(); index++) {
                    if (stack.get(stack.size() - bomb.length() + index) != bomb.charAt(index)) {
                        isBomb = false;
                        break;
                    }
                }

                if (isBomb) {
                    for (int k = 0; k < explodeLength; k++) stack.pop();
                }

            }
        }

        if (stack.isEmpty()) return "FRULA";

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : stack) stringBuilder.append(c);

        return stringBuilder.toString();
    }
}
