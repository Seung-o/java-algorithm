package stack.feature_development;

import java.util.Stack;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();

        int[] mem = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            int remained = 100 - progresses[i];
            if (remained % speeds[i] == 0) {
                mem[i] = remained / speeds[i];
            } else {
                mem[i] = (remained / speeds[i]) + 1;
            }
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < mem.length; i++) {
            if (i == 0 || max < mem[i]) {
                stack.push(1);
            } else {
                int e = stack.pop();
                stack.push(e + 1);
            }

            max = Math.max(max, mem[i]);
        }

        int[] answer = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}