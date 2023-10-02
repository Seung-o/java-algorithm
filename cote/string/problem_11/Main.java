package string.problem_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String result = solution(input);
        System.out.println(result);
    }

    public static String solution(String input) {
        StringBuilder answer = new StringBuilder();
        int count = 0;
        char temp = input.toCharArray()[0];
        for (char c : input.toCharArray()) {
            if (temp == c) {
                count++;
            } else {
                answer.append(temp);
                if (count > 1) answer.append(count);
                temp = c;
                count = 1;
            }
        }

        answer.append(temp);
        if (count > 1) answer.append(count);

        return answer.toString();
    }
}
