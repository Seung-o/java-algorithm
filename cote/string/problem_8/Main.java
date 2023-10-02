package string.problem_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String answer = solution(input);
        System.out.println(answer);
    }

    public static String solution(String input) {
        String str = input.replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(reversed)) return "YES";

        return "NO";
    }
}
