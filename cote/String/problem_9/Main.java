package String.problem_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int answer = solution(input);
        System.out.println(answer);
    }

    public static int solution(String input) {
        String intString = input.replaceAll("[^0-9]", "");
        return Integer.parseInt(intString);
    }
}
