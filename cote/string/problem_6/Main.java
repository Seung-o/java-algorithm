package string.problem_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String answer = solution(input);
        System.out.println(answer);
    }

    public static String solution(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArr = input.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            char ch = charArr[i];
            if (stringBuilder.indexOf(Character.toString(ch)) == -1) {
                stringBuilder.append(ch);
            }
        }

        return stringBuilder.toString();
    }
}