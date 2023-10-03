package stack.parenthesis;

import java.util.Stack;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                if (c == '(') stack.add(c);
                else {
                    answer = false;
                    break;
                }
            } else {
                if (c == '(') stack.add(c);
                else stack.pop();
            }
        }

        if (!stack.isEmpty()) answer = false;

        return answer;
    }
}