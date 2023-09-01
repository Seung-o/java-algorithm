package problem_11654;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int result = main.solution(input);
        System.out.println(result);
    }

    public int solution(String input) {
        return input.charAt(0);
    }
}
