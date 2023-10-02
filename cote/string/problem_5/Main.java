package string.problem_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String answer = solution(input);
        System.out.println(answer);
    }

    public static String solution(String input) {
        char[] charArr = input.toCharArray();
        int lt = 0, rt = charArr.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(charArr[lt])) lt++;
            else if (!Character.isAlphabetic(charArr[rt])) rt--;
            else {
                char tmp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = tmp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(charArr);
    }

}